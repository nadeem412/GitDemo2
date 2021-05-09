package Academy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;


public class testinglog4j {
	public static Logger log = LogManager.getLogger(testinglog4j.class.getName());
	@Test
	public void checkinglog() {
		log.info("driver started");
		log.info("logged into the link");
		log.error("logged into the navigated link");
		log.fatal("sucessfully injected the elements");
		
		
	}

}
