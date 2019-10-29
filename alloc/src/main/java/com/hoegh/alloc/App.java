package com.hoegh.alloc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	@SuppressWarnings("resource")
		ApplicationContext s = new AnnotationConfigApplicationContext(AppConfig.class);
    	Samsung s7 = s.getBean(Samsung.class);
    	s7.tress();
        
    }
}
