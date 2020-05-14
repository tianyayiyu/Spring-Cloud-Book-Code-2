package com.cxytiandi.feign_demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cxytiandi.feign_demo.auth.FeignBasicAuthRequestInterceptor;

import feign.Logger;
import feign.Request;
import feign.auth.BasicAuthRequestInterceptor;

@Configuration
public class FeignConfiguration {
	/**
	 * 日志级别
	 * 通过源码可以看到日志等级有4种，分别是：
	 * ·NONE：不输出日志。
	 * ·BASIC：只输出请求方法的URL和响应的状态码以及接口执行的时间。
	 * ·HEADERS：将BASIC信息和请求头信息输出。
	 * ·FULL：输出完整的请求信息。
	 * 
	 * @return
	 */
	@Bean
	Logger.Level feignLoggerLevel() {
		return Logger.Level.FULL;
	}

	@Bean
	public BasicAuthRequestInterceptor basicAuthRequestInterceptor() {
		System.out.println("**********************");
		return new BasicAuthRequestInterceptor("user", "password");
	}

	@Bean
	public FeignBasicAuthRequestInterceptor feignBasicAuthRequestInterceptor() {
		return new FeignBasicAuthRequestInterceptor();
	}

	@Bean
	public Request.Options options() {
		return new Request.Options(5000, 10000);
	}

}
