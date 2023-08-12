
package FuncionalidadMoneda;


public class Conversor extends Divisas{
    
    
    //Metodo que decidira que operacion se debe hacer
    public static double sentOption(String option, double valor){
        
        double res = 0;
        
        Divisas D = new Divisas();
        
        switch(option){
        
            case "Peso DominicanoPeso Mexicano" -> res = ConversorFuncion.funcion2(valor, D.PesoDomMex);
            
            case "Peso DominicanoDolar Estadounidense" -> res = ConversorFuncion.funcion2(valor, D.PesoDomDolar);
            
            case "Peso DominicanoReal Brasileño" -> res = ConversorFuncion.funcion2(valor, D.PesoDomReal);
            
            case "Peso DominicanoEuro" -> res = ConversorFuncion.funcion2(valor, D.PesoDomEuro);
            
            case "Peso DominicanoYen" -> res = ConversorFuncion.funcion(valor, D.PesoDomYen);

            
            case "Peso MexicanoPeso Dominicano" -> res = ConversorFuncion.funcion(valor, D.PesoDomMex);
            
            case "Peso MexicanoDolar Estadounidense" -> res = ConversorFuncion.funcion2(valor, D.DolarMex);
            
            case "Peso MexicanoReal Brasileño" -> res = ConversorFuncion.funcion2(valor, D.MexReal);
            
            case "Peso MexicanoEuro" -> res = ConversorFuncion.funcion2(valor, D.MexEuro);
            
            case "Peso MexicanoYen" -> res = ConversorFuncion.funcion(valor, D.MexYen);

            
            case "Real BrasileñoDolar Estadounidense" -> res = ConversorFuncion.funcion2(valor, D.RealDolar);
            
            case "Real BrasileñoEuro" -> res = ConversorFuncion.funcion2(valor, D.EuroReal);
            
            case "Real BrasileñoYen" -> res = ConversorFuncion.funcion(valor, D.RealYen);
            
            case "Real BrasileñoPeso Mexicano" -> res = ConversorFuncion.funcion(valor, D.MexReal);
            
            case "Real BrasileñoPeso Dominicano" -> res = ConversorFuncion.funcion(valor, D.PesoDomReal);


            
            case "Dolar EstadounidensePeso Dominicano" -> res = ConversorFuncion.funcion(valor, D.PesoDomDolar);
            
            case "Dolar EstadounidenseReal Brasileño" -> res = ConversorFuncion.funcion(valor, D.RealDolar);
            
            case "Dolar EstadounidensePeso Mexicano" -> res = ConversorFuncion.funcion(valor, D.DolarMex);
            
            case "Dolar EstadounidenseEuro" -> res = ConversorFuncion.funcion2(valor, D.EuroDolar);
            
            case "Dolar EstadounidenseYen" -> res = ConversorFuncion.funcion(valor, D.YenDolar);


            case "EuroDolar Estadounidense" -> res = ConversorFuncion.funcion(valor, D.EuroDolar);
            
            case "EuroReal Brasileño" -> res = ConversorFuncion.funcion(valor, D.EuroReal);
            
            case "EuroPeso Mexicano" -> res = ConversorFuncion.funcion(valor, D.MexEuro);
            
            case "EuroPeso Dominicano" -> res = ConversorFuncion.funcion(valor, D.PesoDomEuro);
            
            case "EuroYen" -> res = ConversorFuncion.funcion(valor, D.EuroYen);


            case "YenPeso Dominicano" -> res = ConversorFuncion.funcion2(valor, D.PesoDomYen);
            
            case "YenPeso Mexicano" -> res = ConversorFuncion.funcion2(valor, D.MexYen);
            
            case "YenDolar Estadounidense" -> res = ConversorFuncion.funcion2(valor, D.YenDolar);
            
            case "YenReal Brazileño" -> res = ConversorFuncion.funcion2(valor, D.RealYen);
            
            case "YenEuro" -> res = ConversorFuncion.funcion2(valor, D.EuroYen);

        
        }
        //Retornando el valor al campo de salida
        
        return res;
    }    
    
     
}
