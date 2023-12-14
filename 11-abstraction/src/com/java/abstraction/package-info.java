package com.java.abstraction;

/*
 * Data abstraction is the process of hiding certain details and showing only
 * essential information to the user. Abstraction can be achieved with either
 * abstract classes or interfaces.
 * 
 * In Java, abstraction is a key concept provided by object-oriented programming
 * that allows developers to create abstract classes and interfaces to define
 * the structure and behavior of classes without providing a complete
 * implementation. Abstraction helps to define a blueprint for classes, leaving
 * the specific implementation details to the subclasses.
 * 
 * In Java, you can achieve abstraction through abstract classes and interfaces:
 * 
 * Abstract Classes: An abstract class is a class that cannot be instantiated
 * directly and may contain both abstract and concrete methods. Abstract methods
 * are declared without an implementation, leaving it to the subclasses to
 * provide the specific implementation. Abstract classes are declared using the
 * abstract keyword.
 * 
 * Interfaces: An interface is a reference type in Java that is similar to a
 * class, but it only contains abstract method declarations and constant fields.
 * All methods in an interface are implicitly public and abstract. Classes can
 * implement multiple interfaces to inherit their behavior.
 * 
 * Both abstract classes and interfaces allow you to define common methods and
 * attributes shared among multiple classes, promoting code reuse and
 * modularity. When a class extends an abstract class or implements an
 * interface, it must provide concrete implementations for all abstract methods
 * declared in the superclass or interface.
 */