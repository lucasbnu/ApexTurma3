/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package apex.exerciciofor;

import javax.swing.JOptionPane;

/**
 *
 * @author lucas
 */
public class ExercicioFor {

    public static void main(String[] args) {
        String senhaDigitada = "";
        int acertos = 0;
        for (int i = 0; i < 5; i++) {
            senhaDigitada = JOptionPane.showInputDialog("Qual a senha?");
            if (senhaDigitada.equals("apex")) {
                acertos++;
            }
        }
        JOptionPane.showMessageDialog(null, "Você acertou "+acertos+" vezes a senha!");
        switch (var) {
            case "CHAPEU":
                
                break;
            case "PICAPAU":
                 
                break;
            default:
               
        }
    }
}
