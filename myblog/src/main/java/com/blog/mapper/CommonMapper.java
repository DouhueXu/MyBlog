package com.blog.mapper;

import com.blog.pojo.Common;
import com.blog.pojo.CommonExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommonMapper {
    int countByExample(CommonExample example);

    int deleteByExample(CommonExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Common record);

    int insertSelective(Common record);

    List<Common> selectByExample(CommonExample example);

    Common selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Common record, @Param("example") CommonExample example);

    int updateByExample(@Param("record") Common record, @Param("example") CommonExample example);

    int updateByPrimaryKeySelective(Common record);

    int updateByPrimaryKey(Common record);
}