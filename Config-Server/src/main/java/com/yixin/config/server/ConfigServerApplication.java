package com.yixin.config.server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.web.bind.annotation.RestController;
import sun.security.krb5.Config;

/**
 * Created by chenlei01 on 2017/2/15.
 */
@SpringBootApplication
@RestController
@EnableConfigServer
public class ConfigServerApplication {

    private static Logger logger = LoggerFactory.getLogger(ConfigServerApplication.class);

    @Value("${validMessage:failure!}")
    private String message;

    public String valid() {
        return message;
    }

    public static void main(String[] args) {
        logger.info("Config Server Application Start....");
        SpringApplication.run(ConfigServerApplication.class, args);
        logger.info("Config Server Application Start Success!!1");
    }
}
