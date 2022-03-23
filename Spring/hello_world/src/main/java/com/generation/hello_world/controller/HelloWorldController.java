package com.generation.hello_world.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/helloworld")
public class HelloWorldController {
	@GetMapping
	public String helloWolrd() {
		return "♥ Hello World ♥";
	}

	@GetMapping("listar-bsm")
	public String listarBsm() {
		return "♥ BSMs ♥\n" + "*Mentalidades*\n\n" + "- Mentalidade de crescimento\n" + "- Orientação ao futuro\n"
				+ "- Responsabilidade pessoal\n" + "- Persistência\n\n" + "*Habilidades comportamentais*\n\n"
				+ "- Comunicação\n" + "- Proatividade\n" + "- Atenção aos detalhes\n" + "- Trabalho em equipe";
	}

	@GetMapping("objetivos-aprendizagem")
	public String imprimirObjetivosAprendizagem() {
		return "♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ \n\n"
				+ "Meus objetivos de aprendizagem essa semana são "
				+ "aplicar meus conhecimentos de database/SQL em prática em projetos já realizados anteriormente e "
				+ "compreender a funcionalidade e aplicabilidade de APIS, além de praticar o que for passado "
				+ "em aula.\n\n"+"♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ";
	}
}
