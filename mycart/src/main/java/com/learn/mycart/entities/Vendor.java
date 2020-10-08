package com.learn.mycart.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "vendor")
public class Vendor implements Serializable {
    
    /**
	 * 
	 */
	private static final long serialVersionUID = -432755179457872314L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long vendorId;
    
    private String vendorName;
    
    @ManyToOne
    private Category category;

    public Vendor() {
    }

    public Vendor(Long vendorId, String vendorName) {
        this.vendorId = vendorId;
        this.vendorName = vendorName;
    }

    public Vendor(Long vendorId, String vendorName, Category category) {
        this.vendorId = vendorId;
        this.vendorName = vendorName;
        this.category = category;
    }
    
    

    public Vendor(String vendorName) {
        this.vendorName = vendorName;
    }

    public Long getVendorId() {
        return vendorId;
    }

    public void setVendorId(Long vendorId) {
        this.vendorId = vendorId;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
    
    
}

