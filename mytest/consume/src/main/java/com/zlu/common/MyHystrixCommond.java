package com.zlu.common;

import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;

import java.util.concurrent.Executor;

/**
 * @description: 11
 * @author: zhanglu
 * @create: 2020-05-14 17:08
 */
public class MyHystrixCommond extends HystrixCommand<String> {
    private final String name;

    protected MyHystrixCommond(String name) {
        super(HystrixCommandGroupKey.Factory.asKey("MyGroup"));
        this.name = name;
    }

    @Override
    protected String run() throws Exception {

        try {
            Thread.sleep(1000 * 10);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return this.name + ":" + Thread.currentThread().getName();
    }

    @Override
    protected String getFallback() {
        return "失败了";
    }
}
