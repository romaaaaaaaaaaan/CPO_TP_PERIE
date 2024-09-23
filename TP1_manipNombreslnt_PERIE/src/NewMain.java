
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
        
        int a = 0; // déclaration des 2 variables entières a et b
        int b = 0;
        
        Scanner sc1;   
        sc1 = new Scanner(System.in);
        System.out.println("Saisissez un premier nombre entier.");
        a = sc1.nextInt(); // on demande de saisir le premier entier et on le stock dans la variable a
        
        Scanner sc2;
        sc2 = new Scanner(System.in);
        System.out.println("Saisissez un second nombre entier.");
        b = sc2.nextInt(); // on demande de saisir le second entier et on le stock dans la variable b
        
        System.out.println("addition:"+a+"+"+b+"="+(a+b)+"\n" // affichage de la somme
                + "soustraction:"+a+"-"+b+"="+(a-b)+"\n" // affichage de la soustraction
                + "produit:"+a+"x"+b+"="+(a*b)) // affichage du produit
        System.out.println("quotien entier de la division euclidienne de "+a+" par "+b+" : "+(a/b)+"\n"
                +"reste :"+(a%b)); // affichage de la division ( quotien entier et reste )

    }
    
}