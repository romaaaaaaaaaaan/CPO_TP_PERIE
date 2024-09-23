
import java.util.Scanner;

/*
 * TP1 Exo1
23/09/2024
 */

/**
 *
 * @author roman
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int a = 0;
        int b = 0;
        
        Scanner sc1;   
        sc1 = new Scanner(System.in);
        System.out.println("Saisissez un premier nombre entier.");
        a = sc1.nextInt();
        
        Scanner sc2;
        sc2 = new Scanner(System.in);
        System.out.println("Saisissez un second nombre entier.");
        b = sc2.nextInt();
        
        System.out.println("addition:"+a+"+"+b+"="+(a+b)+"\n"
                + "soustraction:"+a+"-"+b+"="+(a-b)+"\n"
                + "produit:"+a+"x"+b+"="+(a*b));
        System.out.println("quotien entier de la division euclidienne de "+a+" par "+b+" : "+(a/b)+"\n"
                +"reste :"+(a%b));

    }
    
}