package com.example.springbootstarter.serviceImpl;

import com.example.springbootstarter.model.HelloRequest;
import com.example.springbootstarter.model.HelloResponse;
import com.example.springbootstarter.service.HelloService;
import org.springframework.stereotype.Service;

/**
 * @Project spring-boot-starter
 * @Author mave on 11/9/21
 */
@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public HelloResponse getWelcomeMsg(HelloRequest helloRequest) {

        HelloResponse helloResponse = new HelloResponse(
                helloRequest.getGreetingTxt() + " " + helloRequest.getName());

        return helloResponse;
    }
}
