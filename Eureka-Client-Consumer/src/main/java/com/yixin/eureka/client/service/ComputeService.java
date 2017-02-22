package com.yixin.eureka.client.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by chenlei01 on 2017/2/21.
 */
@Service("computeService")
public class ComputeService {
    @Autowired
    private RestTemplate restTemplate;
    private Logger logger = LoggerFactory.getLogger(ComputeService.class);


    @HystrixCommand(fallbackMethod = "addMethodException")
    public String add(String a,String b) {
        Map<String, String> paramMap = new HashMap<String, String>();
        paramMap.put("a",a);
        paramMap.put("b",b);

        return restTemplate.getForEntity("http://COMPUTE-SERVICE/add?a={a}&b={b}", String.class, paramMap).getBody();

    }

    public String addMethodException(String a,String b) {
        logger.info("---------------------------error--------------------------");
        return "error";
    }

}
