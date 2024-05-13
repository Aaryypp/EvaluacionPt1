/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author ariel
 */
public class Pedido {
    private int id_pedido;
    private Medicamento medicamento;
    private int cantidad;

    public Pedido() {
    }

    public Pedido(int id_pedido, Medicamento medicamento, int cantidad) {
        this.id_pedido = id_pedido;
        this.medicamento = new Medicamento(medicamento);
        this.cantidad = cantidad;
    }
    
    

    public int getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    public Medicamento getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
    
    
}
