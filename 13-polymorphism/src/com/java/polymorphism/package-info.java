package com.java.polymorphism;

/*
 * Polymorphism is a fundamental concept in object-oriented programming (OOP)
 * that allows objects of different classes to be treated as objects of a common
 * superclass. It allows a single interface or method to handle various types of
 * objects. The word "polymorphism" comes from Greek, where "poly" means many
 * and "morph" means form.
 * 
 * There are two main types of polymorphism:
 * 
 * Compile-time (Static) Polymorphism:
 * 
 * Method Overloading: This occurs when a class has multiple methods with the
 * same name but different parameter lists. The compiler determines which method
 * to call based on the number or types of arguments provided during the method
 * 
 * call. Runtime (Dynamic) Polymorphism:
 * 
 * Method Overriding: This occurs when a subclass provides a specific
 * implementation for a method that is already defined in its superclass. When
 * the method is called on an object of the subclass, the overridden version is
 * executed instead of the superclass version.
 * 
 * Interface Polymorphism: This is achieved through the use of interfaces in
 * languages like Java. Objects of different classes can be treated as instances
 * of a common interface, and the specific behavior is determined at runtime
 * based on the actual class of the object.
 * 
 * Polymorphism promotes flexibility and code reusability, making it easier to
 * create extensible and maintainable software. By using polymorphism,
 * developers can write more generic code that can handle various types of
 * objects without needing to know their specific implementations.
 */