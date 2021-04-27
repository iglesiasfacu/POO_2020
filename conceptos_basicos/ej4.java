package conceptos_basicos;

import java.util.*;

public class ej4 {
    public static void main(String[] args) {
        int[] array = {4,2,3,8,1};
        int limite = array.length;

        // barrido array
        System.out.println("ARRAY");
        for(int indice=0; indice<limite; indice++){
            System.out.println(array[indice]);
        }
        System.out.println();

        // numero mayor
        int mayor = array[0];
        for(int indice=0; indice<limite; indice++){
            if(array[indice] > mayor){
                mayor = array[indice];
            }
        }
        System.out.println("El numero mayor del array es: " + mayor);

        // promedio
        double promedio = 0;
        int ac = 0;
        for(int indice=0; indice<limite; indice++){
            ac += array[indice];
        }
        promedio =  (double)ac / limite;
        System.out.println("El promedio de todos los numeros es: " + promedio + "\n");

        // array ordenado
        Arrays.sort(array);
        System.out.println("ARRAY ORDENADO");
        for(int indice=0; indice<limite; indice++){
            System.out.println(array[indice]);
        }
        System.out.println();

        // array inverso
        int cont = 4;
        int [] array_inverso = {0,0,0,0,0}; //{1,2,3,4,8}
        for(int indice=0; indice<limite; indice++){
            array_inverso[indice] = array[cont];
            cont--;
        }
        System.out.println("ARRAY INVERTIDO");
        for(int indice=0; indice<limite; indice++){
            System.out.println(array_inverso[indice]);
        }
    }
}
