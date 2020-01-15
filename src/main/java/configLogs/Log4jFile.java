package configLogs;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jFile {

	private static Logger logger = LogManager.getLogger(Log4jFile.class);

	public static void main(String[] args) {

		System.out.println("\n Log4j Hello \n");

		logger.info("This is a Information MSG");
		logger.error("This is an Error");
		logger.warn("Warning Message !!!!");
		logger.trace("WE ARE IN TRACE MSG!!!");
		
		logger.debug("This is a debug message");
        logger.info("This is an info message");
        logger.warn("This is a warn message");
        logger.error("This is an error message");
        logger.fatal("This is a fatal message");
        
		System.out.println("\n Message entered \n");
//		logger.log(01,"Its a Log message Entered into the Log file");
	}

}
