package com.Tomcat.dao;

import com.Tomcat.pojo.Product;
import com.Tomcat.pojo.User;

import java.util.List;

public interface IProDao {
    int add(Product pro);
    int del(int id);
    int update(Product pro);
    List<Product> sel();
    Product selOne(int id);
    User SelOneUser(String name);
}
