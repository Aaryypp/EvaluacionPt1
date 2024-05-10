
package Modelo;

/**
 *
 * @author ariel
 */
public class Usuario {
    
    private String username;
    private String password;
    private Double saldo;

    public Usuario() {
    }

    public Usuario(String username, String password, Double saldo) {
        this.username = username;
        this.password = password;
        this.saldo = saldo;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    
}
