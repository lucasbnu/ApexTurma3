package Apex.API.Mercado.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "clientes")
@Entity
public class ClientesModelo {
	
   public int getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}

	public String getNome_cliente() {
		return nome_cliente;
	}

	public void setNome_cliente(String nome_cliente) {
		this.nome_cliente = nome_cliente;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getAtivo() {
		return ativo;
	}

	public void setAtivo(int ativo) {
		this.ativo = ativo;
	}

   @Id	
   @GeneratedValue(strategy = GenerationType.IDENTITY )
   @Column(name="id_cliente")
   private int id_cliente;	
   
	@Column(name="nome_cliente")
	private String nome_cliente;   
	
	@Column(name = "idade")
	private int idade;
	
	@Column(name = "ativo")
	private int ativo;	

}
