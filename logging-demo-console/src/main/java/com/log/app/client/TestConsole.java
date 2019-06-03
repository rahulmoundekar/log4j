package com.log.app.client;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class TestConsole {
	// create logger class instance
	static Logger logger = Logger.getLogger(TestConsole.class);

	public static void main(String[] args) {
		logger.debug("debug");

	}

}
