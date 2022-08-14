/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.RetoCinco.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author 15-cw1004la
 */
public class Conexion {
    Connection conexion = null;
    
    public Connection conexion () throws ClassNotFoundException{
        try {
            Class.forName("org.sqlite.JDBC");
            conexion = DriverManager.getConnection("jdbc:sqlite:ProyectosConstruccion.db");
        } catch (SQLException e){
            System.out.print(e);
        }
        return conexion;
    }
}
