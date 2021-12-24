package com.bobo.ordersystem.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.io.Serializable;
import java.util.Date;

/**
 * @author : danielNie
 * @Description : IntelliJ IDEA
 * @PackageName : com.bobo.odersystem.entity
 * @ClassName : BaseEntity
 * @addTime : 2021/10/26 20:16
 */
@Data
@MappedSuperclass
public class BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 创建时间
     */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(name = "create_time" )
    private Date createTime;

    /**
     * 更新时间
     */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(name = "update_time" )
    private Date updateTime;

    @PrePersist
    void createdAt(){
        this.createTime = this.updateTime = new Date();
    }

    @PreUpdate
    void updatedAt(){
        this.updateTime = new Date();
    }
}
