package com.zlu.common;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * @description: 11
 * @author: zhanglu
 * @create: 2020-05-14 17:11
 */
public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //同步调用
//        MyHystrixCommond zlu = new MyHystrixCommond("zlu");
//        System.out.println(zlu.execute());

        Future<String> zlu = new MyHystrixCommond("zlu").queue();
        System.out.println(zlu.get());
    }
}
