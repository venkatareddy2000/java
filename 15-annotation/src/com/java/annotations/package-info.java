package com.java.annotations;

/*
 * Built-in annotations in Java are a set of pre-defined annotations provided by
 * the Java language itself. These annotations have special meanings and are
 * used by the Java compiler, runtime environment, and various tools to provide
 * additional information about code elements, enforce rules, and control
 * behavior. Here are some of the most commonly used built-in annotations in
 * Java:
 * 
 * 1. **@Override**: - Usage: Applied to methods. - Purpose: Indicates that a
 * method in a subclass is intended to override a method with the same name in
 * its superclass. It helps catch errors at compile time if the method doesn't
 * actually override a superclass method.
 * 
 * ```java
 * 
 * @Override public void someMethod() { // Override the superclass method } ```
 * 
 * 2. **@Deprecated**: - Usage: Applied to classes, methods, fields, or
 * interfaces. - Purpose: Marks a class, method, or field as deprecated,
 * indicating that it should no longer be used. This helps developers understand
 * that the element is outdated and may be removed in future versions.
 * 
 * ```java
 * 
 * @Deprecated public void oldMethod() { // This method is deprecated } ```
 * 
 * 3. **@SuppressWarnings**: - Usage: Applied to classes, methods, fields, or
 * local variables. - Purpose: Suppresses compiler warnings for the annotated
 * code. It is often used when you are aware of a specific warning but want to
 * ignore it.
 * 
 * ```java
 * 
 * @SuppressWarnings("unchecked") List<String> myList = new ArrayList(); ```
 * 
 */