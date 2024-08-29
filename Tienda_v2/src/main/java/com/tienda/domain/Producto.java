//Capa Datos

package com.tienda.domain;

import lombok.Data;
import java.io.Serializable;
import jakarta.persistence.*;

//Para decir que es una clase de tipo datos y tengo una entidad en una tabla
@Data
@Entity
@Table(name="producto")

public class Producto implements Serializable{
    
    private static final long serialVersionUID = 1L; //nos permite modificar el id y poder enviar esa info para modificar, eliminar, etc
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//Nos genera el autoincremento
    @Column(name="id_producto")
            
    private Long idProducto; //El Long es una variable más grande que el int y number
    private String descripcion;
    private String detalle;
    private double precio;
    private int existencias;
    private String rutaImagen;
    private boolean activo;
    
    //private long idCategoria; 
    @ManyToOne
    @JoinColumn(name="id_categoria")
    Categoria categoria;
    
    public Producto() {     
    }     
    
    public Producto(String producto, boolean activo) 
    {         
        this.descripcion = producto;         
        this.activo = activo;     
    }
 
}
