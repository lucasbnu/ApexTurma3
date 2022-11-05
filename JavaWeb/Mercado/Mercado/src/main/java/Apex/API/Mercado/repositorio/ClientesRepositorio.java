package Apex.API.Mercado.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import Apex.API.Mercado.modelo.ClientesModelo;

public interface ClientesRepositorio extends JpaRepository<ClientesModelo, Integer> {

}
