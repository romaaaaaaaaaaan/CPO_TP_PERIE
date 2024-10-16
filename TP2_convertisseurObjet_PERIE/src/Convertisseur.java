/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author roman
 */
public class Convertisseur {
    
    int nbConversions = 0 ;
    

  
public  double CelciusVersKelvin (double tCelcius) {
        
     double tKelvin;
     tKelvin = 273 + tCelcius;
     return tKelvin;
        
    }
    
    public  double KelvinVersCelcius (double tKelvin) {
        
     double tCelcius;
     tCelcius = tKelvin - 273;
     return tCelcius;
  
    }
    
    public  double FarenheitVersCelcius (double tFarenheit) {
        
        double tCelcius;
        tCelcius = (tFarenheit - 32)/1.8;
        return tCelcius;
    }
    
    public  double CelciusVersFarenheit (double tCelcius) {
        
        double tFarenheit;
        tFarenheit = tCelcius*1.8 + 32;
        return tFarenheit;
    }
    
    public  double KelvinVersFarenheit (double tKelvin) {
        
        double tFarenheit;
        tFarenheit = 1.8*(KelvinVersCelcius(tKelvin))+32;
        return tFarenheit;
    }
    
    public  double FarenheitVersKelvin (double tFarenheit) {
        
        double tKelvin;
        tKelvin = (tFarenheit - 32)/1.8 + 273;
        CelciusVersKelvin((FarenheitVersCelcius(tFarenheit)));
        return tKelvin;
    }

@Override
public String toString () {
 return "nb de conversions"+ nbConversions;
}    
    
}
