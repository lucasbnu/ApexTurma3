/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package apex.desafionumeroprimo;

import javax.swing.JOptionPane;

/**
 *
 * @author lucas
 */
public class DesafioNumeroPrimo {

    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("informe um numero"));
        int resto = 0;
        int contador = 0;
        for (int i = 1; i <= numero; i++) {
            resto = numero % i;
            if (resto == 0){
                contador++;
            }
        }
        if (contador == 2){
           JOptionPane.showMessageDialog(null, "é um número primo");
        }else{
           JOptionPane.showMessageDialog(null, "Não é um número primo"); 
        }
    }
}
