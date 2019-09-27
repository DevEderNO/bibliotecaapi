package br.com.devederno.bibliotecaapi.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.devederno.bibliotecaapi.model.Genero;
import br.com.devederno.bibliotecaapi.service.GeneroService;

@RestController
@RequestMapping("/generos")
public class GeneroResource extends BaseResource<Genero, GeneroService>{
	
}
