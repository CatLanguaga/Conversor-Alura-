package conversor.Principal;

import Ventanas.InterfazMoneda;
import Ventanas.InterfazTemperatura;
import javax.swing.JOptionPane;



public class Principal {

    public static void main(String[] args) {
        
            //Mensaje para elegir
            
            String o = (JOptionPane.showInputDialog(null, "¿Que desea hacer?", 
                    "Conversor", JOptionPane.QUESTION_MESSAGE, null, 
                    new Object[] {"Conversor de Moneda", "Conversor de Temperatura"}, "Seleccion")).toString();
            
            
            switch(o){
                
                case "Conversor de Moneda" -> {
                    InterfazMoneda im = new InterfazMoneda();
                    
                    im.setVisible(true);
                    im.setLocationRelativeTo(null);
                    
                    
            }
                        
                
                
                case "Conversor de Temperatura" -> {
                    InterfazTemperatura iT = new InterfazTemperatura();
                    
                    iT.setVisible(true);
                    iT.setLocationRelativeTo(null);
            }
                
            }
            
            

        
                
    }
}
