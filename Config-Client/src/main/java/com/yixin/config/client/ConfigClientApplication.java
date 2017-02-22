package com.yixin.config.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chenlei01 on 2017/2/15.
 */
@SpringBootApplication
@RestController
@RefreshScope
public class ConfigClientApplication {
    private static Logger logger = LoggerFactory.getLogger(ConfigClientApplication.class);

    @Value("${validMessage:failure}")
    private String message;

    @RequestMapping("/")
    public String valid() {
        return message;
    }

    public static void main(String[] args) {
        logger.info("start");
        SpringApplication.run(ConfigClientApplication.class, args);
        logger.info("start success!!!");
    }
}
