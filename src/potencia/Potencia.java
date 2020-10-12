/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package potencia;

import javax.swing.JOptionPane;

/**
 *
 * @author cristian
 */
public class Potencia {

    /**
     * @param args the command line arguments
     */
  
    public static void main(String[] args) {
        // TODO code application logic here
        int b=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la base: "));
        int e = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la potencia: "));
        int r=0,n=1;
        for(int h=0;h<e;h++){
            r=0;
        for(int i=0;i<b;i++){
        r+=n;
        }
        n=r;
        }
    
    JOptionPane.showMessageDialog(null, "La patencia es:  "+ r); 
    }
    
}
