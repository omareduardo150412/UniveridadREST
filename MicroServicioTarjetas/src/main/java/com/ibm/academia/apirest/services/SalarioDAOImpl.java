package com.ibm.academia.apirest.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.academia.apirest.entities.Salario;
import com.ibm.academia.apirest.repositories.SalarioRepository;
@Service
public class SalarioDAOImpl extends GenericoDAOImpl<Salario,SalarioRepository> implements SalarioDAO
{
    @Autowired
	public SalarioDAOImpl(SalarioRepository repository) {
		super(repository);
		
	}

}
