package com.custotomer.customer.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
 
@Entity
public class Product {
    private Integer id;
    private String product_name;
    private String product_type;
    private String product_price;
    private String product_desc;
 
	public Product() {
		super();
	}
	
	

	public Product(Integer id, String product_name, String product_type, String product_price, String product_desc) {
		super();
		this.id = id;
		this.product_name = product_name;
		this.product_type = product_type;
		this.product_price = product_price;
		this.product_desc = product_desc;
	}


	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getProduct_name() {
		return product_name;
	}



	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}



	public String getProduct_type() {
		return product_type;
	}



	public void setProduct_type(String product_type) {
		this.product_type = product_type;
	}



	public String getProduct_price() {
		return product_price;
	}



	public void setProduct_price(String product_price) {
		this.product_price = product_price;
	}



	public String getProduct_desc() {
		return product_desc;
	}



	public void setProduct_desc(String product_desc) {
		this.product_desc = product_desc;
	}



	@Override
	public String toString() {
		return "Product [id=" + id + ", product_name=" + product_name + ", product_type=" + product_type
				+ ", product_price=" + product_price + ", product_desc=" + product_desc + "]";
	}


}



   