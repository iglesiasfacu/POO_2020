package TP2;

//clase entero
public class Entero {
    private int numero;

    //constructor de la clase
    public Entero(int numero) {
        super();
        this.numero = numero;
    }

    //get deuvelve dato
    public int getNumero() {
        return numero;
    }
    
    //set escribe/modifica dato
    public void setNumero(int numero) {
        this.numero = numero;
    }

    //calcula el cuadrado de n
    public long cuadrado(){
        return numero*numero;
    }

    public boolean par_impar(){
        boolean val = false;
        if(numero % 2 == 0)
            val = true; 
        return val;
    }

    public long factorial(){
        long factorial = 1;
        while(numero>0){
            factorial*=numero;
            numero--;
        }
        return factorial;
    }

}
