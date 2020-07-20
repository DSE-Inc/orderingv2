package net.works.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Set;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "product")
public class Product implements Serializable{

	 private Long id;
	    private String name;
	    @ManyToOne(fetch = FetchType.LAZY, optional = false)
	    @JoinColumn(name = "site_id", nullable = false)
	    private Site site;
	    private String vendor;
	    private String cdc;
	    private String ndc;
	    private int uOfm;
	    private int quantity;
	    private float price;
	    
	    
	    
	    public Product() {
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
		public Site getSite() {
			return site;
		}
		public void setSite(Site site) {
			this.site = site;
		}
		public int getuOfm() {
			return uOfm;
		}
		public void setuOfm(int uOfm) {
			this.uOfm = uOfm;
		}
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		
}
