package SA;

public class Campo {
    protected String nome;
    protected Class tipo;
    protected Object valorInterno;
    public boolean chavePrimaria = false;

    public void valor(Object valor) {
        if (valor.getClass() == tipo) {
            valorInterno = valor;
        } else {
            throw new RuntimeException("Tipo de dado inválido");
        }
    }

    public Object valor() {
        return valorInterno;
    }

    public Campo(String nome, Class tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public Campo(String nome, Class tipo, Object valorInternor) {
        this.nome = nome;
        this.tipo = tipo;
        valor(valorInternor);
    }
}
