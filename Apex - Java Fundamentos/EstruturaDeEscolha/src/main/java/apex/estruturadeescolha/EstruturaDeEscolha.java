package apex.estruturadeescolha;

import javax.swing.JOptionPane;

public class EstruturaDeEscolha {

    public static void main(String[] args) {
         int quantidadeVotos = 0;
         int QtLucas = 0;
         int QtEliab = 0;
         int QtPaola = 0;
         int QtJose = 0;
         String voto = "";
         while (quantidadeVotos < 5 ) {
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
             quantidadeVotos++;
        }
        String mensagem = "Resultado votação:\n";
        mensagem +="Jose: "+QtJose+"\n";
        mensagem +="Paola: "+QtPaola+"\n";
        mensagem += "Lucas: "+QtLucas+"\n";
        mensagem += "Eliab: "+QtEliab+"\n";
        JOptionPane.showMessageDialog(null,mensagem);
    }
}
