package springcloud.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
/**
 * 
 * @author liguang
 *
 */
@EnableEurekaServer //开启eureka服务注册能力
@SpringBootApplication
public class EurekaApplication {
	//启动Springcloud注册中心
	public static void main(String[] args) {
		SpringApplication.run(EurekaApplication.class, args);
	}
}
