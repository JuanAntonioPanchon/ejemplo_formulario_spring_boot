package controlador;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class PruebaControlador {
	//Funcion
	private int suma (int a, int b) {
		return a + b;
	}
	
	@GetMapping("/funcion")
	public int funcion () {
		return suma(5, 3);
	}
	
	
	
	
}
