package com.custotomer.customer.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Stocks {
	private Integer id;
	private String stock_name;
	private String check_stock;
	
	
	public Stocks() {
		super();
	}

	public Stocks(Integer id, String stock_name, String check_stock) {
		super();
		this.id = id;
		this.stock_name = stock_name;
		this.check_stock = check_stock;
	}
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStock_name() {
		return stock_name;
	}

	public void setStock_name(String stock_name) {
		this.stock_name = stock_name;
	}

	public String getCheck_stock() {
		return check_stock;
	}

	public void setCheck_stock(String check_stock) {
		this.check_stock = check_stock;
	}

	@Override
	public String toString() {
		return "Stocks [id=" + id + ", stock_name=" + stock_name + ", check_stock=" + check_stock + "]";
	}

}
