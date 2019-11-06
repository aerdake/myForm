package com.example.mapper;

import com.example.pojo.SysAct;
import com.example.pojo.SysActExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface SysActMapper {
    int countByExample(SysActExample example);

    int deleteByExample(SysActExample example);

    int deleteByPrimaryKey(Long actId);

    int insert(SysAct record);

    int insertSelective(SysAct record);

    List<SysAct> selectByExampleWithRowbounds(SysActExample example, RowBounds rowBounds);

    List<SysAct> selectByExample(SysActExample example);

    SysAct selectByPrimaryKey(Long actId);

    int updateByExampleSelective(@Param("record") SysAct record, @Param("example") SysActExample example);

    int updateByExample(@Param("record") SysAct record, @Param("example") SysActExample example);

    int updateByPrimaryKeySelective(SysAct record);

    int updateByPrimaryKey(SysAct record);
}