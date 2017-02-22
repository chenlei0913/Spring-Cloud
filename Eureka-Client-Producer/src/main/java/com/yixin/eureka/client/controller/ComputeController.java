package com.yixin.eureka.client.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chenlei01 on 2017/2/17.
 */
@RestController
public class ComputeController {

    @Autowired
    private DiscoveryClient client;

    private Logger logger = LoggerFactory.getLogger(ComputeController.class);

    @RequestMapping("/add")
    public Integer add(@RequestParam  Integer a, @RequestParam Integer b) {
        ServiceInstance instance= client.getLocalServiceInstance();
        Integer r = a + b;
        logger.info("/add, host:" + instance.getHost() + ", service_id:" + instance.getServiceId() + ", result:" + r);
        return r;
    }

}
