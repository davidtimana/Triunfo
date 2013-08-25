package com.triunfo.entidades;
// Generated 24/08/2013 06:40:00 PM by Hibernate Tools 3.2.1.GA


import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Tbldetalleventa generated by hbm2java
 */
@Entity
@Table(name="tbldetalleventa"
    ,catalog="tienda"
)
public class Tbldetalleventa  implements java.io.Serializable {


     private Integer secdetalleventa;
     private Tblventa tblventa;
     private Tblproducto tblproducto;
     private BigDecimal subtotal;

    public Tbldetalleventa() {
    }

    public Tbldetalleventa(Tblventa tblventa, Tblproducto tblproducto, BigDecimal subtotal) {
       this.tblventa = tblventa;
       this.tblproducto = tblproducto;
       this.subtotal = subtotal;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="SECDETALLEVENTA", unique=true, nullable=false)
    public Integer getSecdetalleventa() {
        return this.secdetalleventa;
    }
    
    public void setSecdetalleventa(Integer secdetalleventa) {
        this.secdetalleventa = secdetalleventa;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="SECVENTA", nullable=false)
    public Tblventa getTblventa() {
        return this.tblventa;
    }
    
    public void setTblventa(Tblventa tblventa) {
        this.tblventa = tblventa;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="SECPRODUCTO", nullable=false)
    public Tblproducto getTblproducto() {
        return this.tblproducto;
    }
    
    public void setTblproducto(Tblproducto tblproducto) {
        this.tblproducto = tblproducto;
    }
    
    @Column(name="SUBTOTAL", nullable=false, precision=50, scale=0)
    public BigDecimal getSubtotal() {
        return this.subtotal;
    }
    
    public void setSubtotal(BigDecimal subtotal) {
        this.subtotal = subtotal;
    }




}

