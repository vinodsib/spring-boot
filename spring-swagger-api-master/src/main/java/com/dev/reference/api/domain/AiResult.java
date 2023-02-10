package com.dev.reference.api.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AiResult {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(nullable = false)
	private Long userId;
	@Column(nullable = false)
	private Long preprocessedId;
	@Column(nullable = false)
	private String preprocessedImage;
	@Column(nullable = false)
	private String clipdropImage;
	@Column(nullable = false)
	private String resultImage;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getPreprocessedId() {
		return preprocessedId;
	}
	public void setPreprocessedId(Long preprocessedId) {
		this.preprocessedId = preprocessedId;
	}
	public String getPreprocessedImage() {
		return preprocessedImage;
	}
	public void setPreprocessedImage(String preprocessedImage) {
		this.preprocessedImage = preprocessedImage;
	}
	public String getClipdropImage() {
		return clipdropImage;
	}
	public void setClipdropImage(String clipdropImage) {
		this.clipdropImage = clipdropImage;
	}
	public String getResultImage() {
		return resultImage;
	}
	public void setResultImage(String resultImage) {
		this.resultImage = resultImage;
	}
	
}
