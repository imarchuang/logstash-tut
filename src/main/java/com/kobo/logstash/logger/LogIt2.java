package com.kobo.logstash.logger;

public class LogIt2 extends ParentLog{

	public void logIt(){
		super.logIt();
		log.info("Log within impl class");
	}
	
}
