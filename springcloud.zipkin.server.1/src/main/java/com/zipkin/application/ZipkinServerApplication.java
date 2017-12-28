package com.zipkin.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer //开启zipkin服务
@EnableEurekaClient //注册服务到eureka客户端
public class ZipkinServerApplication {
	//开启zipkin服务能力
	public static void main(String[] args) {
		 SpringApplication.run(ZipkinServerApplication.class, args);
	}
}
