package com.bobo.ordersystem.entity;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * @author : danielNie
 * @Description : IntelliJ IDEA
 * @PackageName : com.bobo.odersystem.entity
 * @ClassName : OrderEntity
 * @addTime : 2021/10/26 21:25
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name = "order_detail")
@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderEntity extends BaseEntity{

    /**
     *
     */
    private static final long serialVersionUID = -8717939944814269438L;
    @Id
    @GeneratedValue(generator = "hibernate-uuid")
    @GenericGenerator(name = "hibernate-uuid",strategy = "uuid")
    @Column(name = "detail_id",unique = true)
    private String id;
    /**
     * 订单id
     */
    @Column(name = "order_id" )
    private String orderId;

    /**
     * 商品id
     */
    @Column(name = "product_id" )
    private String productId;

    /**
     * 商品名字
     */
    @Column(name = "product_name" )
    private String productName;

    /**
     * 商品价格
     */
    @Column(name = "product_price" )
    private Double productPrice;

    /**
     * 商品数量
     */
    @Column(name = "product_quantity" )
    private Integer productQuantity;

    /**
     * 商品小图
     */
    @Column(name = "product_icon" )
    private String productIcon;

}
