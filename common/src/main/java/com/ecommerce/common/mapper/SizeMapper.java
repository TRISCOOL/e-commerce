package com.ecommerce.common.mapper;

import com.ecommerce.common.model.Size;

public interface SizeMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Size record);

    int insertSelective(Size record);

    Size selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Size record);

    int updateByPrimaryKey(Size record);
}