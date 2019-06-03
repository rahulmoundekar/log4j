package com.log.app.client;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;


public class Test {

	// create logger class instance
	static Logger logger = Logger.getLogger(Test.class);

	public static void main(String[] args) {

		// to parse log.properties file
		BasicConfigurator.configure();

		// debug level
		logger.debug("debug log messages");
		logger.info("info log messages");
		logger.warn("Warn log messages");
		logger.error("error log messages");
	}

}
