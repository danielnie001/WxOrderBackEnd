package com.bobo.odersystem;

import com.bobo.odersystem.entity.OrderEntity;
import com.bobo.odersystem.repository.OrderRepository;
import lombok.AllArgsConstructor;
import org.aspectj.weaver.ast.Or;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class OdersystemApplicationTests {

    @Autowired
    OrderRepository orderRepository;

    @Test
    void contextLoads() {
    }


    @Test
    public void test(){
        OrderEntity entity = OrderEntity.builder().orderId("11111111").productIcon("xxxxxxx").productId("xxxxxxxxx").productName("水杯").productPrice(12.8).productQuantity(10).build();
        orderRepository.save(entity);
        System.out.println(entity.toString());
    }
}
