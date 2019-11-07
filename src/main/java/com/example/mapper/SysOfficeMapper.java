package com.example.mapper;

import com.example.pojo.SysOffice;
import com.example.pojo.SysOfficeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface SysOfficeMapper {
    int countByExample(SysOfficeExample example);

    int deleteByExample(SysOfficeExample example);

    int deleteByPrimaryKey(Long officeId);

    int insert(SysOffice record);

    int insertSelective(SysOffice record);

    List<SysOffice> selectByExampleWithRowbounds(SysOfficeExample example, RowBounds rowBounds);

    List<SysOffice> selectByExample(SysOfficeExample example);

    SysOffice selectByPrimaryKey(Long officeId);

    int updateByExampleSelective(@Param("record") SysOffice record, @Param("example") SysOfficeExample example);

    int updateByExample(@Param("record") SysOffice record, @Param("example") SysOfficeExample example);

    int updateByPrimaryKeySelective(SysOffice record);

    int updateByPrimaryKey(SysOffice record);
}