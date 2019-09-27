package br.com.devederno.bibliotecaapi.resource;

import java.net.URI;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.devederno.bibliotecaapi.model.Entidade;
import br.com.devederno.bibliotecaapi.service.BaseServiceInterface;

public abstract class BaseResource<E extends Entidade,S extends BaseServiceInterface<E> > {

	@Autowired
	private S service;
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public E inserir(@RequestBody @Valid E entidade,HttpServletResponse response) {
		
		E entidadeCadastrado = service.inserir(entidade);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(entidadeCadastrado.getId()).toUri();
		
		response.setHeader(HttpHeaders.LOCATION, uri.toString());
		return entidadeCadastrado;
	}
	
	@GetMapping
	@ResponseStatus(code = HttpStatus.OK)
	public List<E> listar(){
		return service.listar();
	}
	
	@PutMapping("/{id}")
	@ResponseStatus(code = HttpStatus.OK)
	public E alterar(@RequestBody @Valid E entidade,@PathVariable("id") Long id) {
		return service.alterar(entidade,id);
	}
	
	@GetMapping("/{id}")
	@ResponseStatus(code = HttpStatus.OK)
	public E pesquisarPorId(@PathVariable("id") Long id) {
		return service.pesquisarPorId(id);
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void excluir(@PathVariable("id") Long id) {
		service.excluir(id);
	}
}
