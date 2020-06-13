package model.entities;

import model.exception.WithdrawException;

public class Account {
	
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdraw_limit;
	
	public Account(Integer number, String holder, Double balance, Double withdraw_limit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdraw_limit = withdraw_limit;
	}
	
	
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	public Integer getNumber() {
		return number;
	}
	public Double getBalance() {
		return balance;
	}
	public Double getWithDraw_limit() {
		return withdraw_limit;
	}
	
	public void deposit (Double amoutn) {
		this.balance += amoutn;
	}
	
	public void withdraw (Double amount) throws WithdrawException{
		
		if(amount > getWithDraw_limit()) {
			throw new WithdrawException("Valor do saque não pode ser maior que o limite da conta!");
		}
		else if(amount > getBalance()) {
			throw new WithdrawException("Valor do saque não pode ser maior que o saldo!");
		}
		else {
		this.balance -= amount;
		}
	
	
	}
}
