package com.iteach.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * emails entity class
 * @author Abhijeet
 *
 */
@NamedQueries({
    @NamedQuery(name="Emails.findByStatus",
                query="SELECT e FROM Emails e where e.emailStatus= :emailStatus")
})
@Entity
@Table(name="emails")
public class Emails {
	 
	 @Id
	 @GeneratedValue(strategy=GenerationType.IDENTITY) 
	 @Column(name="email_id")
	 private Long emailId;
	 
	 @Column(name="email_to")
	 private String emailTo;
	 
	 @Column(name="email_from")
	 private String emailFrom;
	 
	 @Column(name="email_from_name")
	 private String emailFromName;
	 
	 @Column(name="email_sub")
	 private String emailSub;
	 
	 @Column(name="email_body")
	 private String emailBody;
	 
	 @Column(name="email_attachments")
	 private String emailAttachments;
	 
	 @Column(name="created_on")
	 private Date createdOn;
	 
	 @Column(name="created_by")
	 private String createdBy;
	 
	 @Column(name="send_attempt")
	 private Integer sendAttempt;
	 
	 @Column(name="email_status")
	 private Character emailStatus;
	 
	 @Column(name="sent_on")
	 private Date sentOn;

	public Long getEmailId() {
		return emailId;
	}

	public void setEmailId(Long emailId) {
		this.emailId = emailId;
	}

	public String getEmailTo() {
		return emailTo;
	}

	public void setEmailTo(String emailTo) {
		this.emailTo = emailTo;
	}

	public String getEmailFrom() {
		return emailFrom;
	}

	public void setEmailFrom(String emailFrom) {
		this.emailFrom = emailFrom;
	}
	
	public String getEmailFromName() {
		return emailFromName;
	}

	public void setEmailFromName(String emailFromName) {
		this.emailFromName = emailFromName;
	}

	public String getEmailSub() {
		return emailSub;
	}

	public void setEmailSub(String emailSub) {
		this.emailSub = emailSub;
	}

	public String getEmailBody() {
		return emailBody;
	}

	public void setEmailBody(String emailBody) {
		this.emailBody = emailBody;
	}

	public String getEmailAttachments() {
		return emailAttachments;
	}

	public void setEmailAttachments(String emailAttachments) {
		this.emailAttachments = emailAttachments;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Integer getSendAttempt() {
		return sendAttempt;
	}

	public void setSendAttempt(Integer sendAttempt) {
		this.sendAttempt = sendAttempt;
	}

	public Character getEmailStatus() {
		return emailStatus;
	}

	public void setEmailStatus(Character emailStatus) {
		this.emailStatus = emailStatus;
	}

	public Date getSentOn() {
		return sentOn;
	}

	public void setSentOn(Date sentOn) {
		this.sentOn = sentOn;
	}
}
