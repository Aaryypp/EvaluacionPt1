/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package SW;

import Controlador.Principal;
import Modelo.Farmacia;
import Modelo.Medicamento;
import Modelo.Sucursal;
import Modelo.Tipo_Medicamento;
import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author ariel
 */
@WebService(serviceName = "ServidorWS")
public class ServidorWS {   
    Principal principal = new Principal();
     public ServidorWS() {
        principal.ingresodeprueba();
    }  
    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        
        return "Hello " + txt + " !";
    }
    /**
     * Web service operation
     * @return 
     */
    @WebMethod(operationName = "Mostramedica")
    public ArrayList<Medicamento> medicamentos() {      
        return principal.medicamentos();
    }
        @WebMethod(operationName = "Mostratipos")
    public ArrayList<Tipo_Medicamento> tipos() {      
        return principal.tipomedi();
    }
        @WebMethod(operationName = "Mostrarfarma")
    public ArrayList<Farmacia> farmacias() {      
        return principal.farmacias();
    }
        @WebMethod(operationName = "Mostrarsucurs")
    public ArrayList<Sucursal> sucursales() {      
        return principal.sucursales();
    }
    
    @WebMethod(operationName = "EliminarMedicamento")
    public Boolean actualizardinero(@WebParam(name = "parameter") Medicamento medi) {      
    return principal.eliminarmedi(medi);
    }
    
  
}
