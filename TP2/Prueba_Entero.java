package TP2;

import java.util.Scanner;

public class Prueba_Entero {
    public static void main(String[] args) {
        int num;
        Scanner in = new Scanner(System.in);
        Entero e = new Entero(0);

        //añado numero al set
        System.out.print("Ingrese un numero: ");
        num = in.nextInt();
        e.setNumero(num);

        //metodos
        System.out.println("El numero ingresado es: "+e.getNumero());
        System.out.println("El cuadrado de " + e.getNumero() + " es: " + e.cuadrado());
        if(e.par_impar()){
            System.out.println("El numero ingresado es par");
        }
        else{
            System.out.println("El numero ingresado es impar");
        }
        System.out.println("El factorial de " + e.getNumero() + " es: " + e.factorial());

        in.close();
    }
}