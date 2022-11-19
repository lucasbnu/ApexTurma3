package SA;

import java.util.ArrayList;

public abstract class Tabela {
    public String nome;
    public ArrayList<Campo> campos = new ArrayList<Campo>();

    public abstract void defineTabela();

    public Tabela() {
        defineTabela();
    }

    public Campo campo(String nome) {
        for (Campo c : campos) {
            if (c.nome.equals(nome)) {
                return c;
            }
        }
        throw new RuntimeException("Campo não encontrado");
    }

}
