package br.com.devederno.bibliotecaapi.resource;

import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.devederno.bibliotecaapi.model.Autor;
import br.com.devederno.bibliotecaapi.service.BaseServiceInterface;


@RestController
@RequestMapping("/autores")
public class AutorResource extends BaseResource<Autor, BaseServiceInterface<Autor>> {
	
	@Override
	@PreAuthorize("hasAuthority('ROLE_INCLUIR_AUTOR')")
	public Autor inserir(@RequestBody @Valid Autor entidade, HttpServletResponse response) {
		return super.inserir(entidade, response);
	}
	
	@Override
	@PreAuthorize("hasAuthority('ROLE_LISTAR_AUTOR')")
	public List<Autor> listar() {
		return super.listar();
	}
	
	@Override
	@PreAuthorize("hasAuthority('ROLE_ALTERAR_AUTOR')")
	public Autor alterar(@RequestBody @Valid Autor entidade,@PathVariable("id") Long id) {
		return super.alterar(entidade, id);
	}
	
	@Override
	@PreAuthorize("hasAuthority('ROLE_EXCLUIR_AUTOR')")
	public void excluir(@PathVariable("id") Long id) {
		super.excluir(id);
	}
	
	@Override
	@PreAuthorize("hasAuthority('ROLE_PESQUISAR_POR_ID_AUTOR')")
	public Autor pesquisarPorId(@PathVariable("id") Long id) {
		return super.pesquisarPorId(id);
	}
}
