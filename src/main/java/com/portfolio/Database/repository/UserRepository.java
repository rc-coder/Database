
package com.portfolio.Database.repository;

import com.portfolio.Database.model.User;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    
    //un metodo opcional que nos buscara un usuario por el email
    //usamos el metodo findBy, se podria usar username
    Optional<User> findByEmail(String email);
    
}
