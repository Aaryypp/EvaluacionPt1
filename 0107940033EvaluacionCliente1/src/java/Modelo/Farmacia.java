/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author ariel
 */
public class Farmacia {
    private int id_farma;
    private String nombre;
    private ArrayList<Medicamento> medicamentos = new ArrayList<>();
    private ArrayList<Sucursal> sucursales = new ArrayList<>();

    public Farmacia() {
    }

    public Farmacia(int id_farma, String nombre) {
        this.id_farma = id_farma;
        this.nombre = nombre;
    }

    public int getId_farma() {
        return id_farma;
    }

    public void setId_farma(int id_farma) {
        this.id_farma = id_farma;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Medicamento> getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(ArrayList<Medicamento> medicamentos) {
        this.medicamentos = medicamentos;
    }

    public ArrayList<Sucursal> getSucursales() {
        return sucursales;
    }

    public void setSucursales(ArrayList<Sucursal> sucursales) {
        this.sucursales = sucursales;
    }
    
    
}
