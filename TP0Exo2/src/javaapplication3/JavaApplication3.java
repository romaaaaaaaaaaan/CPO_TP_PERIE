/*
TP0 Ex2
20/09/2024
 */
package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author roman
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Declaration des variables
        int nb; // nombre d'entiers a additionner
        int result; // resultat
        int ind; // indice
        sc = new Scanner(System.in);
        nb=Scanner;
        nb = new Scanner(System.in);
        System.out.println("Saisissez le nombre d'entiers  à additionner")
        
        // Addition des nb premiers entiers
        ind=1;
        while (ind <= nb) {
            result=result+ind;
            ind+=1;
        }
        
        // Affichage du resultat
        System.out.println("la somme des"+ nb +"entiers est: "+result);
    }
    
}
