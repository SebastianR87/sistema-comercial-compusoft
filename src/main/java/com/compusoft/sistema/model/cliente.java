/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.compusoft.sistema.model;

/**
 *
 * @author sebas
 */
public class cliente {
   private String idCliente; 
   private String nombre; 
   private String telefono; 
   private String correo;
   private String direccion;
   private String numeroDocumento;
   private String tipoDocumento;

    public cliente() {
    }

    public cliente(String idCliente, String nombre, String telefono, String correo, String direccion, String numeroDocumento, String tipoDocumento) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
        this.numeroDocumento = numeroDocumento;
        this.tipoDocumento = tipoDocumento;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    @Override
    public String toString() {
        return "cliente{" + "idCliente=" + idCliente + ", nombre=" + nombre + ", telefono=" + telefono + ", correo=" + correo + ", direccion=" + direccion + ", numeroDocumento=" + numeroDocumento + ", tipoDocumento=" + tipoDocumento + '}';
    }
   
   
   
   

    
}
