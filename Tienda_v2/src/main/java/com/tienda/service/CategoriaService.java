//Capa Negocio - Obtiene la lista de las categorias

package com.tienda.service;

import com.tienda.domain.Categoria;
import java.util.List;


public interface CategoriaService {
    
    //Se obtiene un listado de categorias de un List
    public List<Categoria> getCategorias(boolean activos);
    
    //Se obtiene una categoria por medio de su id
    public Categoria getCategoria(Categoria categoria);

    //metodo salvar
    public void save(Categoria categoria);

    //metodo eliminar
    public void delete(Categoria categoria);

}
