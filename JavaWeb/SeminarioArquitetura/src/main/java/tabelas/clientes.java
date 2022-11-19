/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tabelas;
import SA.Campo;
import SA.Tabela;

/**
 *
 * @author lucas
 */
public class clientes extends Tabela{

    @Override
    public void defineTabela() {
        nome = "clientes";
        campos.add(new Campo("id_cliente", Integer.class));
        campos.add(new Campo("nome_cliente",String.class));
        campos.add(new Campo("idade",Integer.class));
        campos.add(new Campo("ativo", Integer.class));
    }
    
}
