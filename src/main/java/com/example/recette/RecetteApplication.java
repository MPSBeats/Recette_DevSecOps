package com.example.recette;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@SpringBootApplication
@Controller
public class RecetteApplication {

	public static void main(String[] args) {
		SpringApplication.run(RecetteApplication.class, args);
	}

	@GetMapping("/")
	public String recette(Model model) {
		model.addAttribute("title", "Recette de Pâtes");
		model.addAttribute("steps", new String[]{
				"Faire bouillir de l’eau",
				"Ajouter les pâtes",
				"Cuire 10 minutes",
				"Égoutter et ajouter une sauce",
				"Déguster"
		});
		return "index";
	}
}
