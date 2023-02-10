package com.dev.reference.api.domain;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Billing {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(nullable = false)
	private String billId;
	@Column(nullable = false)
	private Long userId;
	@Column(nullable = false)
	private Integer amount;
	@Column(nullable = false)
	private String billDate;
	@Column(nullable = false)
	private String nextRenewalDate;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getBillId() {
		return billId;
	}
	public void setBillId(String billId) {
		this.billId = billId;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	public String getBillDate() {
		return billDate;
	}
	public void setBillDate(String billDate) {
		this.billDate = billDate;
	}
	public String getNextRenewalDate() {
		return nextRenewalDate;
	}
	public void setNextRenewalDate(String nextRenewalDate) {
		this.nextRenewalDate = nextRenewalDate;
	}
}
