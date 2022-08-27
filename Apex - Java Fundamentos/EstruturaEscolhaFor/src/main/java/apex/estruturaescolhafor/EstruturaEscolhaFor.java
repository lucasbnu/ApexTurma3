/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package apex.estruturaescolhafor;

import javax.swing.JOptionPane;

/**
 *
 * @author lucas
 */
public class EstruturaEscolhaFor {

    public static void main(String[] args) {
         
         int QtLucas = 0;
         int QtEliab = 0;
         int QtPaola = 0;
         int QtJose = 0;
         String voto = "";
         for (int quantidadeVotos = 0; quantidadeVotos < 5; quantidadeVotos++ ) {
             voto = JOptionPane.showInputDialog("Em quem você vota?");
             switch (voto) {
                 case "jose":
                      QtJose++;
                     break;
                 case "lucas":
                     QtLucas++;
                     break;
                 case "eliab":
                     QtEliab++;
                     break;
                 case "paola":
                    QtPaola++;
                     break;
                 default:
                     JOptionPane.showMessageDialog(null,"Candidato Inexistente, Voto Anulado!");
                     
             }
        }
        String mensagem = "Resultado votação:\n";
        mensagem +="Jose: "+QtJose+"\n";
        mensagem +="Paola: "+QtPaola+"\n";
        mensagem += "Lucas: "+QtLucas+"\n";
        mensagem += "Eliab: "+QtEliab+"\n";
        JOptionPane.showMessageDialog(null,mensagem);
    }
}
