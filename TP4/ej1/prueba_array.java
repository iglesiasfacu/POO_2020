package TP4.ej1;

public class prueba_array {
    public static void main(String[] args) {
        int [] array = new int[20];
        cargar_array(array);

        for(int c=0; c<20; c++){
            System.out.println(array[c]);
        } 
    }
}
