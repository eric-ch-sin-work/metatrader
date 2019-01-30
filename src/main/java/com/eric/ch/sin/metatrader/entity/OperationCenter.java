package com.eric.ch.sin.metatrader.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TB_OPERATION_CENTER")
public class OperationCenter {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID")
	private int id;
    

	@Column(name="NAME")
	private String name;

	@Column(name="TOTAL_USERS")
	private int totalUsers;
	
	@Column(name="PROFIT")
	private BigDecimal profit;
	
	public BigDecimal getProfit() {
		return profit;
	}
	
	public void setProfit(BigDecimal profit) {
		this.profit = profit;
	}
	
	public int getTotalUsers() {
		return totalUsers;
	}
	
	public void setTotalUsers(int totalUsers) {
		this.totalUsers = totalUsers;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
