package com.rpc.client.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.rpc.server.demo.service.config")
public class RpcClientApplication {

	public static void main(String[] args) {
	    System.out.println("启动客户端");
		SpringApplication.run(RpcClientApplication.class, args);
	}
}
