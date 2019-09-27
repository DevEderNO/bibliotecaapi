package br.com.devederno.bibliotecaapi.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.devederno.bibliotecaapi.model.Endereco;
import br.com.devederno.bibliotecaapi.service.BaseServiceInterface;

@RestController
@RequestMapping("enderecos")
public class EnderecoResource extends BaseResource<Endereco, BaseServiceInterface<Endereco>> {

}
