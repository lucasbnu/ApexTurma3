package Apex.API.Mercado.modelo;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "vendas")
@Entity
public class VendasModelo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_venda")	
    public int id_venda;
	
	@Column(name = "fk_produto")	
    public int fk_produto;
	
	@Column(name = "fk_cliente")	
    public int fk_cliente;
	
	@Column(name = "quantidade")	
    public int quantidade;
}
