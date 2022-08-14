/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.RetoCinco.modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 15-cw1004la
 */
public class ConsultaDos {
    public void consultados(DefaultTableModel modeloDos) throws ClassNotFoundException {

        InformeProyecto informeproyecto = new InformeProyecto();

        try {
            Conexion conex = new Conexion();
            Connection con = conex.conexion();

            String sql = "SELECT ID_Proyecto, Constructora, Numero_Habitaciones, Ciudad FROM Proyecto WHERE Clasificacion = 'Casa Campestre' AND Ciudad IN ('Santa Marta', 'Cartagena', 'Barranquilla')";
            Statement query = con.createStatement();
            ResultSet resultado = query.executeQuery(sql);
            
            while (resultado.next()){
                informeproyecto.setId_proyecto(resultado.getInt(1));
                informeproyecto.setConstructora(resultado.getString(2));
                informeproyecto.setNumero_habitaciones(resultado.getInt(3));
                informeproyecto.setCiudad(resultado.getString(4));
                modeloDos.addRow(new Object[]{informeproyecto.getId_proyecto(), informeproyecto.getConstructora(), informeproyecto.getNumero_habitaciones(), informeproyecto.getCiudad()});
            }
            resultado.close();
            query.close();
        } catch (SQLException e) {
            System.out.print(e);
        }
    }    
}