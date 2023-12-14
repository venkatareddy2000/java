package com.java.multithreading.classlevellocking;
/*
 * Class-level locking in Java involves using the synchronized keyword to
 * synchronize access to static methods or code blocks at the class level,
 * rather than on instance methods or blocks. This means that when a thread
 * enters a synchronized static method or block, it acquires a lock that
 * prevents other threads from entering any synchronized static method or block
 * of the same class. This ensures that only one thread can execute any
 * synchronized static method or block of that class at a time.
 */