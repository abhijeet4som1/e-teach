package com.iteach.services;

import java.util.Calendar;
import java.util.List;

import javax.inject.Inject;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;
import org.springframework.stereotype.Service;

import com.iteach.dao.EmailsDao;
import com.iteach.entity.Emails;
import com.iteach.exception.ITeachException;
import com.iteach.utility.ITeachUtility;

@Service
public class EmailSenderService {

	@Inject
	private EmailsDao<Emails> emailsDao;

	public void sendEmail() {
		try {
			List<Emails> emails = emailsDao.getEmailsByStatus('N');
			if (!ITeachUtility.isEmptyList(emails)) {
				for (Emails emailToSend : emails) {
					try {
						HtmlEmail email = new HtmlEmail();
						email.setHostName(ITeachUtility.getPropValue("hostName", true));
						email.setSmtpPort(Integer.parseInt(ITeachUtility.getPropValue("portNumber", true)));
						email.setAuthenticator(new DefaultAuthenticator(ITeachUtility.getPropValue("userName", true),
								ITeachUtility.getPropValue("password", true)));
						email.addTo(emailToSend.getEmailTo());
						email.setFrom(emailToSend.getEmailFrom(), emailToSend.getEmailFromName());
						email.setSubject(emailToSend.getEmailSub());
						String emailContent = emailToSend.getEmailBody();
						/*
						 * if(StringUtils.isNotBlank(emailToSend.
						 * getEmailAttachments ())){ Set<String>
						 * attachments=ITeachUtility.getStringAsSet(emailToSend.
						 * getEmailAttachments(), ","); }
						 */
						// set the html message
						email.setHtmlMsg("<html>" + emailContent + "</html>");
						email.send();
						emailToSend.setSendAttempt(
								emailToSend.getSendAttempt() == null ? 1 : (emailToSend.getSendAttempt() + 1));
						emailToSend.setEmailStatus('S');
						emailToSend.setSentOn(Calendar.getInstance().getTime());
						System.out.println("sent email to "+emailToSend.getEmailTo());
					} catch (EmailException e) {
						// if any exception then updating the attempt.
						emailToSend.setSendAttempt(
								emailToSend.getSendAttempt() == null ? 1 : (emailToSend.getSendAttempt() + 1));
						e.printStackTrace();
					}
					emailsDao.updateEmails(emailToSend);
				}
			} else {
				System.out.println("No email to send.");
			}
		} catch (ITeachException ex) {
			ex.printStackTrace();
		}
	}

}
