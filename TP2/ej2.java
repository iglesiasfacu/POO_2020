package TP2;

import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) {
        int n1, n2, n3;
        long producto = 0, suma = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        n1 = in.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        n2 = in.nextInt();
        System.out.print("Ingrese el tercer numero: ");
        n3 = in.nextInt();
        System.out.println();

        if(n1>0){
            producto = n2*n3;
            System.out.print(n2 + " * " + n3 + " = " + producto);
        }
        else{
            suma = n2+n3;
            System.out.print(n2 + " + " + n3 + " = " + suma);
        }
        in.close();
    }
}
