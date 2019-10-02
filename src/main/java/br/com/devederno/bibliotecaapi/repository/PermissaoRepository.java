package br.com.devederno.bibliotecaapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.devederno.bibliotecaapi.model.Permissao;

public interface PermissaoRepository extends JpaRepository<Permissao, Long> {

}