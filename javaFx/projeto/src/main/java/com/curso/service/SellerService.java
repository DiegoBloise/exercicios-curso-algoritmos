package com.curso.service;

import java.util.List;

import com.curso.model.Seller;
import com.curso.model.dao.SellerDao;
import com.curso.model.dao.factory.DaoFactory;

public class SellerService {

    private SellerDao dao = DaoFactory.createSellerDao();

    public List<Seller> findAll() {
        return dao.findAll();
    }

    public void saveOrUpdate(Seller seller) {
        if (seller.getId() == null) {
            dao.insert(seller);
        } else {
            dao.update(seller);
        }
    }

    public void remove(Seller seller) {
        dao.deleteById(seller.getId());
    }
}
