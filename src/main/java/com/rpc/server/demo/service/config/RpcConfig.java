package com.rpc.server.demo.service.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.rpc.server.demo.service.RemoteService;

import feign.Feign;
import feign.Request.Options;
import feign.Retryer;

/**
 * 
 * @author kaller.he
 * @date 2018年5月24日 下午6:05:06
 * @version V1.0 
 */
@Component 
@Configuration
public class RpcConfig {
    
    @Bean
    public RemoteService accountService() {
        System.out.println("初始化RemoteService");
        RemoteService service = Feign.builder()
                .options(new Options(1000, 3500))
                .retryer(new Retryer.Default(5000, 5000, 3))
                .target(RemoteService.class, "http://localhost:8081");
        return service;
    }
}
