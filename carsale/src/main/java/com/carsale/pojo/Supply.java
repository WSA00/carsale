package com.carsale.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @TableName supply
 */
@Data
@TableName("supply")
public class Supply implements Serializable {

    @TableId
    private Integer id;

    private Integer quantity;

    private Integer supplierId;

    private Integer productId;

    private Integer warehouseId;

    private Date createtime;

    private static final long serialVersionUID = 1L;
}