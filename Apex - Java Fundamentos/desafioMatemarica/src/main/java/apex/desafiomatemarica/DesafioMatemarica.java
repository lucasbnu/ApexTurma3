/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package apex.desafiomatemarica;

import javax.swing.JOptionPane;

/**
 *
 * @author lucas
 */
public class DesafioMatemarica {

    public static void main(String[] args) {
        int numero1 = 0;
        int numero2 = 0;
        for (int i = 0; i < 3; i++) {
            numero1 = Integer.parseInt(JOptionPane.showInputDialog("Qual o primeiro numero?"));
            numero2 = Integer.parseInt(JOptionPane.showInputDialog("Qual o segundo numero?"));
            if (numero1 == numero2){
                JOptionPane.showMessageDialog(null, "A soma é: "+ (numero1+numero2));
            }else{
                JOptionPane.showMessageDialog(null, "A multiplicação é: "+ (numero1*numero2));
            }
        }
    }
}
