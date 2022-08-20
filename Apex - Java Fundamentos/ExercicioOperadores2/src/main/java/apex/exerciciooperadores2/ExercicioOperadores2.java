package apex.exerciciooperadores2;

import javax.swing.JOptionPane;

public class ExercicioOperadores2 {

    public static void main(String[] args) {
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Para concluir a compra, qual sua idade?"));
        if (idade >= 18){
            System.out.println("compra realizada!"); 
        }else{
            System.out.println("você não tem idade para concluir a compra!");
        }
    }
}
