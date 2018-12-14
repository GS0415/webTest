package com.Tomcat.service;

import com.Tomcat.pojo.Product;
import com.Tomcat.pojo.User;

import java.util.List;

public interface IProService {
    int add(Product pro);
    int del(int id);
    int update(Product pro);
    List<Product> sel();
    Product selOne(int id);
    User selOneUser(String name);
}
