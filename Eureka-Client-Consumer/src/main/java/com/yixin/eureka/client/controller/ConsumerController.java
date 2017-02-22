package com.yixin.eureka.client.controller;

import com.yixin.eureka.client.service.ComputeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by chenlei01 on 2017/2/21.
 */
@RestController
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private ComputeService computeService;

    @RequestMapping("/add")
    public String add(String a,String b) {
        return computeService.add(a, b);
    }
}
