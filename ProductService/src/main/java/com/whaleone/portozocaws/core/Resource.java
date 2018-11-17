/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.whaleone.portozocaws.core;

import java.util.List;

/**
 *
 * @author Perin
 * @param <B> Bean
 */
public interface Resource<B> {

    public Long save(B bean) throws DAOException;

    public List<B> getAll() throws DAOException;

    public B getOne(Long id) throws DAOException;

}
