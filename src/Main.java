
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Totto
 */
public class Main {

    public static void main(String[] args) {

        Cuenta cuenta = new Cuenta();
        Canal canal = new Canal();
        Valida valida = new Valida();

        Scanner leer = new Scanner(System.in);
        int opcion, cantidadSub, cantidadVideos, sueldo;
        String nombreCuenta, contrasena, correo, nombre, descripcion, cuentaCanal;
        boolean flag;

        //Canal canal999 = new Canal();
        //canal999.setCuentaCanal(cuenta);
        // valida.cuentaCanal(canal999);
        do {

            System.out.println("*****Menu*****");
            System.out.println("1.- Crear un Canal a una Cuenta : ");
            System.out.println("2.- Mostrar informacion Cuenta : ");
            System.out.println("3.- aumentar la cantidad de Sub : ");
            System.out.println("4.- Validar la contraseña de la cuenta : ");
            System.out.println("5.- Salir !!");

            opcion = leer.nextInt();
            switch (opcion) {
                case 1: {
                    do {
                        System.out.println("1.-Ingrese nombre de la cuenta : ");
                        nombreCuenta = leer.next();
                        flag = valida.validaCuenta(nombreCuenta);
                        if (flag == false) {
                            System.out.println("Favor ingresar nombre con parametros permitidos 6 a 10 caracteres : ");
                        }
                    } while (flag == false);
                    System.out.println("Ingrese contraseña : ");
                    contrasena = leer.next();
                    do {

                        System.out.println("Ingrese correo: ");
                        correo = leer.next();
                        flag = valida.validaCorreo(correo);
                        if (flag == false) {
                            System.out.println("Ingrese correo correctamente : Ejemplo 'correo@correo.cl'");
                        }
                    } while (flag == false);
                    do {
                        System.out.println("Ingrese informacion de Cuenta: ");
                        System.out.println("Nombre del Canal : ");
                        cuentaCanal = leer.next();
                        System.out.println(cuentaCanal);
                        flag = valida.validaCanal(cuentaCanal);
                        if (flag == false) {
                            System.out.println("Ingrese nombre de Canal correctamente (minimo 3 caracteres)");
                        }
                    } while (flag == false);
                    System.out.println("Ingrese cantidad de Sub : ");
                    cantidadSub = leer.nextInt();
                    System.out.println("Ingrese la cantidad de Videos: ");
                    cantidadVideos = leer.nextInt();
                    System.out.println("Ingrese nombre asociado a videos: ");
                    nombre = leer.next();
                    System.out.println("Ingrese una descrpcion: ");
                    descripcion = leer.next();
                    System.out.println("Ingrese Sueldo inicial: ");
                    sueldo = leer.nextInt();

                    cuenta.setContrasena(contrasena);
                    cuenta.setCorreo(correo);
                    cuenta.setNombreCuenta(nombreCuenta);
                    canal.setCantidadSub(cantidadSub);
                    canal.setCantidadVideos(cantidadVideos);
                    canal.setCuentaCanal(cuenta);
                    canal.setDescripcion(descripcion);
                    canal.setNombre(nombre);
                    canal.setSueldo(sueldo);
                }

                case 2:
                    System.out.println("Informacion Canal: ");
                    canal.mostrarInfoCanal();

                    break;

                case 3:
                    String newcanal;
                    System.out.println("3.-");
                    System.out.println("Ingrese nombre de la Cuenta: ");
                    newcanal = leer.next();
                    if (newcanal.equals(canal.getNombre())) {
                        canal.aumentarCantidadSub();
                    } else {
                        System.out.println("La cantidad debe ser Mayor a la actual: ");
                    }
                    break;
                case 4:

                    System.out.println("4.-Ingrese la Cuenta a validar : ");
                    String newcuenta = leer.next();
                    if (newcuenta.equals(cuenta.getNombreCuenta())) {
                        System.out.println("ingrese contraseña : ");
                        String newcontrasena = leer.next();
                        if (newcontrasena.equals(cuenta.getContrasena())) {
                            System.out.println("Contraseña Valida: ");
                        } else {
                            System.out.println("Contraseña NO Valida, volviendo a Menu: ");
                        }
                    } else {
                        System.out.println("Cuenta no existe : ");
                    }

                    break;

                case 5:
                    System.out.println("Adios...");
                    break;
            }
        } while (opcion != 5);
    }

}
