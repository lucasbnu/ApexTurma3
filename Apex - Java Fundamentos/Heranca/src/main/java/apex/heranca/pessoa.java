package apex.heranca;

import javax.swing.JOptionPane;

public class pessoa {
    public String nome;
    public int idade;

    public void imprimePessoa(){
        JOptionPane.showMessageDialog(null, nome +  " tem " + idade);
    }
}
