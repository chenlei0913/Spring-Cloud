package com.yixin.eureka.client.service;

import com.yixin.eureka.client.service.hystrix.ComputeServiceHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by chenlei01 on 2017/2/21.
 */
@FeignClient(value = "compute-service",fallback = ComputeServiceHystrix.class)
public interface ComputeService {

    @RequestMapping("/add")
    Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b);
}
