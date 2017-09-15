package com.loveluckystar.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.loveluckystar.service.ITestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mxy on 2017/9/13.
 */
@RestController
public class TestController {
    @Reference(version = "1.0.0")
    private ITestService testService;

    @GetMapping("/test")
    public Object test(){
        return testService.testStr();
    }
}
