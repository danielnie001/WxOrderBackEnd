package com.bobo;

import com.bobo.ordersystem.entity.OrderEntity;
import com.bobo.ordersystem.repository.OrderRepository;
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
