package com.sassds;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

//开启服务发现的能力
@EnableDiscoveryClient
@SpringBootApplication
public class RibbonApplication {

	@Bean //定义REST客户端，RestTemplate实例
	@LoadBalanced
		//开启负债均衡的能力
	RestTemplate restTemplate() {
		return new RestTemplate();
	}

	public static void main(String[] args) {
		SpringApplication.run(RibbonApplication.class, args);
	}
}
