/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Farmacia;
import Modelo.Medicamento;
import Modelo.Pedido;
import Modelo.Sucursal;
import Modelo.Tipo_Medicamento;
import java.util.ArrayList;

/**
 *
 * @author ariel
 */
public class Principal {
    
    private final ArrayList<Farmacia> farmacia = new ArrayList<>();
    private final ArrayList<Medicamento> medicamento = new ArrayList<>();
    private final ArrayList<Sucursal> sucursal = new ArrayList<>();
    private final ArrayList<Tipo_Medicamento> tipo_medi = new ArrayList<>();
    private final ArrayList<Pedido> pedidos = new ArrayList<>();
    

    public void ingresodeprueba() {
     farmacia.add(new Farmacia(1, "COFARMA"));
     farmacia.add(new Farmacia(2, "EMPSEPHAR"));
     farmacia.add(new Farmacia(3, "CEMEFAR"));
     
     tipo_medi.add(new Tipo_Medicamento(1, "analgésico"));
     tipo_medi.add(new Tipo_Medicamento(2, "analéptico,"));
     tipo_medi.add(new Tipo_Medicamento(3, "anestésico,"));
     tipo_medi.add(new Tipo_Medicamento(4, "antiácido,"));
     tipo_medi.add(new Tipo_Medicamento(5, "antidepresivo"));
     tipo_medi.add(new Tipo_Medicamento(6, "antibióticos."));
     
     medicamento.add(new Medicamento(1, "Amoxicilina", (Tipo_Medicamento)tipo_medi.get(0)));
     medicamento.add(new Medicamento(2, "Paracetamol ", (Tipo_Medicamento)tipo_medi.get(1)));
     medicamento.add(new Medicamento(3, "Ibuprofeno", (Tipo_Medicamento)tipo_medi.get(2)));
     medicamento.add(new Medicamento(4, "Omeprazol", (Tipo_Medicamento)tipo_medi.get(3)));
     medicamento.add(new Medicamento(5, "Metformina", (Tipo_Medicamento)tipo_medi.get(4)));
     
     sucursal.add(new Sucursal(1, "Principal", "Octavio Chacón Moscoso"));
     sucursal.add(new Sucursal(2, "Secundaria", "Calle AV de la Independencia."));
     sucursal.add(new Sucursal(3, "Principal", "Av de las Americas "));
     sucursal.add(new Sucursal(4, "Principal", "Unios Sovietica y Portugal"));
     sucursal.add(new Sucursal(5, "Principal", "Paseo de los cañarias"));
     
     farmacia.get(0).setMedicamentos(medicamento);
     farmacia.get(1).setMedicamentos(medicamento);
     farmacia.get(2).setMedicamentos(medicamento);
    }
    
    public ArrayList<Medicamento> medicamentos(){  
        return this.medicamento;  
    }
     public ArrayList<Farmacia> farmacias(){  
        return this.farmacia;  
    }
     public ArrayList<Sucursal> sucursales(){  
        return this.sucursal;  
    }
     public ArrayList<Tipo_Medicamento> tipomedi(){  
        return this.tipo_medi;  
    } 
     public void ingresoMedicamento(Medicamento medi) {        
         medicamento.add(medi);                
    }   
    public void ingresoPedido(Pedido ped) {
        pedidos.add(ped);
    }
     public boolean eliminarmedi(Medicamento medicamentoAEliminar) {     
        return  medicamento.remove(medicamentoAEliminar);
    }
     
    
}
