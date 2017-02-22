package com.yixin.eureka.client.service.hystrix;

import com.yixin.eureka.client.service.ComputeService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by chenlei01 on 2017/2/22.
 */
@Service
public class ComputeServiceHystrix implements ComputeService {


    @Override
    public Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b) {
        return -99999 ;
    }
}
