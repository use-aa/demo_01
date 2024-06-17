package com.example.demo.service;

import com.example.demo.pojo.Dept;

import java.util.List;

public interface DeptService {
    List<Dept> list();

    Boolean delete(Integer id);

    void add(Dept dept);
}
