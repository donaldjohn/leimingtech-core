package com.leimingtech.core.entity;


import java.util.List;

import com.leimingtech.core.entity.base.BaseEntity;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class StoreGoodsClass extends BaseEntity{
    private Integer stcId;

    private String stcName;//分类名称

    private Integer stcParentId;//分类父id

    private Boolean stcState;//店铺商品分类状态

    private Integer storeId;//店铺id

    private Integer stcSort;//排序
    
    private int isDel;
    
    private int hasChild;
    
    private Integer checkState;//是否审核通过，0审核中，1审核通过，2审核不通过
    
    private String storeName;//店铺名称
    
    private String reason;//审核结果

    private List<StoreGoodsClass> classList;
}