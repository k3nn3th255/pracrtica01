
package com.practica01.dao;


import com.practica01.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoriaDao 
          extends JpaRepository<Categoria,Long>{
    
}
