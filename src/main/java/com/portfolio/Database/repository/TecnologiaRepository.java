
package com.portfolio.Database.repository;

import com.portfolio.Database.model.Tecnologia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TecnologiaRepository extends JpaRepository<Tecnologia, Integer>{
    
}
