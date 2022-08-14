/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.RetoCinco.modelo;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 15-cw1004la
 */
public class ConsultaUno {

    public void consultauno(DefaultTableModel modeloUno) throws ClassNotFoundException {

        InformeLider informelider = new InformeLider();

        try {
            Conexion conex = new Conexion();
            Connection con = conex.conexion();

            String sql = "SELECT ID_lider, Nombre, Primer_Apellido, Ciudad_Residencia FROM Lider ORDER BY Ciudad_Residencia";
            Statement query = con.createStatement();
            ResultSet resultado = query.executeQuery(sql);
            
            while (resultado.next()){
                informelider.setId_lider(resultado.getInt(1));
                informelider.setNombre(resultado.getString(2));
                informelider.setPrimer_apellido(resultado.getString(3));
                informelider.setCiudad_residencia(resultado.getString(4));
                modeloUno.addRow(new Object[]{informelider.getId_lider(), informelider.getNombre(), informelider.getPrimer_apellido(), informelider.getCiudad_residencia()});
            }
            resultado.close();
            query.close();
        } catch (SQLException e) {
            System.out.print(e);
        }
    }
}