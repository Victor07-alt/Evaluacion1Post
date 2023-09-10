/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Totto
 */
public class Cuenta {
    
    private String nombreCuenta;
    private String correo;
    private String contrasena;

    public Cuenta() {
    }

    public Cuenta(String cuenta, String correo, String contrasena) {
        this.nombreCuenta = cuenta;
        this.correo = correo;
        this.contrasena = contrasena;
    }

    public String getNombreCuenta() {
        return nombreCuenta;
    }

    public void setNombreCuenta(String nombreCuenta) {
        this.nombreCuenta = nombreCuenta;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "cuenta=" + nombreCuenta + ", correo=" + correo + ", contrasena=" + contrasena + '}';
    }
    
    
    
}
