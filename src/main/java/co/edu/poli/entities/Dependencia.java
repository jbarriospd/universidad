package co.edu.poli.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "DEPENDENCIAS" )public class Dependencia implements Serializable{
//--------------------------------
//Constantes de la Clase.
//--------------------------------
/**
* Constante de Serializaci�n.
*/
private static final long serialVersionUID = -6362794385792247263L;
//--------------------------------
//Atributos de la Clase.
//--------------------------------
/**
* Identificador del Rol.
*/
private Long id;
/**
* Descripci�n del rol
*/
private String descripcion;
/**
* Sigla que sirve como constante para hacer validaciones en el codigo.
*/
private String codigo;
/**
* Estado del rol
*/

private String cargo;

private boolean estado;
//--------------------------------
//Constructor de la Clase.
//--------------------------------
/**
* Constructor por Defecto.
*/
public Dependencia ( ) {
}

/**
* @return the idRol
*/
@Id
@GeneratedValue( strategy = GenerationType.IDENTITY )
@Column( name = "ID_DEPENDENCIA_PK", nullable = false )
public Long getId( ) {
return id;
}
/**
* @param idRol the idRol to set
*/
public void setId( Long idDependencia ) {
this.id = idDependencia;
}
/**
* @return the descripcion
*/
@Column( name = "DESCRIPCION", nullable = false )
public String getDescripcion( ) {
return descripcion;
}
/**
* @param descripcion the descripcion to set
*/
public void setDescripcion( String descripcion ) {
this.descripcion = descripcion;
}
/**
* @return the siglaRol
*/
@Column( name = "CODIGO")
public String getCodigo( ) {
return codigo;
}
/**
* @param siglaRol the siglaRol to set
*/
public void setCodigo(String codigo) {
this.codigo = codigo;}
/**
* @return the estado
*/
@Column( name = "CARGO", nullable = false )
public String getCargo( ) {
return cargo;
}
/**
* @param estado the estado to set
*/
public void setCargo( String cargo ) {
this.cargo = cargo;
}

@Column( name = "ESTADO", nullable = false )
public boolean getEstado( ) {
return estado;
}
/**
* @param estado the estado to set
*/
public void setEstado( boolean estado ) {
this.estado = estado;
}
/* (non-Javadoc)
* @see java.lang.Object#toString()
*/
@Override
public String toString() {
return "Dependencia [id=" + id + ", descripcion=" + descripcion + ", codigo=" + codigo + ", cargo=" + cargo + ", estado ="+ estado +"]";
}
}
