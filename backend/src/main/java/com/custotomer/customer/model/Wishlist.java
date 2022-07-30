package com.custotomer.customer.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Wishlist {
	@Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer autoid;
	private Integer id;
	
	
	
	
	 private String item_name;
	
	 private float product_price;
public Wishlist() {}
	 @Override
	public String toString() {
		return "Wishlist [id=" + id + ", item_name=" + item_name + ", product_price=" + product_price + ", autoid="
				+ autoid + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getItem_name() {
		return item_name;
	}

	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}

	public float getProduct_price() {
		return product_price;
	}

	public void setProduct_price(float product_price) {
		this.product_price = product_price;
	}

	public Integer getAutoid() {
		return autoid;
	}

	public void setAutoid(Integer autoid) {
		this.autoid = autoid;
	}

	public Wishlist(Integer id, String item_name, float product_price, Integer autoid) {
		super();
		this.id = id;
		this.item_name = item_name;
		this.product_price = product_price;
		this.autoid = autoid;
	}

	
    
}
