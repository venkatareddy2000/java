package com.java.multithreading.daemonthread;
/*
 * In Java, a daemon thread is a type of thread that runs in the background,
 * providing a service to other threads or performing tasks that should not
 * prevent the application from exiting. Daemon threads are considered "service"
 * threads as opposed to "user" threads, which are the threads created by the
 * application to perform its main tasks.
 * 
 * The key characteristic of a daemon thread is that they are automatically
 * terminated when there are no more user threads running in the application. In
 * other words, if all user threads have finished executing, the Java Virtual
 * Machine (JVM) will exit, regardless of whether daemon threads are still
 * running or not. This makes daemon threads useful for tasks like background
 * tasks, garbage collection, and maintaining system resources.
 * 
 * To mark a thread as a daemon thread, you need to call the setDaemon(true)
 * method on the thread object before starting it.
 */