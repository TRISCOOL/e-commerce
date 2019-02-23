package com.ecommerce.common.mapper;

import com.ecommerce.common.model.CourierCompany;

public interface CourierCompanyMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CourierCompany record);

    int insertSelective(CourierCompany record);

    CourierCompany selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CourierCompany record);

    int updateByPrimaryKey(CourierCompany record);
}