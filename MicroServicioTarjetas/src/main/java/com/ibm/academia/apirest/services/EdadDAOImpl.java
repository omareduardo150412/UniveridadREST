package com.ibm.academia.apirest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.academia.apirest.entities.Edad;
import com.ibm.academia.apirest.repositories.EdadRepository;
@Service
public class EdadDAOImpl extends GenericoDAOImpl<Edad,EdadRepository> implements EdadDAO
{
    @Autowired
	public EdadDAOImpl(EdadRepository repository)
	{
		super(repository);
	}
      
}
