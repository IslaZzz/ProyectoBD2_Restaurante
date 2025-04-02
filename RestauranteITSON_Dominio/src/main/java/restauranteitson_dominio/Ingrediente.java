/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restauranteitson_dominio;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.io.Serializable;
import restauranteitson_enum.UnidadIngrediente;

/**
 *
 * @author abrilislas
 */
@Entity
public class Ingrediente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="idIngrediente")
    private Long id;
    
    @Column(name="nombreIngrediente",nullable=false,length=100)
    private String nombreIngrediente;
    
    @Column(name="unidadMedida",nullable=false)
    private UnidadIngrediente unidadMedida;
    
    @Column(name="stock")
    private Integer stock;
    
    //Constructor por defecto
    public Ingrediente(){}
    
    
    //Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreIngrediente() {
        return nombreIngrediente;
    }

    public void setNombreIngrediente(String nombreIngrediente) {
        this.nombreIngrediente = nombreIngrediente;
    }

    public UnidadIngrediente getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(UnidadIngrediente unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
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
        if (!(object instanceof Ingrediente)) {
            return false;
        }
        Ingrediente other = (Ingrediente) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "restauranteitson_dominio.Ingrediente[ id=" + id + " ]";
    }
    
}
