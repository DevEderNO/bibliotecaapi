package br.com.devederno.bibliotecaapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.devederno.bibliotecaapi.model.Emprestimo;

public interface EmprestimoRepository extends JpaRepository<Emprestimo, Long>{

}
