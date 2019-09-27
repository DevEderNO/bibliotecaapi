package br.com.devederno.bibliotecaapi.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import br.com.devederno.bibliotecaapi.model.Autor;

@Service
public class AutorService extends BaseService<Autor, JpaRepository<Autor,Long>>{

}
