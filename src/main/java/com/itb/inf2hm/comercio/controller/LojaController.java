package com.itb.inf2hm.comercio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itb.inf2hm.comercio.model.Produto;

@Controller
@RequestMapping("/comercio/produtos")
public class LojaController {
	
	@GetMapping("/listar")
	public void listaProdutos() {
		
		Produto produto = new produto();
		produto.setNome("Televisor 70' Samsung");
		produto.setCodigoBarras("JFALJFDOE2514");
		produto.setPreco("6541.25");
		
		return "produtos";
	}

}
