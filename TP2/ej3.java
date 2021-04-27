package TP2;

import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese una palabra: ");
        String palabra = in.nextLine();
    
        int inc = 0;
        int dec = palabra.length()-1;
        boolean validacion = false;

        while(inc<dec && !validacion){
			
            if (palabra.charAt(inc)==palabra.charAt(dec)){
                inc++;
                dec--;
            }
            else{
                validacion = true;
            }
        }

        if (validacion){
            System.out.println(palabra + " NO es palindromo");
        }
        else{
            System.out.println(palabra + " es palindromo");
        }
        in.close();
    }
}
