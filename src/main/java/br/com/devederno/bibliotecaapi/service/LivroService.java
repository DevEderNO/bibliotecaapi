package br.com.devederno.bibliotecaapi.service;

import org.springframework.stereotype.Service;

import br.com.devederno.bibliotecaapi.model.Livro;
import br.com.devederno.bibliotecaapi.repository.LivroRepository;

@Service
public class LivroService extends BaseService<Livro, LivroRepository> {

}
