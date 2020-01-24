package org.sms;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan({ "org.sms" })
public class App 
{
	
	private static final Logger LOG = LoggerFactory.getLogger(App.class);
	
    public static void main( String[] args )
    {
    	ApplicationContext ctx = SpringApplication.run(App.class, args);

		LOG.info("Test sms application is running..!");

		System.out.println("Test sms application is running..!");
    }
}
