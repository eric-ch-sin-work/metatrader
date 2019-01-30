package com.eric.ch.sin.metatrader.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TB_GAIN_LOSS_SUMMARY")
public class GainLossSummary {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID")
	private int id;

	@Column(name="USER_ID")
	private int userId;

	@Column(name="USER_NAME")
	private String username;
	
	@Column(name="SYMBOL")
	private String symbol;
	
	@Column(name="NET_PROFIT")
	private BigDecimal netProfit;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}
	
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	public String getSymbol() {
		return symbol;
	}
	
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	
	public BigDecimal getNetProfit() {
		return netProfit;
	}
	
	public void setNetProfit(BigDecimal netProfit) {
		this.netProfit = netProfit;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
}
