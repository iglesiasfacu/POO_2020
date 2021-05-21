package TP4.ej1;

public class array {
    int [] array = new int[20];
    
    public void cargar_array(int [] array){
        for(int c=0; c<20; c++){
            array[c] = (int)(Math. random()*20+1);
        }
    }
}
