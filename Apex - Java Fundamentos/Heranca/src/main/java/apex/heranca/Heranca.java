

package apex.heranca;

import javax.swing.JOptionPane;


public class Heranca {
    public static void idadeAniversario(pessoa p){
        JOptionPane.showMessageDialog(null, "quando fizer aniversario tera "+(p.idade+1));
    }

    public static void main(String[] args) {
        caixa caixa1 = new caixa();
        caixa1.cracha = "0002";
        caixa1.idade = 21;
        caixa1.nome = "maria joaquina";
        caixa1.saldo = 150.75;
        caixa1.imprimePessoa();
        idadeAniversario(caixa1);
                
                
        funcionario fun1 = new funcionario();
        fun1.cracha = "0001";
        fun1.nome = "lucas";
        fun1.idade = 23;
        fun1.imprimePessoa();
        idadeAniversario(fun1);
       
        cliente cli = new cliente();
        cli.nome = "paola";
        cli.idade = 22;
        cli.imprimePessoa();
        idadeAniversario(cli);
    }
}
