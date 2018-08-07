package com.tydic.dao;

import com.tydic.bean.InfoUser;
import com.tydic.bean.InfoUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InfoUserMapper {
    int countByExample(InfoUserExample example);

    int deleteByExample(InfoUserExample example);

    int deleteByPrimaryKey(String userId);

    int insert(InfoUser record);

    int insertSelective(InfoUser record);

    List<InfoUser> selectByExample(InfoUserExample example);

    InfoUser selectByPrimaryKey(String userId);

    int updateByExampleSelective(@Param("record") InfoUser record, @Param("example") InfoUserExample example);

    int updateByExample(@Param("record") InfoUser record, @Param("example") InfoUserExample example);

    int updateByPrimaryKeySelective(InfoUser record);

    int updateByPrimaryKey(InfoUser record);
}