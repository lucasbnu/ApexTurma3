

package apex.orientacaoobjeto;


public class OrientacaoObjeto {

    public static void main(String[] args) {
        /*
        Fazer uma classe Computador
        com os atributos:
        
        private String processador;
        private int memoriaRam;
        private String placaDeVideo;
        
        Criar um construtor para a classe que define os 3 atributos
        
        
        */
        
       Pessoa p1 = new Pessoa(23);
       p1.setNome("Jose");
       
       String nomeLocal = p1.getNome();
       carro c1 = new carro();
       p1.setNome("Pedro");
       c1.Marca = "Chevrolet";
       c1.Modelo = "Onix";
       
     
        p1.imprimePessoa();
       c1.imprimeCarro();
    }
}
