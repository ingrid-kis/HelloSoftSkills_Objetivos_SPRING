package com.hellosoftskills.softskills.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("softskills")
public class SoftSkillsController {

		@GetMapping
		public String softskills() {
			return "Hello! É meu primeiro contato com SPRING e estou muito animada :)\n"
					+ "As mentalidades mais trabalhadas nessa task foram: Persistência & Orientação ao Futuro.\n"
					+ "E as habilidades destaque foram: Atenção aos detalhes & Comunicação.\n"
					+ "See you soon, XoXo";
		}
}
