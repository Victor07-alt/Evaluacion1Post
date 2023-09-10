
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Totto
 */
public class Canal {
   private Cuenta cuentaCanal;
   private int cantidadSub,cantidadVideos,sueldo;
   private String nombre,descripcion;

    public Canal() {
    }

    public Canal(Cuenta cuenta, int cantidadSub, int cantidadVideos, int sueldo, String nombre, String descripcion) {
        this.cuentaCanal = cuenta;
        this.cantidadSub = cantidadSub;
        this.cantidadVideos = cantidadVideos;
        this.sueldo = sueldo;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    
    public Cuenta getCuentaCanal() {
        return cuentaCanal;
    }

    public void setCuentaCanal(Cuenta cuentaCanal) {
        this.cuentaCanal = cuentaCanal;
    }

    public int getCantidadSub() {
        return cantidadSub;
    }

    public void setCantidadSub(int cantidadSub) {
        this.cantidadSub = cantidadSub;
    }

    public int getCantidadVideos() {
        return cantidadVideos;
    }

    public void setCantidadVideos(int cantidadVideos) {
        this.cantidadVideos = cantidadVideos;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Canal{" + "cuenta=" + cuentaCanal + ", cantidadSub=" + cantidadSub + ", cantidadVideos=" + cantidadVideos + ", sueldo=" + sueldo + ", nombre=" + nombre + ", descripcion=" + descripcion + '}';
    }
   
    public void mostrarInfoCanal()
    {System.out.println("Nombre de la Cuenta: "+getCuentaCanal());
     System.out.println("Cantidad de Suscriptores: " +getCantidadSub());
     System.out.println("Cantidad de Videos: "+getCantidadVideos());
     System.out.println("Nombre Video: "+getNombre());
     System.out.println("Descripcion : "+getDescripcion());
        
    }
Scanner leer = new Scanner(System.in);   

    public int aumentarCantidadSub(){
    
    if(cantidadSub > 0){
        System.out.println("Ingrese la cantidad nueva de Suscriptores : ");
      this.cantidadSub = leer.nextInt();  
    }  return cantidadSub;
}
  
 public void pagarSueldo(){
 if(cantidadSub > 10000){
 this.sueldo += 500*865;
     System.out.println("Se procede a pagar "+this.getSueldo()+" Felicidades!!!");
     System.out.println("Su sueldo = $ "+this.sueldo);}
 else{
     System.out.println("No se puede cancelar sueldo, su cantidad de sub aun no es lo suficiente:");
     System.out.println("Su sueldo = $ "+this.sueldo);}
 }   
    
}
