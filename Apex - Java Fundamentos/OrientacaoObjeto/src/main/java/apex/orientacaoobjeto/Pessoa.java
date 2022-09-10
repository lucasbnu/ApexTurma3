package apex.orientacaoobjeto;

import javax.swing.JOptionPane;

public class Pessoa {
    public Pessoa(){  
    }
    public Pessoa(int idade){
        this.idade = idade;
    }
    
    public Pessoa(String nome){
        this.nome = nome;
    }
    
    public Pessoa(String nome, int idade){
        this.idade = idade;
        this.nome = nome;
    }
    private String nome;
    private int idade;
  
    
    
    public void imprimePessoa(){
        JOptionPane.showMessageDialog(null, "Olá "+getNome()+" sua idade é "+getIdade());
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }



    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        if (idade >= 18){
          this.idade = idade;
        }else{
            JOptionPane.showMessageDialog(null, "Você não pode cadastrar uma pessoa com menos de 18 anos");
        }
    }


}
