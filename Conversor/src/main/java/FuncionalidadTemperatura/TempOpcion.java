package FuncionalidadTemperatura;

public class TempOpcion {
    
    public static double sentOption(String option, double valor){
        
        double res = 0;
        

        //metodo que decidira que operacion hacer
        switch(option){
        
            case "CelsiusFahrenheit" -> res = valor * 1.8 +32;
            
            case "CelsiusKelvin" -> res = valor + 273.15;
            
            case "FahrenheitCelsius" -> res = (valor - 32) / 1.8;
            
            case "FahrenheitKelvin" -> res = ((valor - 32) / 1.8) + 273.15;
            
            case "KelvinCelsius" -> res = valor - 273.15;

            case "KelvinFahrenheit" -> res = 1.8 * (valor - 273.15) + 32;
            
        }
        //Retornando el valor al campo de salida
        
        return res;
    }
    
}
