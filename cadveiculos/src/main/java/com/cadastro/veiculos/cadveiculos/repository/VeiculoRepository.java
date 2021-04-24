package com.cadastro.veiculos.cadveiculos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cadastro.veiculos.cadveiculos.model.Veiculo;

public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {

}
