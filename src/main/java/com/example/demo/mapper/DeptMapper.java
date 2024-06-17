package com.example.demo.mapper;


import com.example.demo.pojo.Dept;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DeptMapper {


    @Select("select * from dept")
    List<Dept> list();

    @Delete("delete from dept where id = #{id}")
    Boolean delete(Integer id);

    @Insert("insert into dept(name, create_time, update_time) values (#{name}, #{createTime}, #{updateTime})")
    void add(Dept dept);
}
