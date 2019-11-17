package com.itheima.dao;

import com.itheima.domain.User;

import java.util.List;

/*
  author cxz
*/
public interface IUseDao {
    List<User> findAll();
}
