package apex.exercicioencapsulamento;

import javax.swing.JOptionPane;

public class celular {
public celular( double tamanhoTela,double peso,String Modelo,int quantidadeMemoriaRam){
    this.tamanhoTela = tamanhoTela;
    this.peso = peso;
    this.Modelo = Modelo;
    this.quantidadeMemoriaRam = quantidadeMemoriaRam;
}
public void imprimeCelular(){
    String texto = "O Celular " + this.Modelo+
            " tem "+this.quantidadeMemoriaRam+"GB de memoria RAM com tela de "+
            this.tamanhoTela +" polegadas e pesa " + this.peso + " gramas."; 
    JOptionPane.showMessageDialog(null, texto);
}

public celular(){};
    
    
private double tamanhoTela;
private double peso;
private String Modelo;
private int quantidadeMemoriaRam;

    public double getTamanhoTela() {
        return tamanhoTela;
    }

    public double getPeso() {
        return peso;
    }

    public String getModelo() {
        return Modelo;
    }

    public int getQuantidadeMemoriaRam() {
        return quantidadeMemoriaRam;
    }

    public void setTamanhoTela(double tamanhoTela) {
        this.tamanhoTela = tamanhoTela;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public void setQuantidadeMemoriaRam(int quantidadeMemoriaRam) {
        this.quantidadeMemoriaRam = quantidadeMemoriaRam;
    }



}
