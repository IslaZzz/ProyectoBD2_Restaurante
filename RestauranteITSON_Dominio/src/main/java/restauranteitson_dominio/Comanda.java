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
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Calendar;
import java.util.List;
import restauranteitson_enum.Estado;

/**
 *
 * @author abrilislas
 */
@Entity
public class Comanda implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idComanda")
    private Long id;
    
    @Column(name="folio",nullable=false,length=15)
    private String folio;
    
    @Temporal(TemporalType.DATE)
    @Column(name="fechaHora",nullable=false)
    private Calendar fechaHora;
   
    @Column(name="nombreCliente",length=100)
    private String nombreCliente;
    
    @Enumerated(EnumType.STRING)
    @Column(name="estado",nullable=false)
    private Estado estado;
    
    @Column(name="total",nullable=false)
    private Double total;
    
    @OneToMany(mappedBy = "ComandaProducto", cascade = {CascadeType.PERSIST ,CascadeType.REMOVE})
    private List<ComandaProducto> comandaProductos;
    
    @ManyToOne()
    @JoinColumn(name = "id_mesa", nullable = false)  
    private Mesa mesa;

    //Constructor por defecto
    public Comanda(){}
    
    //Getters y setters
    public String getFolio() {
        return folio;
    }

    public void setFolio(String folio) {
        this.folio = folio;
    }

    public Calendar getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Calendar fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public Estado getEstado() {
        return estado;
    }

        public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public List<ComandaProducto> getComandaProductos() {
        return comandaProductos;
    }

    public void setComandaProductos(List<ComandaProducto> comandaProductos) {
        this.comandaProductos = comandaProductos;
    }
    
    
    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        if (!(object instanceof Comanda)) {
            return false;
        }
        Comanda other = (Comanda) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "restauranteitson_dominio.Comanda[ id=" + id + " ]";
    }
    
}
