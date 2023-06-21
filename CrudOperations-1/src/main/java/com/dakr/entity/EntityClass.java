package com.dakr.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="WorkTble")
public class EntityClass {

	@Id
	private Integer id;
	private String empName;
	private String sector;
	private Long   phno;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getSector() {
		return sector;
	}
	public void setSector(String sector) {
		this.sector = sector;
	}
	public Long getPhno() {
		return phno;
	}
	public void setPhno(Long phno) {
		this.phno = phno;
	}
	@Override
	public String toString() {
		return "EntityClass [id=" + id + ", empName=" + empName + ", sector=" + sector + ", phno=" + phno + "]";
	}

	
	
}
