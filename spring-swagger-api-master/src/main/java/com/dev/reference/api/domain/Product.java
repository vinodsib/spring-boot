package com.dev.reference.api.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "PRODUCT_DETAILS")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long pId;
	@Column(nullable = false)
	private Long productId;
	@Column(nullable = false)
	private String catName;
	@Column(nullable = false)
	private Integer catId;
	@Column(nullable = false)
	private String productName;
	@Column(nullable = false)
	private Long brandId;
	@Column(nullable = false)
	private String brandName;
	@Column(nullable = false)
	private String productColor;
	@Column(nullable = false)
	private String modelImage;
	@Column(nullable = false)
	private String modelType;
	@Column(nullable = false)
	private String BodySample;
	
	public Long getpId() {
		return pId;
	}
	public void setpId(Long pId) {
		this.pId = pId;
	}
	public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	public String getCatName() {
		return catName;
	}
	public void setCatName(String catName) {
		this.catName = catName;
	}
	public Integer getCatId() {
		return catId;
	}
	public void setCatId(Integer catId) {
		this.catId = catId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public Long getBrandId() {
		return brandId;
	}
	public void setBrandId(Long brandId) {
		this.brandId = brandId;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getProductColor() {
		return productColor;
	}
	public void setProductColor(String productColor) {
		this.productColor = productColor;
	}
	public String getModelImage() {
		return modelImage;
	}
	public void setModelImage(String modelImage) {
		this.modelImage = modelImage;
	}
	public String getModelType() {
		return modelType;
	}
	public void setModelType(String modelType) {
		this.modelType = modelType;
	}
	public String getBodySample() {
		return BodySample;
	}
	public void setBodySample(String bodySample) {
		BodySample = bodySample;
	}

	
}
