package com.ecommerce.common.mapper;

import com.ecommerce.common.model.City;

public interface CityMapper {
    int deleteByPrimaryKey(Long cityId);

    int insert(City record);

    int insertSelective(City record);

    City selectByPrimaryKey(Long cityId);

    int updateByPrimaryKeySelective(City record);

    int updateByPrimaryKey(City record);
}