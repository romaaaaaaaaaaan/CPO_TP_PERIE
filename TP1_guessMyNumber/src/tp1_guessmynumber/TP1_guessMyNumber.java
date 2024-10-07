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
        int n = 0;
        int b ;
        Scanner sc1;
        sc1 = new Scanner(System.in);
        System.out.println("Saisissez un niveau de difficulté :\n"
                + " 1) Facile : trouver un nombre entre 0 et 10 \n"
                + " 2) Normal : trouver un nombre entre 0 et 100\n"
                + " 3) Difficile : trouver un nombre entre 0 et 1000 ");
        b = sc1.nextInt();
        
        if( b==1) {
        n = generateurAleat.nextInt(10);
        } else if ( b==2 ) {
        n = generateurAleat.nextInt(100);
        } else if ( b==3) {
        n = generateurAleat.nextInt(1000);    
        }
        int cpt =  1;
        int a;
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("Saisissez un nombre ");        
        a = sc.nextInt();
        while (a != n)
        {                            
        if ( a<n)
           {
               System.out.println("C'est plus !");
               System.out.println("Saisissez un nombre ");
           }else if(a>n)
           {
               System.out.println("C'est moins !");
               System.out.println("Saisissez un nombre ");
           }
        sc = new Scanner(System.in);
        a = sc.nextInt();
        cpt+=1;
        System.out.println("Nombres de tentatives : "+cpt);
        }
        System.out.println("Bravo !");
        }
        
    
}
