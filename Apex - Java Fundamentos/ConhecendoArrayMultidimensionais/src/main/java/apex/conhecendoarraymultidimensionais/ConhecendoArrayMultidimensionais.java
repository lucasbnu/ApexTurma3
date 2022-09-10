/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package apex.conhecendoarraymultidimensionais;

import javax.swing.JOptionPane;

/**
 *
 * @author lucas
 */
public class ConhecendoArrayMultidimensionais {

    public static void main(String[] args) {
        String[][] pessoas = new String[4][4];
        String textoExibir = "";
        pessoas[0][0] = "NOME";
        pessoas[0][1] = "IDADE";
        pessoas[0][2] = "SEXO";
        pessoas[0][3] = "CIDADE";
        
        pessoas[1][0] = "Lucas";
        pessoas[1][1] = "23";
        pessoas[1][2] = "M";
        pessoas[1][3] = "Blumenau";
        
        pessoas[2][0] = "Maria";
        pessoas[2][1] = "20";
        pessoas[2][2] = "F";
        pessoas[2][3] = "São Paulo";
        
        pessoas[3][0] = "Paola";
        pessoas[3][1] = "22";
        pessoas[3][2] = "F";
        pessoas[3][3] = "Blumenau";
        for(int Linha = 0; Linha < pessoas.length; Linha++){
           for(int Coluna = 0; Coluna < pessoas[0].length; Coluna++){
               textoExibir += pessoas[Linha][Coluna] +"    |    ";
           } 
           textoExibir+= "\n";
        }
        JOptionPane.showMessageDialog(null, textoExibir);

    }
}
