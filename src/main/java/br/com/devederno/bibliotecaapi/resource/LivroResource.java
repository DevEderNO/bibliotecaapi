package br.com.devederno.bibliotecaapi.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.devederno.bibliotecaapi.model.Livro;
import br.com.devederno.bibliotecaapi.service.LivroService;

@RestController
@RequestMapping("/livros")
public class LivroResource extends BaseResource<Livro,LivroService> {	
	
}
