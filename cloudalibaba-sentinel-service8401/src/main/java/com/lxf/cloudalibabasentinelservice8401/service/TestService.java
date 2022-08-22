package com.lxf.cloudalibabasentinelservice8401.service;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @SentinelResource("common")
    public String common(){
        return "common";
    }
}
