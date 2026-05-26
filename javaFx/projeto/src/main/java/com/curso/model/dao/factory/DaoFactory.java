package com.curso.model.dao.factory;

import com.curso.db.DB;
import com.curso.model.dao.DepartmentDao;
import com.curso.model.dao.SellerDao;
import com.curso.model.dao.impl.DepartmentDaoJdbc;
import com.curso.model.dao.impl.SellerDaoJdbc;

public class DaoFactory {

    public static SellerDao createSellerDao() {
        return new SellerDaoJdbc(DB.getConnection());
    }

    public static DepartmentDao createDepartmentDao() {
        return new DepartmentDaoJdbc(DB.getConnection());
    }
}
