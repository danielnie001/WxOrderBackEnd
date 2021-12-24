package com.bobo.ordersystem.repository;

import com.bobo.ordersystem.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author : danielNie
 * @Description : IntelliJ IDEA
 * @PackageName : com.bobo.odersystem.repository
 * @ClassName : OrderRepository
 * @addTime : 2021/10/26 21:56
 */
@Repository
public interface OrderRepository extends JpaRepository<OrderEntity,String> {
}
