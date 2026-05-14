package model.dao.factory;

import db.DB;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.dao.impl.DepartmentDaoJdbc;
import model.dao.impl.SellerDaoJdbc;

public class DaoFactory {

    public static SellerDao createSellerDao() {
        return new SellerDaoJdbc(DB.getConnection());
    }

    public static DepartmentDao createDepartmentDao() {
        return new DepartmentDaoJdbc(DB.getConnection());
    }
}
