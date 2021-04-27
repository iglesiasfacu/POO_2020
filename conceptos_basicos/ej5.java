package conceptos_basicos;

import java.util.Scanner;

public class ej5 {
    public static void main(String[] args) {
        String nombre_mayor = "";
        long sueldo_mayor = 0, promedio = 0, ac = 0;
        Scanner lectura = new Scanner(System.in);

        for(int indice=0; indice<5; indice++){  
            System.out.print("Ingrese nombre: ");
            String nombre = lectura.nextLine();
            System.out.print("Ingrese sueldo: ");
            long sueldo = lectura.nextLong();
            ac += sueldo;
            System.out.println("*****************");
            lectura.nextLine();
            if(sueldo>sueldo_mayor){
                nombre_mayor = nombre;
                sueldo_mayor = sueldo;
            }
        }
        System.out.println("Persona con mayor sueldo: " + nombre_mayor);
        System.out.println("Sueldo bruto: U$D " + sueldo_mayor);
        promedio = ac / 5;
        System.out.println("El promedio de sueldos es: U$D " + promedio);
        lectura.close();
    }
}
