package apex.interfaces;

public class Interfaces {

    public static void main(String[] args) {
        funcionario fun1 = new funcionario();
        fun1.altura = 1.81;
        fun1.idade = 40;
        fun1.nome = "Saulo";
        fun1.imprime();
        fun1.limpaValores();
        fun1.imprime();
    }
}
