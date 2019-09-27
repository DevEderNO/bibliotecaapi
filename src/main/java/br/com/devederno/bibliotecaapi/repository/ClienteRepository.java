package br.com.devederno.bibliotecaapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.devederno.bibliotecaapi.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
