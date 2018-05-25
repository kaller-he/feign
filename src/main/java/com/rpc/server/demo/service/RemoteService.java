package com.rpc.server.demo.service;

/**
 * 
 * @author kaller.he
 * @date 2018年5月24日 下午6:02:15
 * @version V1.0 
 */
import feign.Param;
import feign.RequestLine;

public interface RemoteService {
    
    @RequestLine("GET /users/list?name={name}")
    String getOwner(@Param(value = "name") String name);
}
