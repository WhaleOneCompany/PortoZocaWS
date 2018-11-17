/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.whaleone.portozocaws.product;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Perin
 */
public class ProductResource {

    @Autowired
    private ProductRepository dao;

    public List<Product> getAll() {
        return dao.findAll();
    }

}
