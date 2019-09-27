package br.com.devederno.bibliotecaapi.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.devederno.bibliotecaapi.model.Autor;
import br.com.devederno.bibliotecaapi.service.BaseServiceInterface;


@RestController
@RequestMapping("/autores")
public class AutorResource extends BaseResource<Autor, BaseServiceInterface<Autor>> {

}
