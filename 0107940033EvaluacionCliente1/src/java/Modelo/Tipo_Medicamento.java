/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author ariel
 */
public class Tipo_Medicamento {
    private int id_tipo;
    private String nombre_tipo;

    public Tipo_Medicamento() {
    }
    public Tipo_Medicamento(int id_tipo, String nombre_tipo) {
        this.id_tipo = id_tipo;
        this.nombre_tipo = nombre_tipo;
    }
    
    public Tipo_Medicamento(Tipo_Medicamento m) {
        this.id_tipo = m.getId_tipo();
        this.nombre_tipo = m.getNombre_tipo();
    }

    public int getId_tipo() {
        return id_tipo;
    }

    public void setId_tipo(int id_tipo) {
        this.id_tipo = id_tipo;
    }

    public String getNombre_tipo() {
        return nombre_tipo;
    }

    public void setNombre_tipo(String nombre_tipo) {
        this.nombre_tipo = nombre_tipo;
    }
    
    
}
