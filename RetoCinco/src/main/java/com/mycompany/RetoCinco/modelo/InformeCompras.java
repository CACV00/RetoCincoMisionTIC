/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.RetoCinco.modelo;

/**
 *
 * @author 15-cw1004la
 */
public class InformeCompras {
    
    private int id_Compra;
    private String Constructora;
    private String Banco_Vinculado;

    public InformeCompras() {
    }

    public InformeCompras(int id_Compra, String Constructora, String Banco_Vinculado) {
        this.id_Compra = id_Compra;
        this.Constructora = Constructora;
        this.Banco_Vinculado = Banco_Vinculado;
    }

    public int getId_Compra() {
        return id_Compra;
    }

    public void setId_Compra(int id_Compra) {
        this.id_Compra = id_Compra;
    }

    public String getConstructora() {
        return Constructora;
    }

    public void setConstructora(String Constructora) {
        this.Constructora = Constructora;
    }

    public String getBanco_Vinculado() {
        return Banco_Vinculado;
    }

    public void setBanco_Vinculado(String Banco_Vinculado) {
        this.Banco_Vinculado = Banco_Vinculado;
    }

    @Override
    public String toString() {
        return "InformeCompras{" + "id_Compra=" + id_Compra + ", Constructora=" + Constructora + ", Banco_Vinculado=" + Banco_Vinculado + '}';
    }
}