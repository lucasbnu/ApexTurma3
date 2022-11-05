package Apex.API.Mercado.controle;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import Apex.API.Mercado.modelo.ProdutosModelo;
import Apex.API.Mercado.repositorio.ProdutosRepositorio;

@RequestMapping("/produtos")
@RestController
public class ProdutosControle {
	@Autowired
	ProdutosRepositorio rep;

	@GetMapping(path = "buscar")
	public List<ProdutosModelo> buscar() {
		return rep.findAll();
	}

	@GetMapping(path = "buscar/{codigo}")
	public ProdutosModelo buscaPorID(@PathVariable("codigo") Integer codigo) {
		Optional<ProdutosModelo> produto = rep.findById(codigo);
		return produto.get();
	}

	@PostMapping(path = "salvar")
	public void salvar(@RequestBody ProdutosModelo prod) {
		rep.save(prod);
	}

	@DeleteMapping(path = "deletar/{codigo}")
	public void deletar(@PathVariable("codigo") Integer codigo) {
		try {
			rep.deleteById(codigo);
		} catch (Exception e) {
			System.out.print(e.getMessage());
		}
	}

	@RequestMapping(path = "altera", method = RequestMethod.PUT)
	public void altera(@RequestBody ProdutosModelo prod) {
		try {
			rep.save(prod);
		} catch (Exception e) {
			System.out.print(e.getMessage());
		}
	}

}
