package com.dakr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dakr.entity.EntityClass;
import com.dakr.service.ServiceImp;

@RestController
public class ControllerClass {

	@Autowired
	private ServiceImp si;
	
	@PostMapping("/save")
	public String insertEmp(@RequestBody EntityClass ec1) {
		EntityClass ec2=si.saveEmp(ec1);
		String msg=null;
		if(ec2!=null)
		{
			msg="data is successfully installed";
		}
		else
		{
			msg="sorry not inserted";
		}
		return msg;
	}
	@GetMapping("/getOne/{id}")
	public EntityClass retriveEmp(@PathVariable Integer id) {
		EntityClass ec4=si.getEmpDtls(id);
		return ec4;
	}
	
	@GetMapping("/getAll")
	public List<EntityClass> getAll() {
		List<EntityClass>  ec5=si.getAllDtls();
		return ec5;
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteOne(@PathVariable Integer id) {
		si.deleteDtls(id);
	}
	@DeleteMapping("/delete")
	public void deleteAll() {
		si.deleteAllDtls();
	}
	@PutMapping("/update")
	public EntityClass updateOne(@RequestBody EntityClass ecc) {
		EntityClass ecc1=si.updateDtls(ecc);
		return ecc1;
	}
}
