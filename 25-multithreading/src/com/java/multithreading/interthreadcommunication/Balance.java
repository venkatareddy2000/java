package com.java.multithreading.interthreadcommunication;

public class Balance {
	int amount = 20000;

	public synchronized void withdrawl(int amount) {
		System.out.println("Amount withdrawl process started!!");
		if (this.amount < amount) {
			System.out.println("Insufficient Funds!!!");
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("Thrwoing from if codition!!");
			}
		}
		System.out.println("Withdrawl processed successfully!!");
		System.out.println("Remaining amount : " + (this.amount - amount));
	}

	public synchronized void deposit(int amount) {
		System.out.println("Deposit transaction process started!!");
		this.amount = this.amount + amount;
		System.out.println("Balance Available : " + this.amount);
		notify();

	}
	/*
	 * First Withdraw thread will call the withdraw method, It will check the if
	 * condition and if it is true will print the statement inside the if and the
	 * thread will go to wait mode and hand over's the object lock to the
	 * DepositThread and this thread will do it's execution once completes it will
	 * notify to the WithdrawlThread and the withdraw thread will continue the
	 * remaining execution
	 */

}
