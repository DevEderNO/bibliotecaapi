package br.com.devederno.bibliotecaapi.service;

import org.springframework.stereotype.Service;

import br.com.devederno.bibliotecaapi.model.Cliente;
import br.com.devederno.bibliotecaapi.repository.ClienteRepository;

@Service
public class ClienteService extends BaseService<Cliente, ClienteRepository>{

}
