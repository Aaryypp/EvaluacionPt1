/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author ariel
 */
public class Medicamento {
    
    private int id_producto;
    private String nombre_pro;
    private Tipo_Medicamento tipo_medi;

    public Medicamento() {
    }

    public Medicamento(int id_producto, String nombre_pro, Tipo_Medicamento tipo_medi) {
        this.id_producto = id_producto;
        this.nombre_pro = nombre_pro;
        this.tipo_medi = new Tipo_Medicamento(tipo_medi);
    }
    
     public Medicamento(Medicamento m) {
        this.id_producto = m.getId_producto();
        this.nombre_pro = m.getNombre_pro();
        this.tipo_medi = m.getTipo_medi();
    }
    
    

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getNombre_pro() {
        return nombre_pro;
    }

    public void setNombre_pro(String nombre_pro) {
        this.nombre_pro = nombre_pro;
    }

    public Tipo_Medicamento getTipo_medi() {
        return tipo_medi;
    }

    public void setTipo_medi(Tipo_Medicamento tipo_medi) {
        this.tipo_medi = tipo_medi;
    }
    
    

    
    
}
