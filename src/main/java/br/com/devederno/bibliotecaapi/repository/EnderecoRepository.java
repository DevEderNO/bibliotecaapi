package br.com.devederno.bibliotecaapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.devederno.bibliotecaapi.model.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {

}
