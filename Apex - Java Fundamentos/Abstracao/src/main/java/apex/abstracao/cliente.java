package apex.abstracao;

public class cliente extends pessoa {
    public String codigo_cliente;

    @Override
    public void imprime() {
        System.out.println("é um cliente");
    }
}
