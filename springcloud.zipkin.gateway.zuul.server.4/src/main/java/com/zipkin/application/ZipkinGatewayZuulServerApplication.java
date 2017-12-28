package com.zipkin.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableEurekaClient //开启客户端
@EnableZuulProxy //开启zuul路由代理能力
public class ZipkinGatewayZuulServerApplication {
	//开启服务能力
	public static void main(String[] args) {
		 SpringApplication.run(ZipkinGatewayZuulServerApplication.class, args);
	}
}
