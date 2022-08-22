package com.lxf.cloudalibabaprovider9003.controller;


import com.lxf.cloudalibabacommons.entity.JsonResult;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class DataController {

    @Value("${server.port}")
    private String serverPort;

    //模仿数据库存储数据
    public static HashMap<Integer,String> hashMap = new HashMap<>();
    static {
        hashMap.put(1,"鼠标");
        hashMap.put(2,"键盘");
        hashMap.put(3,"耳机");
    }

    @GetMapping("info/{id}")
    public JsonResult<String> msbSql(@PathVariable("id") Integer id){
        JsonResult<String> result = new JsonResult(200,hashMap.get(id));
        return result;
    }
}
