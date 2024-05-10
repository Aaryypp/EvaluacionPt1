/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Usuario;
import java.util.ArrayList;

/**
 *
 * @author ariel
 */
public class Principal {

    private final ArrayList<Usuario> usuarios = new ArrayList<>();

    public void ingresoUsuario(Usuario user) {
        usuarios.add(user);
    }

    public Usuario buscaruser(String user, String contrasena) {

        for (Usuario usu : usuarios) {
            if (usu.getUsername().equals(user) && usu.getPassword().equals(contrasena)) {
                return usu;
            }
        }
        return null;
    }

    public void ingresodeprueba() {
        usuarios.add(new Usuario("aarryypp", "1234", 100.0));
        usuarios.add(new Usuario("elcrack", "1234", 0.0));
        usuarios.add(new Usuario("ariel", "1234", 0.0));
    }
    
     public  Boolean actualizardinero(Usuario user) {
          for (Usuario usu :usuarios) {
            if (usu.getUsername().equals(user.getUsername()) && usu.getPassword().equals(user.getPassword())) {
                usu.setSaldo(user.getSaldo()); 
               return true;     
            }
        }
        return false;            
    }    
}
