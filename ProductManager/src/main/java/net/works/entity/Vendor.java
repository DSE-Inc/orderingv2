package net.works.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vendor")
public class Vendor {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String firstHealth; 
	private String diversified;
	private String louisville;
	private String physicians;
	private String min;
	private String fee;
	
	public Vendor() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFirstHealth() {
		return firstHealth;
	}

	public void setFirstHealth(String firstHealth) {
		this.firstHealth = firstHealth;
	}

	public String getDiversified() {
		return diversified;
	}

	public void setDiversified(String diversified) {
		this.diversified = diversified;
	}

	public String getLouisville() {
		return louisville;
	}

	public void setLouisville(String louisville) {
		this.louisville = louisville;
	}

	public String getPhysicians() {
		return physicians;
	}

	public void setPhysicians(String physicians) {
		this.physicians = physicians;
	}

	public String getMin() {
		return min;
	}

	public void setMin(String min) {
		this.min = min;
	}

	public String getFee() {
		return fee;
	}

	public void setFee(String fee) {
		this.fee = fee;
	}
	
}
