package com.example.mapper;

import com.example.pojo.SysActStep;
import com.example.pojo.SysActStepExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface SysActStepMapper {
    int countByExample(SysActStepExample example);

    int deleteByExample(SysActStepExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysActStep record);

    int insertSelective(SysActStep record);

    List<SysActStep> selectByExampleWithRowbounds(SysActStepExample example, RowBounds rowBounds);

    List<SysActStep> selectByExample(SysActStepExample example);

    SysActStep selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysActStep record, @Param("example") SysActStepExample example);

    int updateByExample(@Param("record") SysActStep record, @Param("example") SysActStepExample example);

    int updateByPrimaryKeySelective(SysActStep record);

    int updateByPrimaryKey(SysActStep record);
}