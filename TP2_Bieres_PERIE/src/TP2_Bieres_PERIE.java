

/*
TP2 Exo1
07/10/2024
 */

/**
 *
 * @author roman
 */
public class TP2_Bieres_PERIE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls", (float) 7.0,  "Dubisson") ;
        uneBiere.ouverte = false ;
        
        uneBiere.lireEtiquette();
        
        BouteilleBiere leffe = new BouteilleBiere("Leffe", (float) 6.6, "Abbaye de Leffe") ;
        leffe.ouverte = false;
        
        leffe.lireEtiquette();
        
        BouteilleBiere autreBiere = new BouteilleBiere("Leffe", (float) 6.6,"Abbaye de Leffe") ;
        
        
        System.out.println(uneBiere) ;

    }
    
}
