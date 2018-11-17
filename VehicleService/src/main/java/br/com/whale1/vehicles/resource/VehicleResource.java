/*
 * Desenvolvido por Whale(1)
 */
package br.com.whale1.vehicles.resource;

import java.util.List;

import br.com.whale1.vehicles.model.Vehicle;
import br.com.whale1.vehicles.repository.Vehicles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonComponent;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author jonas
 */
@RestController
@RequestMapping("/vehicles")
public class VehicleResource {
    
    @Autowired
    private Vehicles vehicles;
    
    @GetMapping
    public List<Vehicle> list(){        
        return vehicles.findAll();
    }
    
    @GetMapping("/oi")
    public ResponseEntity<String> test(){
        return new ResponseEntity("heloow", HttpStatus.OK);
    }
}
