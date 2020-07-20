package net.works.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "site")
public class Site implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String siteName;
	
	@OneToMany(mappedBy = "site", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
	private Set<Company> companyType;
	
	private String locationId;
	
	private String locationName;
	
	@OneToMany(mappedBy = "site", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
	private Set<Product> products;

	public Site(Long id, String siteName,  String locationId, String locationName) {
		this.id = id;
		this.siteName = siteName;
		this.locationId = locationId;
		this.locationName = locationName;
	}
	
	public Site() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSiteName() {
		return siteName;
	}

	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}

	public Set<Company> getCompanyType() {
		return companyType;
	}

	public void setCompanyType(Set<Company> companyType) {
		this.companyType = companyType;
	}

	public String getLocationId() {
		return locationId;
	}

	public void setLocationId(String locationId) {
		this.locationId = locationId;
	}

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public Set<Product> getProducts() {
		return products;
	}

	public void setProducts(Set<Product> products) {
		this.products = products;
	}
}
