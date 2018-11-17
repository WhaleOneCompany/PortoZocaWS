/*
 * Desenvolvido por Whale(1)
 */
package br.com.whale1.vehicles;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author jonas
 */
@EnableConfigurationProperties
@SpringBootApplication
@Configuration
public class VehiclesStarter extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(VehiclesStarter.class, args);
    }
}
