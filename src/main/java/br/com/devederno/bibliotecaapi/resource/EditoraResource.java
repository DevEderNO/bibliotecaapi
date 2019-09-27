package br.com.devederno.bibliotecaapi.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.devederno.bibliotecaapi.model.Editora;
import br.com.devederno.bibliotecaapi.service.BaseServiceInterface;

@RestController
@RequestMapping("/editoras")
public class EditoraResource extends BaseResource<Editora, BaseServiceInterface<Editora>>{

}
