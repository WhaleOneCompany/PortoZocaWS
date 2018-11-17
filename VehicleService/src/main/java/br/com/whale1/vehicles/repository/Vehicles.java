/*
 * Desenvolvido por Whale(1)
 */
package br.com.whale1.vehicles.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.whale1.vehicles.model.Vehicle;
        
public interface Vehicles extends JpaRepository<Vehicle, Long> {
    
}
