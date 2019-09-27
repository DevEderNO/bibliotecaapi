package br.com.devederno.bibliotecaapi.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.devederno.bibliotecaapi.model.Emprestimo;
import br.com.devederno.bibliotecaapi.service.BaseServiceInterface;

@RestController
@RequestMapping("/emprestimos")
public class EmprestimoResource extends BaseResource<Emprestimo, BaseServiceInterface<Emprestimo>> {

}
