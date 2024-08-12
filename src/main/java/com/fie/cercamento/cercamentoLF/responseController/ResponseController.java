package com.fie.cercamento.cercamentoLF.responseController;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class ResponseController {
	
	@GetMapping
	public String getEsq() {
		return null;
	}
	

}
