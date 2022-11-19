/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tabelas;

import SA.Campo;
import SA.Tabela;
public class produtos extends Tabela{

    @Override
    public void defineTabela() {
        nome = "produtos";
        campos.add(new Campo("id_produto",Integer.class));
        campos.add(new Campo("descricao_produto",String.class));
        campos.add(new Campo("preco",Double.class));
        campos.add(new Campo("ativo",Integer.class));
    }
    
}
