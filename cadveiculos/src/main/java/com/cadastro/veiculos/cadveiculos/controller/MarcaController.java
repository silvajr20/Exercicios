package com.cadastro.veiculos.cadveiculos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cadastro.veiculos.cadveiculos.model.Marca;
import com.cadastro.veiculos.cadveiculos.repository.MarcaRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

//http://localhost:8080/swagger-ui.html    

@Api(value = "API REST veiculos")
@RestController
@RequestMapping("/marcas")
public class MarcaController {
		
		@Autowired
		private MarcaRepository pr;
		
		@ApiOperation(value = "Retorna uma lista de marcas")
		@GetMapping(produces="application/json")
		public @ResponseBody Iterable<Marca> listaMarcas() {
			Iterable<Marca> listaMarcas = pr.findAll();
			return listaMarcas;
		}
		
		@ApiOperation(value = "Salva uma marca")
		@PostMapping()
		public Marca cadastraMarca(@RequestBody  Marca marca) {
			return pr.save(marca);
		}
		
		@ApiOperation(value = "Deleta uma marca")
		@DeleteMapping()
		public Marca deletaMarca(@RequestBody  Marca marca) {
			pr.delete(marca);
			return marca;
		}
	
	
}
