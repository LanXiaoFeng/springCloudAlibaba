package com.lxf.cloudalibabasentinelservice8401.controller;

import com.lxf.cloudalibabasentinelservice8401.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@RestController
@Component
public class FlowLimitController {

    @Autowired
    TestService testService;

    @GetMapping("/testA")
    public String testA(){
        return testService.common();
    }

    @GetMapping("/testB")
    public String testB(){
        return testService.common();
    }
}
