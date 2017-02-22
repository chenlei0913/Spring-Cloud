package com.yixin.eureka.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


/**
 * Created by chenlei01 on 2017/2/21.
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableCircuitBreaker
public class EurekaClientConsumerApplication {

    private static Logger logger = LoggerFactory.getLogger(EurekaClientConsumerApplication.class);

    @Bean
    @LoadBalanced   //均衡负载
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        logger.info("Eureka Client Consumer Application Start...");
        SpringApplication.run(EurekaClientConsumerApplication.class, args);
        logger.info("Eureka Client Consumer Application Start Success!!!");

    }

}
