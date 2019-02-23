package com.ecommerce.common.mapper;

import com.ecommerce.common.model.ProductConfig;

public interface ProductConfigMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ProductConfig record);

    int insertSelective(ProductConfig record);

    ProductConfig selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ProductConfig record);

    int updateByPrimaryKey(ProductConfig record);
}