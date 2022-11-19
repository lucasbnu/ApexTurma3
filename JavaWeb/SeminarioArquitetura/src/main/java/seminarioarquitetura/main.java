/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package seminarioarquitetura;

import SA.geraSQL;
import tabelas.clientes;
import tabelas.produtos;

/**
 *
 * @author lucas
 */
public class main {

    public static void main(String[] args) {
        clientes clie = new clientes();
        clie.campo("id_cliente").valor(1681);
        clie.campo("nome_cliente").valor("Lucas teste aquitetura");
        clie.campo("idade").valor(23);
        clie.campo("ativo").valor(1);
        
        produtos prod = new produtos();
        prod.campo("id_produto").valor(55);
        prod.campo("descricao_produto").valor("Carregador notebook");
        prod.campo("preco").valor(250.0);
        prod.campo("ativo").valor(1);
        
        
        
        geraSQL SQL = new geraSQL();
       // SQL.Insert(clie);
        SQL.Insert(prod);
    }
}
