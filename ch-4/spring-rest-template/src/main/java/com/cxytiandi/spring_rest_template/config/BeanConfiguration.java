package com.cxytiandi.spring_rest_template.config;

import com.cxytiandi.spring_rest_template.annoation.MyLoadBalanced;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class BeanConfiguration {

	@Bean
	//@LoadBalanced
	@MyLoadBalanced
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

}
