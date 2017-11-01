/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evajava1;
import javax.swing.JOptionPane;

/**
 *
 * @author LAB10
 */
public class Nomina 
{
    public static void main(String[] dato)
    {
     float sueldo,horas,valor;
     float incremento=0;
     
      horas = Float.parseFloat(JOptionPane.showInputDialog("digite su hora"));
      valor = Float.parseFloat(JOptionPane.showInputDialog("digite su valor horas "));
      sueldo=valor*horas;
       JOptionPane.showMessageDialog(null,"sueldo"+sueldo);
      
    
     
     
    }
}
