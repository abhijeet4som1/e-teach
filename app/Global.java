
import java.util.concurrent.TimeUnit;

import javax.inject.Inject;

import org.springframework.context.ApplicationContext;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.iteach.services.EmailSenderService;
import com.iteach.utility.ITeachUtility;

import play.Application;
import play.ApplicationLoader.Context;
import play.GlobalSettings;
import play.db.jpa.JPA;
import play.libs.Akka;
import play.libs.F;
import play.libs.F.Promise;
import scala.concurrent.duration.Duration;

/**
 * Play global setting class.
 * 
 * @author Abhijeet
 *
 */
public class Global extends GlobalSettings {

	private static boolean isJobScheduled = false;
	private static final Injector INJECTOR = createInjector();

	@Override
	public void onStart(Application app) {
		super.onStart(app);
		schedule();

	}

	@Override
	public void onStop(Application app) {
		super.onStop(app);
	}

	private static Injector createInjector() {
		return Guice.createInjector();
	}

	private void schedule() {
		try {
			if (!isJobScheduled) {
				isJobScheduled = true;
				// initial duration 0
				// execute after each seconds mentioned in conf file.
				Akka.system().scheduler().schedule(Duration.create(0, TimeUnit.SECONDS),
						Duration.create(Integer.valueOf(ITeachUtility.getPropValue("schedulerTimeSecond", false)),
								TimeUnit.SECONDS),
						new Runnable() {
							public void run() {
								try {
									JPA.withTransaction(new F.Function0<F.Promise<String>>() {

										@Override
										public Promise<String> apply() throws Throwable {
											EmailSenderService emailSenderUtility = INJECTOR.getInstance(EmailSenderService.class);
											// executing the send email functionality
											emailSenderUtility.sendEmail();
											return null;
										}
									});
								} catch (Throwable e) {
									e.printStackTrace();
								}
							}
						}, Akka.system().dispatcher());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
