package com.sassds;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

//使用@EnableDiscoveryClient注解修饰，该注解在服务启动的时候，可以触发服务注册的过程，向配置文件中指定的服务注册中心（Eureka-Server）的地址注册自己提供的服务。
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaServicesComputeApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServicesComputeApplication.class, args);
	}
}
