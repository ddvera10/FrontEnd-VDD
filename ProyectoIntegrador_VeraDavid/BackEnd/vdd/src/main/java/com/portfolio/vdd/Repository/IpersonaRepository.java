
package com.portfolio.vdd.Repository;

import com.portfolio.vdd.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IpersonaRepository extends JpaRepository<Persona, Long> {
    
}
