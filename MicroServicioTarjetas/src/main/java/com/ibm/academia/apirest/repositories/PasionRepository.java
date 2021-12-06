package com.ibm.academia.apirest.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.ibm.academia.apirest.entities.Pasion;
@Repository
public interface PasionRepository extends CrudRepository<Pasion,Integer>
{

}
