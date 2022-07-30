package com.custotomer.customer.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
 
@Entity
public class Cart {
	@Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 private Integer id;
	 private String item_name;
	private String quantity;
	 private float product_price;
	 private float discount_amt;
	 private Integer autoid;
	 
	public Cart() {
		super();
	}


	public Cart(Integer autoid, Integer id, String item_name, String quantity, float product_price,
			float discount_amt) {
		super();
		this.autoid = autoid;
		this.id = id;
		this.item_name = item_name;
		this.quantity = quantity;
		this.product_price = product_price;
		this.discount_amt = discount_amt;
	}


	public Integer getAutoid() {
		return autoid;
	}


	public void setAutoid(Integer autoid) {
		this.autoid = autoid;
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


	public String getQuantity() {
		return quantity;
	}


	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}


	public float getProduct_price() {
		return product_price;
	}


	public void setProduct_price(float product_price) {
		this.product_price = product_price;
	}


	public float getDiscount_amt() {
		return discount_amt;
	}


	public void setDiscount_amt(float discount_amt) {
		this.discount_amt = discount_amt;
	}


	@Override
	public String toString() {
		return "Cart [autoid=" + autoid + ", id=" + id + ", item_name=" + item_name + ", quantity=" + quantity
				+ ", product_price=" + product_price + ", discount_amt=" + discount_amt + "]";
	}
	
	
	

}
