package demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.message.LoggerNameAwareMessage;

public class Log4jDemo {
	
	static Logger Logger = LogManager.getLogger(Log4jDemo.class);
	
	public static void main(String[] args) {
	
		System.out.println("Hello");
		
		Logger.info("This is info");
		Logger.error("This is error");
		Logger.warn("This is warning");
	}

}
