package com.example.springbootstarter.service;

import com.example.springbootstarter.model.HelloRequest;
import com.example.springbootstarter.model.HelloResponse;
import org.springframework.stereotype.Service;

/**
 * @Project spring-boot-starter
 * @Author mave on 11/9/21
 */
public interface HelloService {
    HelloResponse getWelcomeMsg(HelloRequest helloRequest);
}
