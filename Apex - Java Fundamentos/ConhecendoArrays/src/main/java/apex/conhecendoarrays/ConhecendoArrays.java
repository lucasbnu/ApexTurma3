/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package apex.conhecendoarrays;

import javax.swing.JOptionPane;

/**
 *
 * @author lucas
 */
public class ConhecendoArrays {

    public static void main(String[] args) {
        String[] nomes = new String[10];
        nomes[0] = "Jose";
        nomes[1] = "Pedro";
        nomes[2] = "Paola";
        nomes[1] = "Lucas";
        JOptionPane.showMessageDialog(null, nomes[1]);
    }
}
