package com.rpc.client.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.rpc.server.demo.service.RemoteService;

import feign.Feign;
import feign.Retryer;
import feign.Request.Options;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RpcClientApplicationTests {
    
    @Autowired
    RemoteService remoteService;

	@Test
	public void contextLoads() {
	    /*RemoteService service = Feign.builder()
                .options(new Options(1000, 3500))
                .retryer(new Retryer.Default(5000, 5000, 3))
                .target(RemoteService.class, "http://localhost:8081");*/
	    String result = remoteService.getOwner("scott");
	    System.out.println(result);
	}

}
