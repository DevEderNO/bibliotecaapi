package br.com.devederno.bibliotecaapi.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import br.com.devederno.bibliotecaapi.model.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long>{

}
