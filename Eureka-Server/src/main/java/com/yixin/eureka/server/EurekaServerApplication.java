package com.yixin.eureka.server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chenlei01 on 2017/2/17.
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {
    private static Logger logger = LoggerFactory.getLogger(EurekaServerApplication.class);

    public static void main(String[] args) {
        logger.info("Eureka Server Application Start....");
        SpringApplication.run(EurekaServerApplication.class, args);
        logger.info("Eureka Server Application Start Success!!!");
    }

}
