package com.java.multithreading.interthreadcommunication;

public class WithdrawlThread extends Thread {

	Balance balance;
	int amount;

	public WithdrawlThread(Balance balance, int amount) {
		this.balance = balance;
		this.amount = amount;
	}

	public void run() {
		balance.withdrawl(amount);
	}

}
