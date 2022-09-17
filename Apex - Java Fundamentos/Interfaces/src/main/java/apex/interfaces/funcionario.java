package apex.interfaces;

import javax.swing.JOptionPane;

public class funcionario implements primeiraInteface {
    public String nome;
    public int idade;
    public double altura;
    @Override
    public void imprime() {
        JOptionPane.showMessageDialog(null, "O Funcionario "+nome+" tem "+
                idade+" anos e "+altura+ " metros de altura");
    }

    @Override
    public void limpaValores() {
        nome = "sem_nome";
        idade = 0;
        altura = 0;
    }
    
}
