package net.works;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Product {

	 private Long id;
	    private String name;
	    private String company;
	    private String vendor;
	    private String cdc;
	    private String ndc;
	    private float price;
	    
	    
	    
	    protected Product() {
	    }
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

		public String getCompany() {
			return company;
		}

		public void setCompany(String company) {
			this.company = company;
		}

		public String getVendor() {
			return vendor;
		}

		public void setVendor(String vendor) {
			this.vendor = vendor;
		}

		public String getCdc() {
			return cdc;
		}

		public void setCdc(String cdc) {
			this.cdc = cdc;
		}

		public String getNdc() {
			return ndc;
		}

		public void setNdc(String ndc) {
			this.ndc = ndc;
		}

		public float getPrice() {
			return price;
		}

		public void setPrice(float price) {
			this.price = price;
		}
}
