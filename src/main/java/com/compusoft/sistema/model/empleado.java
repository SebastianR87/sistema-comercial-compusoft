
package com.compusoft.sistema.model;

public class empleado {
    private String idEmpleado; 
    private String nombre; 
    private String telefono; 
    private String correo; 
    private String cargo; 
    private String usuario; 
    private String password; 
    private String DNI;

    public empleado() {
    }

    public empleado(String idEmpleado, String nombre, String telefono, String correo, String cargo, String usuario, String password, String DNI) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.cargo = cargo;
        this.usuario = usuario;
        this.password = password;
        this.DNI = DNI;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    @Override
    public String toString() {
        return "empleado{" + "idEmpleado=" + idEmpleado + ", nombre=" + nombre + ", telefono=" + telefono + ", correo=" + correo + ", cargo=" + cargo + ", usuario=" + usuario + ", password=" + password + ", DNI=" + DNI + '}';
    }
    
    
    
}
