package com.example.mapper;

import com.example.pojo.SysActForm;
import com.example.pojo.SysActFormExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface SysActFormMapper {
    int countByExample(SysActFormExample example);

    int deleteByExample(SysActFormExample example);

    int deleteByPrimaryKey(Long actFormId);

    int insert(SysActForm record);

    int insertSelective(SysActForm record);

    List<SysActForm> selectByExampleWithRowbounds(SysActFormExample example, RowBounds rowBounds);

    List<SysActForm> selectByExample(SysActFormExample example);

    SysActForm selectByPrimaryKey(Long actFormId);

    int updateByExampleSelective(@Param("record") SysActForm record, @Param("example") SysActFormExample example);

    int updateByExample(@Param("record") SysActForm record, @Param("example") SysActFormExample example);

    int updateByPrimaryKeySelective(SysActForm record);

    int updateByPrimaryKey(SysActForm record);
}