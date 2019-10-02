package br.com.devederno.bibliotecaapi.resource;

import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.devederno.bibliotecaapi.model.Emprestimo;
import br.com.devederno.bibliotecaapi.model.Emprestimo;
import br.com.devederno.bibliotecaapi.service.BaseServiceInterface;

@RestController
@RequestMapping("/emprestimos")
public class EmprestimoResource extends BaseResource<Emprestimo, BaseServiceInterface<Emprestimo>> {
	@Override
	@PreAuthorize("hasAuthority('ROLE_INCLUIR_EMPRESTIMO')")
	public Emprestimo inserir(@RequestBody @Valid Emprestimo entidade, HttpServletResponse response) {
		return super.inserir(entidade, response);
	}
	
	@Override
	@PreAuthorize("hasAuthority('ROLE_LISTAR_EMPRESTIMO')")
	public List<Emprestimo> listar() {
		return super.listar();
	}
	
	@Override
	@PreAuthorize("hasAuthority('ROLE_ALTERAR_EMPRESTIMO')")
	public Emprestimo alterar(@RequestBody @Valid Emprestimo entidade, Long id) {
		return super.alterar(entidade, id);
	}
	
	@Override
	@PreAuthorize("hasAuthority('ROLE_EXCLUIR_EMPRESTIMO')")
	public void excluir(@PathVariable("id") Long id) {
		super.excluir(id);
	}
	
	@Override
	@PreAuthorize("hasAuthority('ROLE_PESQUISAR_POR_ID_EMPRESTIMO')")
	public Emprestimo pesquisarPorId(@PathVariable("id") Long id) {
		return super.pesquisarPorId(id);
	}
}
