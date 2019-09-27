package br.com.devederno.bibliotecaapi.service;

import org.springframework.stereotype.Service;

import br.com.devederno.bibliotecaapi.model.Emprestimo;
import br.com.devederno.bibliotecaapi.repository.EmprestimoRepository;

@Service
public class EmprestimoService extends BaseService<Emprestimo, EmprestimoRepository> {

}
