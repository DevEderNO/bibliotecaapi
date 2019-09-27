package br.com.devederno.bibliotecaapi.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.devederno.bibliotecaapi.model.Cliente;
import br.com.devederno.bibliotecaapi.service.BaseServiceInterface;

@RestController
@RequestMapping("clientes")
public class ClienteResource extends BaseResource<Cliente, BaseServiceInterface<Cliente>> {

}
