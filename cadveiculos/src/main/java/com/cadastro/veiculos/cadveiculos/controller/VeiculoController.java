package com.cadastro.veiculos.cadveiculos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cadastro.veiculos.cadveiculos.model.Veiculo;
import com.cadastro.veiculos.cadveiculos.repository.VeiculoRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "API REST veiculos")
@RestController
@RequestMapping("/veiculos")
public class VeiculoController {
	@Autowired
	private VeiculoRepository pr;
	
	@ApiOperation(value = "Retorna uma lista de veiculos")
	@GetMapping(produces="application/json")
	public @ResponseBody Iterable<Veiculo> listaVeiculos() {
		Iterable<Veiculo> listaVeiculos = pr.findAll();
		return listaVeiculos;
	}
	
	@ApiOperation(value = "Salva uma marca")
	@PostMapping()
	public Veiculo cadastraVeiculo(@RequestBody  Veiculo veiculo) {
		return pr.save(veiculo);
	}
	
	@ApiOperation(value = "Deleta uma marca")
	@DeleteMapping()
	public Veiculo deletaVeiculo(@RequestBody Veiculo veiculo) {
		pr.delete(veiculo);
		return veiculo;
	}
	
	
	
}
