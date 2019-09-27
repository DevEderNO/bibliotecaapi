package br.com.devederno.bibliotecaapi.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import br.com.devederno.bibliotecaapi.model.Editora;

@Service
public class EditoraService extends BaseService<Editora, JpaRepository<Editora,Long>> {

}
