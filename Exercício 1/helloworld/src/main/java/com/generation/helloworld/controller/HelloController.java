package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello") //siginifica que a classe controle irá 
//responder toda requisição feita pela aplicação hello

public class HelloController {

	@GetMapping 
	public String getHello()
	{
		return "Habilidades e mentalidades utilizadas nesta atividade: Atenção aos detalhes, "
				+ "persistência, orientação ao futuro e mentalidade de crescimento.";
	}
	
	@GetMapping("/objetivos") 
	public String getHello2()
	{
		return "Objetivos: Compreender Spring e melhorar a estrutura do projeto";
	}
	
}
