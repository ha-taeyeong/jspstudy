package batch;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class CronSchedulerListener implements ServletContextListener {
	
	// field
	CronScheduler cronScheduler;
	
	// constructor
	public CronSchedulerListener() { }
	
	// method
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("=====WEB SERVICE STOP!=====");
		try {
			cronScheduler.scheduler.clear();
			cronScheduler.scheduler.shutdown();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println("=====WEB SERVICE START!=====");
		cronScheduler = new CronScheduler("0 45 17 ? * TUE *", Top3StudentJob.class);
		cronScheduler.execute();

	}

}
