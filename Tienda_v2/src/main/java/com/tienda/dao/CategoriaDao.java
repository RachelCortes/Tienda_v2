//Capa Datos

package com.tienda.dao;

import com.tienda.domain.Categoria; //Importamos todo de mi clase categoria
import org.springframework.data.jpa.repository.JpaRepository; //


        
public interface CategoriaDao extends JpaRepository <Categoria, Long>{
    
    
}
