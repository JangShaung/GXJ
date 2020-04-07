package com.example.GMapper;

import com.example.TkMapper.TkMapper;
import com.example.entity.jghg;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

public interface ChaMapper{

    @Select("select count(*) from subjectpictures")
    public int cha();

}
