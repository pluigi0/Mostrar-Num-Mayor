
package Mayor;

import javax.swing.JOptionPane;

/*
Numero mayor 
*/
public class NumeroMayor {
    public static void main(String[] args) {
        int num1, num2, num3;
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog(" Ingresa un numero: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog(" Ingresa el 2do numero: "));
        num3 = Integer.parseInt(JOptionPane.showInputDialog(" Escribe el 3er numero: "));
        
        if (num1 > num2 && num2 > num3){
            JOptionPane.showMessageDialog(null, +num1+" es mayor. luego sigue: "+num2+ " y x ultimo "+num3);
        }
        if (num1 > num3 && num3 > num2){
            JOptionPane.showMessageDialog(null, +num1+" es mayor. luego sigue: "+num3+ " y x ultimo "+num2);
        }
        if (num2 > num1 && num1 > num3){
            JOptionPane.showMessageDialog(null, +num2+" es mayor. luego sigue: "+num1+ " y x ultimo "+num3);
        } 
        if (num2 > num3 && num3 > num1){
            JOptionPane.showMessageDialog(null, +num2+" es mayor. luego sigue: "+num3+ " y x ultimo "+num1);
        }        
        if (num3 > num1 && num1 > num2){
            JOptionPane.showMessageDialog(null, +num3+" es mayor. luego sigue: "+num1+ " y x ultimo "+num2);
        }
        if (num3 > num2 && num2 > num1){
            JOptionPane.showMessageDialog(null, +num3+" es mayor. luego sigue: "+num2+ " y x ultimo "+num1);
        }
        
    }
}
