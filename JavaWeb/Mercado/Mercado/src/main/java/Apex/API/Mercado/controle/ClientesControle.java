package Apex.API.Mercado.controle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Apex.API.Mercado.modelo.ClientesModelo;
import Apex.API.Mercado.repositorio.ClientesRepositorio;


@RequestMapping("/clientes")
@RestController
public class ClientesControle {
	@Autowired
	ClientesRepositorio rep;
	
	@GetMapping(path = "buscar")
	public List<ClientesModelo> buscar(){
		return rep.findAll();
	}

}
