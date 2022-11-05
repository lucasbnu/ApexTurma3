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

import Apex.API.Mercado.modelo.VendasModelo;
import Apex.API.Mercado.repositorio.VendasRepositorio;

@RequestMapping("/vendas")
@RestController
public class VendasControle {
	@Autowired
	VendasRepositorio rep;

	@GetMapping(path = "buscar")
	public List<VendasModelo> buscar() {
		return rep.findAll();
	}

	@GetMapping(path = "buscar/{codigo}")
	public VendasModelo buscaPorID(@PathVariable("codigo") Integer codigo) {
		Optional<VendasModelo> venda = rep.findById(codigo);
		return venda.get();
	}

	@PostMapping(path = "salvar")
	public void salvar(@RequestBody VendasModelo vend) {
		rep.save(vend);
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
	public void altera(@RequestBody VendasModelo vend) {
		try {
			rep.save(vend);
		} catch (Exception e) {
			System.out.print(e.getMessage());
		}
	}

}
