/*
 TP0 Exo3
20/09/2024
 */
package tp0exo3;

import java.util.Scanner;

/**
 *
 * @author roman
 */
public class TP0Exo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Please enter the operator:\n" //demande du type d'operateur
                + "1) add \n"
                + "2) substract \n"
                + "3) multiply \n"
                + "4) divide \n"
                + "5) modulo \n");
        int op;
        Scanner sc = new Scanner(System.in); 
        op = sc.nextInt();
        
        int operande1;
        int operande2;
        System.out.println("saisissez une première valeure");
        Scanner sc1 = new Scanner(System.in);
        operande1 = sc1.nextInt();
        
        System.out.println("saisissez une deuxième valeure");
        Scanner sc2 = new Scanner(System.in);
        operande1 = sc2.nextInt();
    }
    
}
