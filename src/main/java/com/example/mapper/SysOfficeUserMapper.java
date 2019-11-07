package com.example.mapper;

import com.example.pojo.SysOfficeUser;
import com.example.pojo.SysOfficeUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface SysOfficeUserMapper {
    int countByExample(SysOfficeUserExample example);

    int deleteByExample(SysOfficeUserExample example);

    int insert(SysOfficeUser record);

    int insertSelective(SysOfficeUser record);

    List<SysOfficeUser> selectByExampleWithRowbounds(SysOfficeUserExample example, RowBounds rowBounds);

    List<SysOfficeUser> selectByExample(SysOfficeUserExample example);

    int updateByExampleSelective(@Param("record") SysOfficeUser record, @Param("example") SysOfficeUserExample example);

    int updateByExample(@Param("record") SysOfficeUser record, @Param("example") SysOfficeUserExample example);
}