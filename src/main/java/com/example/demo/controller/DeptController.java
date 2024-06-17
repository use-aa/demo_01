package com.example.demo.controller;

import com.example.demo.pojo.Dept;
import com.example.demo.pojo.Result;
import com.example.demo.service.DeptService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/depts")
public class DeptController {

    @Autowired
    private DeptService deptService;



    @GetMapping("")
    public Result list(){
        log.info("查询");

        List<Dept> deptList = deptService.list();
        return Result.success(deptList);
    }


    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id){
        log.info("删除");

        Boolean flag = deptService.delete(id);
        return Result.success(flag);
    }

    @PostMapping("")
    public Result add(@RequestBody Dept dept){
        log.info("新增");
        deptService.add(dept);
        return Result.success();
    }


}
