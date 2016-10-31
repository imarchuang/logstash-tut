package com.kobo.logstash.logger;

import java.io.PrintWriter;
import java.io.StringWriter;

public class ConsoleLoggerImpl {

	public static void log(Throwable innerException) {
		StringWriter sw = new StringWriter();
		innerException.printStackTrace(new PrintWriter(sw));
		System.out.println(sw.toString());
	}
	
}
