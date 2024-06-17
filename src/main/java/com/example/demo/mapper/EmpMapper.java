package com.example.demo.mapper;


import com.example.demo.pojo.Emp;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.time.LocalDate;
import java.util.List;

@Mapper
public interface EmpMapper {


//    @Select("select count(*) from emp")
    public Long count(@Param("name") String name, @Param("gender") Short gender,
                      @Param("begin") LocalDate begin, @Param("end") LocalDate end);


//    @Select("select * from emp limit #{start}, #{pageSize}")
    public List<Emp> page(@Param("start") Integer start, @Param("pageSize") Integer pageSize,
                          @Param("name") String name, @Param("gender") Short gender,
                          @Param("begin") LocalDate begin, @Param("end") LocalDate end);

    void delete(@Param("ids") List<Integer> ids);

    @Insert("insert into emp(username, name, gender, image, job, entrydate, dept_id, create_time, update_time)" +
            "values (#{username}, #{name}, #{gender}, #{image}, #{job}, #{entrydate}, #{deptId}, #{createTime}, #{updateTime})")
    void save(Emp emp);
}
