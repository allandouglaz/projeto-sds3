package com.devsuperior.dsvendas.dto;

import java.io.Serializable;

import com.devsuperior.dsvendas.entities.Seller;

public class SaleSumDTO implements Serializable {


	private static final long serialVersionUID = 1L;
	private String SellerName;
	private Double sum;
	
	public SaleSumDTO() {
			
	}

	public SaleSumDTO(Seller seller, Double sum) {
		this.SellerName = seller.getName();
		this.sum = sum;
	}

	public String getSellerName() {
		return SellerName;
	}

	public void setSellerName(String sellerName) {
		SellerName = sellerName;
	}

	public Double getSum() {
		return sum;
	}

	public void setSum(Double sum) {
		this.sum = sum;
	}
	
}
