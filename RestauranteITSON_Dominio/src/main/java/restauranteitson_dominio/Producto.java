/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restauranteitson_dominio;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.io.Serializable;
import java.util.List;
import restauranteitson_enum.TipoProducto;

/**
 *
 * @author abrilislas
 */
@Entity
public class Producto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idProducto")
    private Long id;
    
    @Column(name="nombreProducto",nullable=false,length=100)
    private String nombreProducto;
    
    @Enumerated(EnumType.STRING)
    @Column(name="tipo",nullable=false)
    private TipoProducto tipo;
    
    @Column(name="precio",nullable=false)
    private Double precio;
    
    @OneToMany(mappedBy = "ProductoIngrediente", cascade = {CascadeType.PERSIST ,CascadeType.REMOVE})
    private List<ProductoIngrediente> pedidos;
    
    @OneToMany(mappedBy = "ComandaProducto", cascade = {CascadeType.PERSIST ,CascadeType.REMOVE})
    private List<ComandaProducto> comandaProductos;
    
    //Constructor vacio
    public Producto(){}
    
    //Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<ComandaProducto> getComandaProductos() {
        return comandaProductos;
    }

    public void setComandaProductos(List<ComandaProducto> comandaProductos) {
        this.comandaProductos = comandaProductos;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public TipoProducto getTipo() {
        return tipo;
    }

    public void setTipo(TipoProducto tipo) {
        this.tipo = tipo;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public List<ProductoIngrediente> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<ProductoIngrediente> pedidos) {
        this.pedidos = pedidos;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Producto)) {
            return false;
        }
        Producto other = (Producto) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "restauranteitson_dominio.Producto[ id=" + id + " ]";
    }
    
}
