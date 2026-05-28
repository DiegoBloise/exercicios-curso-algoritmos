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

    public void saveOrUpdate(Department department) {
        if (department.getId() == null) {
            dao.insert(department);
        } else {
            dao.update(department);
        }
    }

    public void remove(Department department) {
        dao.deleteById(department.getId());
    }
}
