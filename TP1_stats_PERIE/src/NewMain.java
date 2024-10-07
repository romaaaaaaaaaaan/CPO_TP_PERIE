
import java.util.Random;
import java.util.Scanner;

/*
 * TP1 Exo 4
07/10/2024
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
    
    int [] tableau = new int[6];
    int m=0;
    Scanner sc;
    sc = new Scanner(System.in);   
    System.out.println(" Saisissez un nombre entier m ");
    m = sc.nextInt();
    
    int n=0;
    int i;
    for (i=0; i<m; ++i) {
    Random generateurAleat = new Random();
    n = generateurAleat.nextInt(6);
    tableau[n]+=1;
    }
    System.out.println("pourcentage de 1 obtenus : "+tableau[0]*100.0/m + " pourcent \n"
            +"pourcentage de 2 obtenus : "+tableau[1]*100.0/m + " pourcent \n"
            + "pourcentage de 3 obtenus : "+tableau[2]*100.0/m + " pourcent \n"
            +"pourcentage de 4 obtenus : "+tableau[3]*100.0/m + " pourcent \n"
            +"pourcentage de 5 obtenus : "+tableau[4]*100.0/m + " pourcent \n"
            +"pourcentage de 6 obtenus : "+tableau[5]*100.0/m + " pourcent");
              
            
    }
    
}
