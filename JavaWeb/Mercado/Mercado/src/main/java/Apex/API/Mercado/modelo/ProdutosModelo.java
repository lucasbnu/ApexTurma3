package Apex.API.Mercado.modelo;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "produtos")
@Entity
public class ProdutosModelo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	@Column(name = "id_produto")
	private int id_produto;
	
	@Column(name = "descricao_produto")
	private String descricao_produto;
	
	@Column(name = "preco")
	private float preco;
	
	@Column(name = "ativo")
	private int ativo;

	public int getId_produto() {
		return id_produto;
	}

	public void setId_produto(int id_produto) {
		this.id_produto = id_produto;
	}

	public String getDescricao_produto() {
		return descricao_produto;
	}

	public void setDescricao_produto(String descricao_produto) {
		this.descricao_produto = descricao_produto;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public int getAtivo() {
		return ativo;
	}

	public void setAtivo(int ativo) {
		this.ativo = ativo;
	}

}
