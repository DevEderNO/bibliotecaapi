package br.com.devederno.bibliotecaapi.resource;

import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.devederno.bibliotecaapi.model.Endereco;
import br.com.devederno.bibliotecaapi.model.Endereco;
import br.com.devederno.bibliotecaapi.service.BaseServiceInterface;

@RestController
@RequestMapping("/enderecos")
public class EnderecoResource extends BaseResource<Endereco, BaseServiceInterface<Endereco>> {
	@Override
	@PreAuthorize("hasAuthority('ROLE_INCLUIR_ENDERECO')")
	public Endereco inserir(@RequestBody @Valid Endereco entidade, HttpServletResponse response) {
		return super.inserir(entidade, response);
	}
	
	@Override
	@PreAuthorize("hasAuthority('ROLE_LISTAR_ENDERECO')")
	public List<Endereco> listar() {
		return super.listar();
	}
	
	@Override
	@PreAuthorize("hasAuthority('ROLE_ALTERAR_ENDERECO')")
	public Endereco alterar(@RequestBody @Valid Endereco entidade, Long id) {
		return super.alterar(entidade, id);
	}
	
	@Override
	@PreAuthorize("hasAuthority('ROLE_EXCLUIR_ENDERECO')")
	public void excluir(@PathVariable("id") Long id) {
		super.excluir(id);
	}
	
	@Override
	@PreAuthorize("hasAuthority('ROLE_PESQUISAR_POR_ID_ENDERECO')")
	public Endereco pesquisarPorId(@PathVariable("id") Long id) {
		return super.pesquisarPorId(id);
	}
}
