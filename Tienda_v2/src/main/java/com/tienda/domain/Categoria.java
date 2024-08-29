//Capa Datos
package com.tienda.domain;

import lombok.Data;
import java.io.Serializable;
import jakarta.persistence.*;
import java.util.List;

//Para decir que es una clase de tipo datos y tengo una entidad en una tabla
@Data
@Entity
@Table(name = "categoria")

public class Categoria implements Serializable {

    private static final long serialVersionUID = 1L; //nos permite modificar el id y poder enviar esa info para modificar, eliminar, etc

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//Nos genera el autoincremento
    @Column(name = "id_categoria")

    private Long idCategoria; //El Long es una variable más grande que el int y number
    private String descripcion;
    private String rutaImagen;
    private boolean activo;

    @OneToMany
    @JoinColumn(name = "id_categoria", updatable = false)
    List<Producto> productos;

    public Categoria() {
    }

    public Categoria(String categoria, boolean activo) {
        this.descripcion = categoria;
        this.activo = activo;
    }

}
