package apex.conhecendoarraysnumericos;

import javax.swing.JOptionPane;




public class ConhecendoArraysNumericos {

    public static void main(String[] args) {
        int[] idades = new int[3];
        idades[0] = 23;
        idades[1] = 20;
        idades[2] = 18;
        String texto = " Lista de Idades:";
        

        for (int idade : idades) {
          texto += "\n"+idade;    
        }
        JOptionPane.showMessageDialog(null, texto);
        
        
        double[] notas = new double[3];
        notas[0] = 10;
        notas[1] = 8.5;
        notas[2] = 7.5;
        texto = " Lista de notas:";
        for(double nota : notas ){// For Each 
           texto += "\n"+nota;  
        }
        JOptionPane.showMessageDialog(null, texto);
        
        
    }
}
