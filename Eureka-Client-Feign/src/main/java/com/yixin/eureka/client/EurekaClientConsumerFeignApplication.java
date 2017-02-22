package com.yixin.eureka.client;

import com.sun.tracing.dtrace.ArgsAttributes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

import java.util.Stack;

/**
 * Created by chenlei01 on 2017/2/21.
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class EurekaClientConsumerFeignApplication {

    private static Logger logger = LoggerFactory.getLogger(EurekaClientConsumerFeignApplication.class);

    public static void main(String[] args) {
        logger.info("EureKa Client Consumer Feign Application Start...");
        SpringApplication.run(EurekaClientConsumerFeignApplication.class,args);
        logger.info("EureKa Client Consumer Feign Application Start Success!!!");

    }
}
