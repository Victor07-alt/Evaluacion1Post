/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Totto
 */
public class Valida {

    public Valida() {
    }
 String nombreCuenta,correo,cuentaCanal;
 int cantidadSub;
 
 
    public boolean validaCuenta(String nombreCuenta){
    if (nombreCuenta.length()>=6 && nombreCuenta.length()<=10){return true;
    }else{return false;}}
    
    public boolean validaCorreo(String correo){
    if (correo.contains("@")){
    return true;}
    else{return false;}}
    
    public boolean validaCanal(String cuentaCanal){
        System.out.println(cuentaCanal);
    if(cuentaCanal.length() >= 3){
    return true;}else{return false;}
    }
 
    public boolean validaSuscriptores(){
    if(cantidadSub >= 0){
    return true;}else{return false;}}
    
    
}
