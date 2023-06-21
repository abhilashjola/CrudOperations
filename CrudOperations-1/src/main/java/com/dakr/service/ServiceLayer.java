package com.dakr.service;

import java.util.List;

import com.dakr.entity.EntityClass;

public interface ServiceLayer {
	public EntityClass saveEmp(EntityClass ec);
	public EntityClass getEmpDtls(Integer id);
	public List<EntityClass> getAllDtls();
	public void deleteDtls(Integer id);
	public void deleteAllDtls();
	public EntityClass updateDtls(EntityClass ecc2);

}
