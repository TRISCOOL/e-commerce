package com.ecommerce.common.mapper;

import com.ecommerce.common.model.Province;

public interface ProvinceMapper {
    int deleteByPrimaryKey(Long provinceId);

    int insert(Province record);

    int insertSelective(Province record);

    Province selectByPrimaryKey(Long provinceId);

    int updateByPrimaryKeySelective(Province record);

    int updateByPrimaryKey(Province record);
}