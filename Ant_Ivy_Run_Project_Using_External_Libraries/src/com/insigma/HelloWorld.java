package com.insigma;

import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloWorld {

    private final static Logger logger =  LoggerFactory.getLogger(HelloWorld.class);
    
    public static void main(String[] args) {
        
        String id = UUID.randomUUID().toString();
        System.out.println("UUID = " + id);
        logger.info("hello world");
    }

}
