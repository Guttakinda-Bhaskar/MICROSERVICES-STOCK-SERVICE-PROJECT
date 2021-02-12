package com.example.demo.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "stock_tab")
public class Stock {

	@Id
	private Integer id;
	private String name;
	private double price;
	@Transient
	private double total;

	public Stock() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Stock(Integer id, String name, double price, int total) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.total = total;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Stock [id=" + id + ", name=" + name + ", price=" + price + ", total=" + total + "]";
	}

	
}
