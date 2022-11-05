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


    @GetMapping(path = "buscar/{codigo}")
    public ClientesModelo buscaPorID(@PathVariable("codigo") Integer codigo ) {
		Optional<ClientesModelo> cliente = rep.findById(codigo);
		return cliente.get();
    }	
    
    @PostMapping(path = "salvar")
    public void salvar(@RequestBody ClientesModelo cli) {
    	rep.save(cli);
    }
    
    @DeleteMapping(path = "deletar/{codigo}")
    public void deletar(@PathVariable("codigo") Integer codigo ) {
    	try {
		  rep.deleteById(codigo);	
		} catch (Exception e) {
		      System.out.print(e.getMessage());
		}
    }
    
    @RequestMapping(path = "altera", method = RequestMethod.PUT)
    public void altera(@RequestBody ClientesModelo cli) {
    	try {
	       rep.save(cli);
		} catch (Exception e) {
			System.out.print(e.getMessage());
		}
    }    
	
}
