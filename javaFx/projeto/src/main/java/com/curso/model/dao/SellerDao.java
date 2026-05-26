package com.curso.model.dao;

import java.util.List;

import com.curso.model.Department;
import com.curso.model.Seller;

public interface SellerDao {

    void insert(Seller seller);

    void update(Seller seller);

    void deleteById(Integer id);

    Seller findById(Integer id);

    List<Seller> findAll();

    List<Seller> findByDepartment(Department department);
}
