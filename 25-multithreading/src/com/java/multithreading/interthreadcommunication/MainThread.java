package com.java.multithreading.interthreadcommunication;

public class MainThread {

	public static void main(String[] args) {
		Balance balance = new Balance();
		WithdrawlThread withdrawlThread = new WithdrawlThread(balance, 40000);
		DepositThread depositThread = new DepositThread(balance, 20000);

		withdrawlThread.start();
		depositThread.start();
	}

}
