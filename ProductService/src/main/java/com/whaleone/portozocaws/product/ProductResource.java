/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.whaleone.portozocaws.product;

import com.whaleone.portozocaws.core.DAOException;
import com.whaleone.portozocaws.core.Resource;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author Perin
 */
@Component
public class ProductResource implements Resource<Product> {

    @Autowired
    private ProductRepository dao;

    @Override
    public final List<Product> getAll() {
        return dao.findAll();
    }

    @Override
    public final Long save(Product bean) {
        return dao.save(bean).getId();
    }

    @Override
    public Product getOne(Long id) throws DAOException {
        return dao.findById(id).orElse(new Product());
    }

}
