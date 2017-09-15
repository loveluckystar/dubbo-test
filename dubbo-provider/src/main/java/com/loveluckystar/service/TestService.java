package com.loveluckystar.service;

import com.alibaba.dubbo.config.annotation.Service;

/**
 * Created by mxy on 2017/9/13.
 */
@Service(version = "1.0.0")
public class TestService implements ITestService {
    @Override
    public String testStr() {
        return "hahaha~";
    }
}
