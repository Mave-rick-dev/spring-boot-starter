package com.example.springbootstarter.controller;

import com.example.springbootstarter.model.HelloRequest;
import com.example.springbootstarter.service.HelloService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @Project spring-boot-starter
 * @Author mave on 11/9/21
 */

@RestController
@RequestMapping(value = "/hello")
@RequiredArgsConstructor
public class HelloController{

    private final HelloService helloService;

    @PostMapping (value = "/")
    public ResponseEntity<?> welcome(@RequestBody HelloRequest helloRequest) {
        return ResponseEntity.ok(helloService.getWelcomeMsg(helloRequest));
    }
}
