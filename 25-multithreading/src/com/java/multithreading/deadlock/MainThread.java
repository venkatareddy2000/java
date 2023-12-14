package com.java.multithreading.deadlock;

public class MainThread {

	public static void main(String[] args) {
		FirstResource fr = new FirstResource();
		SecondResource sr = new SecondResource();

		MyThread1 thread1 = new MyThread1(fr, sr);
		thread1.setName("thread1");
		MyThread2 thread2 = new MyThread2(fr, sr);
		thread2.setName("thread2");
		thread1.start();
		thread2.start();

	}

}
