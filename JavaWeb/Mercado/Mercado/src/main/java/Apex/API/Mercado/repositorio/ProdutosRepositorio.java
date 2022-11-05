package Apex.API.Mercado.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import Apex.API.Mercado.modelo.ProdutosModelo;

public interface ProdutosRepositorio extends JpaRepository<ProdutosModelo, Integer> {

}
