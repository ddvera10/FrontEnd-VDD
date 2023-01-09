
package com.portfolio.vdd.Security.Repository;

import com.portfolio.vdd.Security.Entity.Rol;
import com.portfolio.vdd.Security.Enums.RolNombre;
import java.util.Optional;
import org.hibernate.query.criteria.JpaFrom;
import org.springframework.stereotype.Repository;

@Repository
public interface iRolRepository extends JpaFrom<Rol, Integer> {
    Optional<Rol> findByRolNombre (RolNombre rolNombre);
}
