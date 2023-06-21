package com.dakr.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dakr.entity.EntityClass;
import com.dakr.repository.RepoClass;

@Service
public class ServiceImp implements ServiceLayer {

	@Autowired
	private RepoClass repo;
	@Override
	public EntityClass saveEmp(EntityClass ec) {
		
		return repo.save(ec);
	}

	public EntityClass getEmpDtls(Integer id){
		return repo.findById(id).get();
	}

	public List<EntityClass> getAllDtls(){
		return repo.findAll();
	}
	
	public void deleteDtls(Integer id){
		repo.deleteById(id);
	}
	public void deleteAllDtls() {
		repo.deleteAll();
	}
	public EntityClass updateDtls(EntityClass ecc2) {
		EntityClass ecc3=null;
		Optional<EntityClass> op=repo.findById(ecc2.getId());
		if(op.isPresent())
		{
			ecc3=repo.save(ecc2);
		}
		else
		{
			ecc3=repo.save(ecc2);
		}
		return ecc3;
	}
}
