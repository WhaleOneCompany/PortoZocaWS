/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.whaleone.portozocaws;

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

    @GetMapping
    public ResponseEntity list(@PathVariable String entity) {
        System.out.println("Enity: " + entity);
        return new ResponseEntity(entity, HttpStatus.OK);
    }

}
