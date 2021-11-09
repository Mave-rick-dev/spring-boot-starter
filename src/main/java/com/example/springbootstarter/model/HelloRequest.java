package com.example.springbootstarter.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @Project spring-boot-starter
 * @Author mave on 11/9/21
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class HelloRequest {
    private String name;
    private String greetingTxt;
}
