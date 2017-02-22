package com.yixin.eureka.client.controller;

import com.yixin.eureka.client.service.ComputeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chenlei01 on 2017/2/21.
 */
@RestController
public class FeignConsumerController {

    @Autowired
    private ComputeService computeService;

    @RequestMapping("/add")
    public String add(Integer a,Integer b) {
        return computeService.add(a, b).toString();
    }

}
