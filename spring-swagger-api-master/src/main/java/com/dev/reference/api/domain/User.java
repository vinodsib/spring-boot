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
@Table(name = "USERS")
@Data
@NoArgsConstructor
@AllArgsConstructor
//@ToString
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(nullable = false)
	private Long userId;
	@Column(nullable = false)
	private String userName;
	@Column(nullable = false)
	private Integer age;
	@Column(nullable = false)
	private String gender;
	@Column(nullable = false)
	private String userPhoto;
	@Column(nullable = false)
	private String skinColors;
	@Column(nullable = false)
	private Double height;
	@Column(nullable = false)
	private String size;
	@Column(nullable = false)
	private String BodySample;

	
	public Long getUserId() {
		return userId;
	}


	public void setUserId(Long userId) {
		this.userId = userId;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public Integer getAge() {
		return age;
	}


	public void setAge(Integer age) {
		this.age = age;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getUserPhoto() {
		return userPhoto;
	}


	public void setUserPhoto(String userPhoto) {
		this.userPhoto = userPhoto;
	}


	public String getSkinColors() {
		return skinColors;
	}


	public void setSkinColors(String skinColors) {
		this.skinColors = skinColors;
	}


	public Double getHeight() {
		return height;
	}


	public void setHeight(Double height) {
		this.height = height;
	}


	public String getSize() {
		return size;
	}


	public void setSize(String size) {
		this.size = size;
	}


	public String getBodySample() {
		return BodySample;
	}


	public void setBodySample(String bodySample) {
		BodySample = bodySample;
	}


	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", age=" + age + ", gender=" + gender
				+ ", userPhoto=" + userPhoto + ", skinColors=" + skinColors + ", height=" + height + ", size=" + size
				+ ", BodySample=" + BodySample + "]";
	}

}
