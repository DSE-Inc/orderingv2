package net.works;

import java.util.List;

public class ProductDto {

	private List<Product> products;
	
	 private String name;
	    private String company;
	    private String vendor;
	    private String cdc;
	    private String ndc;
	    private float price;
	
	public ProductDto() {
		
	}
	public void addToCart(Product product) {
		this.products.add(product);
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
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
