package com.groupeisi.companies.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class ProductEntity implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String ref;
	@Column(name = "name", length = 200, nullable = false, unique = true)
	private String name;
	private double stock;
	@OneToMany(mappedBy = "product")
	private List<PurchaseEntity> purchases;

	@OneToMany(mappedBy = "product")
	private List<SaleEntity> sales;

	public String getRef() {
		return ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getStock() {
		return stock;
	}

	public void setStock(double stock) {
		this.stock = stock;
	}

	public ProductEntity(String ref, String name, double stock) {
		super();
		this.ref = ref;
		this.name = name;
		this.stock = stock;
	}

	public ProductEntity() {
		super();
	}

}