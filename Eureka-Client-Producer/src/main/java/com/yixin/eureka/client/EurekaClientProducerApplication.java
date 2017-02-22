package com.yixin.eureka.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by chenlei01 on 2017/2/17.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class EurekaClientProducerApplication {

    private static Logger logger = LoggerFactory.getLogger(EurekaClientProducerApplication.class);

    public static void main(String[] args) {
        logger.info("Eureka Client Application Start...");
        SpringApplication.run(EurekaClientProducerApplication.class,args);
        logger.info("Eureka Client Application Start Success!!!");
    }
}
