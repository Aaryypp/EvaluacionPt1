/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package ws;

import Controlador.Principal;
import Modelo.Usuario;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author ariel
 */
@WebService(serviceName = "WSOperaciones")
public class WSOperaciones {

    Principal principal = new Principal();
     public WSOperaciones() {
        principal.ingresodeprueba();
    }

    /**
     * Web service operation
     */
//    @WebMethod(operationName = "Login")
//    public Boolean Login(@WebParam(name = "usuario") String usuario, @WebParam(name = "contrasena") String contrasena) {
//        if (usuario.equals("Aarryypp") && contrasena.equals("1234")) {
//            return true;
//
//        }
//        return false;
//    }

    /**
     * Web service operation
     */
//    @WebMethod(operationName = "ProcesarPago")
//    public int ProcesarPago(@WebParam(name = "total") int total, @WebParam(name = "pago") int pago) {
//        if (pago >= total) {
//            return pago - total; // devuelve el cambio
//        } else {
//            return -1; // indica que el pago es insuficiente
//        }
//    }
    /**
     * Web service operation
     */
    @WebMethod(operationName = "ingresoUsuarios")
    public Usuario ingresoUsuarios(@WebParam(name = "usuario") Usuario usuario) {
        principal.ingresoUsuario(usuario);
        return null;
    }
    /**
     * Web service operation
     */
    @WebMethod(operationName = "buscarUsuario")
    public Usuario buscarUsuario(@WebParam(name = "user") String user, @WebParam(name = "contrasena") String contrasena) {
        return principal.buscaruser(user, contrasena);
    } 

    /**
     * Web service operation
     */
    @WebMethod(operationName = "actualizardinero")
    public Boolean actualizardinero(@WebParam(name = "parameter") Usuario user) {      
    return principal.actualizardinero(user);
    }
    
    
    
    
    
    
    

}
