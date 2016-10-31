package com.kobo.logstash.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ParentLog extends AbstractLog{

	protected final Logger log = LoggerFactory.getLogger(this.getClass());
	
	public void logIt(){
		log.info("Log within parent class");
	}
	
}
