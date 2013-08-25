package com.triunfo.entidades;
// Generated 24/08/2013 06:40:00 PM by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Tblpersona generated by hbm2java
 */
@Entity
@Table(name="TBLPERSONA"
    ,catalog="tienda"
)
public class Tblpersona  implements java.io.Serializable {


     private Integer secpersona;
     private Tblsexo tblsexo;
     private Tblmunicipio tblmunicipio;
     private Tbltipopersona tbltipopersona;
     private Tbldocumento tbldocumento;
     private String pnombre;
     private String snombre;
     private String papellido;
     private String sapellido;
     private String telefono;
     private String direccion;
     private String email;
     private Set tblventasForSeccliente = new HashSet(0);
     private Set tblcompras = new HashSet(0);
     private Set tblpuntodeventas = new HashSet(0);
     private Set tblventasForSecvendedor = new HashSet(0);

    public Tblpersona() {
    }

	
    public Tblpersona(Tblsexo tblsexo, Tblmunicipio tblmunicipio, Tbltipopersona tbltipopersona, Tbldocumento tbldocumento, String pnombre, String snombre, String papellido, String sapellido, String telefono, String direccion) {
        this.tblsexo = tblsexo;
        this.tblmunicipio = tblmunicipio;
        this.tbltipopersona = tbltipopersona;
        this.tbldocumento = tbldocumento;
        this.pnombre = pnombre;
        this.snombre = snombre;
        this.papellido = papellido;
        this.sapellido = sapellido;
        this.telefono = telefono;
        this.direccion = direccion;
    }
    public Tblpersona(Tblsexo tblsexo, Tblmunicipio tblmunicipio, Tbltipopersona tbltipopersona, Tbldocumento tbldocumento, String pnombre, String snombre, String papellido, String sapellido, String telefono, String direccion, String email, Set tblventasForSeccliente, Set tblcompras, Set tblpuntodeventas, Set tblventasForSecvendedor) {
       this.tblsexo = tblsexo;
       this.tblmunicipio = tblmunicipio;
       this.tbltipopersona = tbltipopersona;
       this.tbldocumento = tbldocumento;
       this.pnombre = pnombre;
       this.snombre = snombre;
       this.papellido = papellido;
       this.sapellido = sapellido;
       this.telefono = telefono;
       this.direccion = direccion;
       this.email = email;
       this.tblventasForSeccliente = tblventasForSeccliente;
       this.tblcompras = tblcompras;
       this.tblpuntodeventas = tblpuntodeventas;
       this.tblventasForSecvendedor = tblventasForSecvendedor;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="SECPERSONA", unique=true, nullable=false)
    public Integer getSecpersona() {
        return this.secpersona;
    }
    
    public void setSecpersona(Integer secpersona) {
        this.secpersona = secpersona;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="SECSEXO", nullable=false)
    public Tblsexo getTblsexo() {
        return this.tblsexo;
    }
    
    public void setTblsexo(Tblsexo tblsexo) {
        this.tblsexo = tblsexo;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="SECMUNICIPIO", nullable=false)
    public Tblmunicipio getTblmunicipio() {
        return this.tblmunicipio;
    }
    
    public void setTblmunicipio(Tblmunicipio tblmunicipio) {
        this.tblmunicipio = tblmunicipio;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="SECTIPOPERSONA", nullable=false)
    public Tbltipopersona getTbltipopersona() {
        return this.tbltipopersona;
    }
    
    public void setTbltipopersona(Tbltipopersona tbltipopersona) {
        this.tbltipopersona = tbltipopersona;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="SECDOCUMENTO", nullable=false)
    public Tbldocumento getTbldocumento() {
        return this.tbldocumento;
    }
    
    public void setTbldocumento(Tbldocumento tbldocumento) {
        this.tbldocumento = tbldocumento;
    }
    
    @Column(name="PNOMBRE", nullable=false, length=45)
    public String getPnombre() {
        return this.pnombre;
    }
    
    public void setPnombre(String pnombre) {
        this.pnombre = pnombre;
    }
    
    @Column(name="SNOMBRE", nullable=false, length=45)
    public String getSnombre() {
        return this.snombre;
    }
    
    public void setSnombre(String snombre) {
        this.snombre = snombre;
    }
    
    @Column(name="PAPELLIDO", nullable=false, length=45)
    public String getPapellido() {
        return this.papellido;
    }
    
    public void setPapellido(String papellido) {
        this.papellido = papellido;
    }
    
    @Column(name="SAPELLIDO", nullable=false, length=45)
    public String getSapellido() {
        return this.sapellido;
    }
    
    public void setSapellido(String sapellido) {
        this.sapellido = sapellido;
    }
    
    @Column(name="TELEFONO", nullable=false, length=45)
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    @Column(name="DIRECCION", nullable=false, length=45)
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    @Column(name="EMAIL", length=45)
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="tblpersonaBySeccliente")
    public Set getTblventasForSeccliente() {
        return this.tblventasForSeccliente;
    }
    
    public void setTblventasForSeccliente(Set tblventasForSeccliente) {
        this.tblventasForSeccliente = tblventasForSeccliente;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="tblpersona")
    public Set getTblcompras() {
        return this.tblcompras;
    }
    
    public void setTblcompras(Set tblcompras) {
        this.tblcompras = tblcompras;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="tblpersona")
    public Set getTblpuntodeventas() {
        return this.tblpuntodeventas;
    }
    
    public void setTblpuntodeventas(Set tblpuntodeventas) {
        this.tblpuntodeventas = tblpuntodeventas;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="tblpersonaBySecvendedor")
    public Set getTblventasForSecvendedor() {
        return this.tblventasForSecvendedor;
    }
    
    public void setTblventasForSecvendedor(Set tblventasForSecvendedor) {
        this.tblventasForSecvendedor = tblventasForSecvendedor;
    }




}


