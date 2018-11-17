/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.whaleone.portozocaws.controller;

import com.whaleone.portozocaws.core.DAOException;
import com.whaleone.portozocaws.product.Product;
import com.whaleone.portozocaws.product.ProductResource;
import java.util.List;
import javax.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Perin
 */
@RestController
@RequestMapping("{entity}")
public class QueryController {

    @Autowired
    private ProductResource products;
    @Autowired
    private EntityManager em;

    @GetMapping
    public ResponseEntity list(@PathVariable String entity) {
        System.out.println("List entity:: " + entity);
        List<Product> list = products.getAll();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity list(@PathVariable String entity,
            @PathVariable Long id) throws DAOException {
        System.out.println("Read entity: " + entity + " - " + id);
        return new ResponseEntity(products.getOne(id), HttpStatus.OK);
    }

}
