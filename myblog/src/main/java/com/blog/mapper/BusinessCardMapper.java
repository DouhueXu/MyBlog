package com.blog.mapper;

import com.blog.pojo.BusinessCard;
import com.blog.pojo.BusinessCardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BusinessCardMapper {
    int countByExample(BusinessCardExample example);

    int deleteByExample(BusinessCardExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BusinessCard record);

    int insertSelective(BusinessCard record);

    List<BusinessCard> selectByExample(BusinessCardExample example);

    BusinessCard selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BusinessCard record, @Param("example") BusinessCardExample example);

    int updateByExample(@Param("record") BusinessCard record, @Param("example") BusinessCardExample example);

    int updateByPrimaryKeySelective(BusinessCard record);

    int updateByPrimaryKey(BusinessCard record);
}