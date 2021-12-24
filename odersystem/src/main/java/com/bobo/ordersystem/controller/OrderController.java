package com.bobo.ordersystem.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/orders")
@AllArgsConstructor
@Api(value = "订单系统")
public class OrderController {

    @ApiOperation(value = "订单系统")
    @GetMapping("/hello")
    public String hello(){
        
        return "Hello,SpringBootTest";
    }
}