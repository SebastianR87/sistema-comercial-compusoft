/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.compusoft.sistema.DAO;

import com.compusoft.sistema.CONFIG.CONEXION;
import com.compusoft.sistema.model.Empleado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DAOEMPLEADO {
    
    // Filtra concurrentemente por las 3 condiciones solicitadas
    public Empleado login(String cargo, String usuario, String password) {
        String sql = "SELECT idEmpleado, nombre, telefono, correo, cargo, usuario, Dni FROM empleado WHERE cargo = ? AND usuario = ? AND password = ?";
        try (Connection con = CONEXION.getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {
            
            ps.setString(1, cargo);
            ps.setString(2, usuario);
            ps.setString(3, password);
            
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return new Empleado(
                        rs.getString("idEmpleado"),
                        rs.getString("nombre"),
                        rs.getString("cargo"),
                        rs.getString("usuario"),
                        "", 
                        rs.getString("Dni")
                    );
                }
            }
        } catch (Exception e) {
            System.out.println("Error en consulta de autenticación: " + e.getMessage());
        }
        return null; 
    }
}