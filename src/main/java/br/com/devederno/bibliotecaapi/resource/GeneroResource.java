package br.com.devederno.bibliotecaapi.resource;

import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.devederno.bibliotecaapi.model.Genero;
import br.com.devederno.bibliotecaapi.service.GeneroService;

@RestController
@RequestMapping("/generos")
public class GeneroResource extends BaseResource<Genero, GeneroService>{
	
	@Override
	@PreAuthorize("hasAuthority('ROLE_INCLUIR_GENERO')")
	public Genero inserir(@RequestBody @Valid Genero entidade, HttpServletResponse response) {
		return super.inserir(entidade, response);
	}
	
	@Override
	@PreAuthorize("hasAuthority('ROLE_LISTAR_GENERO')")
	public List<Genero> listar() {
		return super.listar();
	}
	
	@Override
	@PreAuthorize("hasAuthority('ROLE_ALTERAR_GENERO')")
	public Genero alterar(@RequestBody @Valid Genero entidade, Long id) {
		return super.alterar(entidade, id);
	}
	
	@Override
	@PreAuthorize("hasAuthority('ROLE_EXCLUIR_GENERO')")
	public void excluir(@PathVariable("id") Long id) {
		super.excluir(id);
	}
	
	@Override
	@PreAuthorize("hasAuthority('ROLE_PESQUISAR_POR_ID_GENERO')")
	public Genero pesquisarPorId(@PathVariable("id") Long id) {
		return super.pesquisarPorId(id);
	}
}
