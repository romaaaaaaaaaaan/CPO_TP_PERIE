/*
 * TP1 Exo2
23/09/2024
 */
package tp1_convertisseur_perie;

import java.util.Scanner;

/**
 *
 * @author roman
 */
public class TP1_convertisseur_PERIE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double t=0;
        
        Scanner sc1;
        sc1 = new Scanner(System.in);
        System.out.println("Saisissez une valeur.");
        t = sc1.nextDouble();
        System.out.println("Valeur saisie:"+t);
        
        int c;
        
        Scanner sc2;
        sc2 = new Scanner(System.in);
        System.out.println("Saisissez la conversion que vous souhaiter effectuer. \n"
                + "1) De Celcius vers Kelvin  \n"
                + "2) De Kelvin vers Celcius \n"
                + "3) De Farenheit vers Celcius \n"
                + "4) De Celcius vers Farenheit \n"
                + "5) De Kelvin vers Farenheit \n"
                + "6) De Farenheit vers Kelvin");
        
        c = sc2.nextInt();
        
        if(c==1)
        {
         System.out.println(t+" degres Celcius est egal a "+CelciusVersKelvin(t)+" degres Kelvin");     
        }
        else if(c==2)
        {
         System.out.println(t+" degres Kelvin est egal a "+KelvinVersCelcius(t)+" degres Celcius");  
        }
        else if(c==3)
        {
        System.out.println(t+" degres Farenheit est egal a "+FarenheitVersCelcius(t)+" degres Celcius");   
        }
        else if(c==4)
        {
        System.out.println(t+" degres Celcius est egal a "+CelciusVersFarenheit(t)+" degres Farenheit");   
        }
        else if(c==5)
        {
        System.out.println(t+" degres Kelvin est egal a "+KelvinVersFarenheit(t)+" degres Farenheit");   
        }
        else if(c==6)
        {
        System.out.println(t+" degres Farenheit est egal a "+FarenheitVersKelvin(t)+" degres Kelvin");
        }

    }
    public static double CelciusVersKelvin (double tCelcius) {
        
     double tKelvin;
     tKelvin = 273 + tCelcius;
     return tKelvin;
        
    }
    
    public static double KelvinVersCelcius (double tKelvin) {
        
     double tCelcius;
     tCelcius = tKelvin - 273;
     return tCelcius;
  
    }
    
    public static double FarenheitVersCelcius (double tFarenheit) {
        
        double tCelcius;
        tCelcius = (tFarenheit - 32)/1.8;
        return tCelcius;
    }
    
    public static double CelciusVersFarenheit (double tCelcius) {
        
        double tFarenheit;
        tFarenheit = tCelcius*1.8 + 32;
        return tFarenheit;
    }
    
    public static double KelvinVersFarenheit (double tKelvin) {
        
        double tFarenheit;
        tFarenheit = 1.8*(KelvinVersCelcius(tKelvin))+32;
        return tFarenheit;
    }
    
    public static double FarenheitVersKelvin (double tFarenheit) {
        
        double tKelvin;
        tKelvin = (tFarenheit - 32)/1.8 + 273;
        CelciusVersKelvin((FarenheitVersCelcius(tFarenheit)));
        return tKelvin;
    }
    
    
    

    
}
