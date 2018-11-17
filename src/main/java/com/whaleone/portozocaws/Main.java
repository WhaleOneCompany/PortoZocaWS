/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.whaleone.portozocaws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Perin
 */
@EnableConfigurationProperties
@SpringBootApplication
@Configuration
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

}
