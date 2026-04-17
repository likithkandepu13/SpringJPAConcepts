package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "product")
@Entity
public class Product {
	@Id
	@Column(name ="pid")
	private int pid;
	@Column(name="pname")
	private String pnam;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPnam() {
		return pnam;
	}
	public void setPnam(String pnam) {
		this.pnam = pnam;
	}

}
