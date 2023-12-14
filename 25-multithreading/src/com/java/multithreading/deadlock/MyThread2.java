package com.java.multithreading.deadlock;

public class MyThread2 extends Thread {
	SecondResource sr;
	FirstResource fr;

	MyThread2(FirstResource fr, SecondResource sr) {
		this.fr = fr;
		this.sr = sr;
	}

	public void run() {
		sr.method1(fr);

	}

}
