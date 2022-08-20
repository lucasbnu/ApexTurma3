/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package apex.exerciciooperadores;

import javax.swing.JOptionPane;

/**
 *
 * @author lucas
 */
public class ExercicioOperadores {

    public static void main(String[] args) {
        int faltas = 0;
        double media = 0.0;
        faltas = Integer.parseInt(JOptionPane.showInputDialog("Quantas faltas o aluno tem?"));
        media = Double.parseDouble(JOptionPane.showInputDialog("Qual a média do aluno?"));
        if (faltas <= 10 && media >= 7.0){
            System.out.println("Aluno aprovado!");
        }else{
           System.out.print("Aluno reprovou!");
           
        }
    }
}
