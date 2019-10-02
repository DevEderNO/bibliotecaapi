package br.com.devederno.bibliotecaapi.resource;

import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.devederno.bibliotecaapi.model.Cliente;
import br.com.devederno.bibliotecaapi.model.Cliente;
import br.com.devederno.bibliotecaapi.service.BaseServiceInterface;

@RestController
@RequestMapping("/clientes")
public class ClienteResource extends BaseResource<Cliente, BaseServiceInterface<Cliente>> {
	
	@Override
	@PreAuthorize("hasAuthority('ROLE_INCLUIR_CLIENTE')")
	public Cliente inserir(@RequestBody @Valid Cliente entidade, HttpServletResponse response) {
		return super.inserir(entidade, response);
	}
	
	@Override
	@PreAuthorize("hasAuthority('ROLE_LISTAR_CLIENTE')")
	public List<Cliente> listar() {
		return super.listar();
	}
	
	@Override
	@PreAuthorize("hasAuthority('ROLE_ALTERAR_CLIENTE')")
	public Cliente alterar(@RequestBody @Valid Cliente entidade, Long id) {
		return super.alterar(entidade, id);
	}
	
	@Override
	@PreAuthorize("hasAuthority('ROLE_EXCLUIR_CLIENTE')")
	public void excluir(@PathVariable("id") Long id) {
		super.excluir(id);
	}
	
	@Override
	@PreAuthorize("hasAuthority('ROLE_PESQUISAR_POR_ID_CLIENTE')")
	public Cliente pesquisarPorId(@PathVariable("id") Long id) {
		return super.pesquisarPorId(id);
	}
}
