package com.curso.service;

import java.util.List;

import com.curso.model.Department;
import com.curso.model.dao.DepartmentDao;
import com.curso.model.dao.factory.DaoFactory;

public class DepartmentService {

    private DepartmentDao dao = DaoFactory.createDepartmentDao();

    public List<Department> findAll() {
        return dao.findAll();
    }
}
