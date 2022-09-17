package apex.abstracao;


public class Abstracao {
    public static void main(String[] args) {
       cliente cli = new cliente();
       funcionario fun = new funcionario();
       fun.imprime();
       cli.imprime();
    }
}
