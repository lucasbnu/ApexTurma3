package Apex.API.Mercado.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import Apex.API.Mercado.modelo.VendasModelo;

public interface VendasRepositorio extends JpaRepository<VendasModelo, Integer> {

}
