package com.helloobjetivos.objetivos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("objetivos")
public class ObjetivosController {

	@GetMapping
	public String objetivos() {
		return "O objetivo de aprendizagem da semana foi a Introdução ao SPRING.\n"
				+ "A partir dos conhecimentos adquiridos criei 2 aplicações, além de dar início ao meu Blog Pessoal.";
	}
	
}
