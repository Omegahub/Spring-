package br.com.etechoracio.apiexemplo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/exercicio")
@RestController
public class ExercicioController {
	
	@GetMapping("/dobro")
	public double dobro (@RequestParam("num1") double num1)
	{
		return num1 * 2;
	}
	
	@GetMapping("/potencia")
	public double potencia(@RequestParam("num1") double num1, @RequestParam("num2")double num2)
	{
		return Math.pow(num1, num2);
	}
	
	@GetMapping("/raizquad")
	public double raizQuad(@RequestParam("num1") double num1)
	{
		return Math.sqrt(num1);
	}		
	

}
