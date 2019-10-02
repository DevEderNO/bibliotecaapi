package br.com.devederno.bibliotecaapi.resource;

import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.devederno.bibliotecaapi.model.Editora;
import br.com.devederno.bibliotecaapi.model.Editora;
import br.com.devederno.bibliotecaapi.service.BaseServiceInterface;

@RestController
@RequestMapping("/editoras")
public class EditoraResource extends BaseResource<Editora, BaseServiceInterface<Editora>>{
	@Override
	@PreAuthorize("hasAuthority('ROLE_INCLUIR_EDITORA')")
	public Editora inserir(@RequestBody @Valid Editora entidade, HttpServletResponse response) {
		return super.inserir(entidade, response);
	}
	
	@Override
	@PreAuthorize("hasAuthority('ROLE_LISTAR_EDITORA')")
	public List<Editora> listar() {
		return super.listar();
	}
	
	@Override
	@PreAuthorize("hasAuthority('ROLE_ALTERAR_EDITORA')")
	public Editora alterar(@RequestBody @Valid Editora entidade, Long id) {
		return super.alterar(entidade, id);
	}
	
	@Override
	@PreAuthorize("hasAuthority('ROLE_EXCLUIR_EDITORA')")
	public void excluir(@PathVariable("id") Long id) {
		super.excluir(id);
	}
	
	@Override
	@PreAuthorize("hasAuthority('ROLE_PESQUISAR_POR_ID_EDITORA')")
	public Editora pesquisarPorId(@PathVariable("id") Long id) {
		return super.pesquisarPorId(id);
	}
}
