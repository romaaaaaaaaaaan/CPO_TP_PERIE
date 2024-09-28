/*
 * TP1 Exo3
27/09/2024
 */
package tp1_guessmynumber;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author roman
 */
public class TP1_guessMyNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random generateurAleat = new Random();
        int n = generateurAleat.nextInt(100);
        int cpt =  1;
        
        int a;
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("Saisissez un nombre entre 1 et 100");        
        a = sc.nextInt();
        while (a != n)
        {
        
                    
        
        if ( a<n)
           {
               System.out.println("C'est plus !");
               System.out.println("Saisissez un nombre entre 1 et 100");
           }else if(a>n)
           {
               System.out.println("C'est moins !");
               System.out.println("Saisissez un nombre entre 1 et 100");
           }
        sc = new Scanner(System.in);
        a = sc.nextInt();
        cpt+=1;
        System.out.println("Nombres de tentatives : "+cpt);
        }
        }
        
    
}
