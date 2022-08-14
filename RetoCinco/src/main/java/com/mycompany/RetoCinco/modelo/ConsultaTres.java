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
public class ConsultaTres {
    public void consultatres(DefaultTableModel modeloTres) throws ClassNotFoundException {

        InformeCompras informecompras = new InformeCompras();

        try {
            Conexion conex = new Conexion();
            Connection con = conex.conexion();

            String sql = "SELECT ID_Compra, p.Constructora, p.Banco_Vinculado FROM Compra c JOIN proyecto p ON (c.ID_Proyecto = p.ID_Proyecto) WHERE Proveedor  = 'Homecenter' AND p.Ciudad = 'Salento'";
            Statement query = con.createStatement();
            ResultSet resultado = query.executeQuery(sql);
            
            while (resultado.next()){
                informecompras  .setId_Compra(resultado.getInt(1));
                informecompras.setConstructora(resultado.getString(2));
                informecompras.setBanco_Vinculado(resultado.getString(3));
                modeloTres.addRow(new Object[]{informecompras.getId_Compra(), informecompras.getConstructora(), informecompras.getBanco_Vinculado()});
            }
            resultado.close();
            query.close();
        } catch (SQLException e) {
            System.out.print(e);
        }
    }
}