/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.compusoft.sistema.CONFIG;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CONEXION {
    
    private static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=SISTEMACOMPUSOFT;encrypt=true;trustServerCertificate=true;";
    private static final String USER = "master_user"; 
    private static final String PASS = "Contrasena2026"; 

    public static Connection getConexion() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error en la conexión a SQL Server: " + e.getMessage());
            return null;
        }
    }
}