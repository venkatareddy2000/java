package com.java.multithreading.interthreadcommunication;
/*
 * Cooperation (Inter-thread communication) is a mechanism in which a thread is
 * paused running in its critical section and another thread is allowed to enter
 * (or lock) in the same critical section to be executed. It is implemented by
 * wait() and notify().
 * 
 * wait():When we use the method method the current running thread will stops
 * its execution and hand over's the object lock to another thread or the second
 * thread.
 * 
 * notify():Once the second thread completes it's execution it will notify to
 * the first thread and the first thread will continue it's execution.
 */