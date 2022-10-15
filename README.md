

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


CREATE TABLE `clientes` (
  `id_cliente` int(10) NOT NULL,
  `nome_cliente` varchar(255) NOT NULL,
  `idade` int(10) NOT NULL,
  `ativo` int(11) NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

INSERT INTO `clientes` (`id_cliente`, `nome_cliente`, `idade`, `ativo`) VALUES
(12, 'Walter white', 23, 1),
(13, 'Bob esponja', 41, 1),
(14, 'Bart simpson', 14, 1),
(15, 'meggie simpson', 2, 1),
(16, 'Margie simpson', 39, 1);

CREATE TABLE `produtos` (
  `id_produto` int(10) NOT NULL,
  `descricao_produto` varchar(255) NOT NULL,
  `preco` float NOT NULL,
  `ativo` int(10) NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


CREATE TABLE `vendas` (
  `id_venda` int(10) NOT NULL,
  `fk_produto` int(10) NOT NULL,
  `fk_cliente` int(10) NOT NULL,
  `quantidade` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


ALTER TABLE `clientes`
  ADD PRIMARY KEY (`id_cliente`);

ALTER TABLE `produtos`
  ADD PRIMARY KEY (`id_produto`);

ALTER TABLE `vendas`
  ADD PRIMARY KEY (`id_venda`);

ALTER TABLE `clientes`
  MODIFY `id_cliente` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

ALTER TABLE `produtos`
  MODIFY `id_produto` int(10) NOT NULL AUTO_INCREMENT;

ALTER TABLE `vendas`
  MODIFY `id_venda` int(10) NOT NULL AUTO_INCREMENT;
