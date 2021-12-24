package com.bobo.ordersystem.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
@AllArgsConstructor
@Api(value = "订单系统")
public class OrderController {

    private static final Logger log = LoggerFactory.getLogger(OrderController.class);

    @ApiOperation(value = "订单系统")
    @GetMapping("/hello")
    public String hello(){
        log.info("*********************** 打印日志 **************************");
        return "Hello,SpringBootTest";
    }
}