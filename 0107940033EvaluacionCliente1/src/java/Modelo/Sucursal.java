/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author ariel
 */
public class Sucursal {
    private int id_suscursal;
    private String tipo;
    private String direccion;
    

    public Sucursal() {
    }

    public Sucursal(int id_suscursal, String tipo, String direccion) {
        this.id_suscursal = id_suscursal;
        this.tipo = tipo;
        this.direccion = direccion;
    }

    public int getId_suscursal() {
        return id_suscursal;
    }

    public void setId_suscursal(int id_suscursal) {
        this.id_suscursal = id_suscursal;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

   
    
}
