package com.bobo.odersystem.orderApi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : danielNie
 * @Description : IntelliJ IDEA
 * @PackageName : com.bobo.odersystem.orderApi
 * @ClassName : Order
 * @addTime : 2021/10/26 20:06
 */
@RestController
@RequestMapping("/orders")
public class Order {

    @GetMapping("hello")
    public String hello(){
        return "hello,world";
    }
}
