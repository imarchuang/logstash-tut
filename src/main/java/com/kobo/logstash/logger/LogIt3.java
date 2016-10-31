package com.kobo.logstash.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogIt3 extends ParentLog{

	private static final Logger log = LoggerFactory.getLogger(LogIt3.class);
	public void logIt(){
		super.logIt();
		log.info("Log within impl class");
	}
	
	public void logItException(){
		log.error("Log within impl class");
	}
	
	public static void main(String[] args){
		log.info("Log within main() method");
		log.error("Log within impl class", new Exception("dummy"));
		ConsoleLoggerImpl.log(new Exception("dummy"));
	}
	
}
