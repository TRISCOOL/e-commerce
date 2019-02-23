package com.ecommerce.common.mapper;

import com.ecommerce.common.model.District;

public interface DistrictMapper {
    int deleteByPrimaryKey(Long districtId);

    int insert(District record);

    int insertSelective(District record);

    District selectByPrimaryKey(Long districtId);

    int updateByPrimaryKeySelective(District record);

    int updateByPrimaryKey(District record);
}