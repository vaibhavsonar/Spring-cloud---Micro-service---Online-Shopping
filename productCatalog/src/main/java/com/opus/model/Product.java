/**
 * 
 */
package com.opus.model;

/**
 * @author Vaibhav.Sonar
 *
 */
public class Product {

	public Product(int id, String productName) {
		super();
		this.id = id;
		this.productName = productName;
	}

	private int id;
	private String productName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

}
