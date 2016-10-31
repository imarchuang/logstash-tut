package com.kobo.logstash;

import com.kobo.logstash.logger.LogIt;
import com.kobo.logstash.logger.LogIt2;
import com.kobo.logstash.logger.LogIt3;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        LogIt it = new LogIt();
        it.logIt();
        
        LogIt2 it2 = new LogIt2();
        it2.logIt();
        
        LogIt3 it3 = new LogIt3();
        it3.logIt();
        
    }
}
