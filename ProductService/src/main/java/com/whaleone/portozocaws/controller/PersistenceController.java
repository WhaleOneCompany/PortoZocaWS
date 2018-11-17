/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.whaleone.portozocaws.controller;

import com.whaleone.portozocaws.product.Product;
import com.whaleone.portozocaws.product.ProductResource;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Perin
 */
@RestController
@RequestMapping("{entity}")
public class PersistenceController {

    @Autowired
    private ProductResource products;

    @PostMapping
    public ResponseEntity save(@PathVariable String entity,
            @RequestBody @Valid Product product) {
        System.out.println("Enity: " + entity);
        Long id = products.save(product);
        return new ResponseEntity(id, HttpStatus.CREATED);
    }

}
