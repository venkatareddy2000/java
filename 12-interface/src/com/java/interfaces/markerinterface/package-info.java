package com.java.interfaces.markerinterface;

/*
 * A marker interface is a special type of interface in Java that does not
 * declare any methods to be implemented by the classes that implement it.
 * Instead, it acts as a "marker" to provide some specific information about the
 * implementing class to the compiler or other tools.
 * 
 * The marker interfaces have no method signatures, but they simply serve as a
 * flag or a metadata to identify certain characteristics or behavior of the
 * implementing classes. By implementing a marker interface, a class indicates
 * that it possesses some capabilities or features required by the marker
 * interface.
 * 
 * Some common examples of marker interfaces in Java include:
 * 
 * Serializable: This is one of the most well-known marker interfaces in Java.
 * When a class implements the Serializable interface, it tells the Java runtime
 * that its objects can be serialized (converted into a stream of bytes) and
 * deserialized (reconstructed from the stream of bytes).
 * 
 * Cloneable: When a class implements the Cloneable interface, it indicates that
 * its objects can be cloned (copied) using the clone() method.
 * 
 * RandomAccess: The RandomAccess interface is a marker interface used to
 * indicate that a list or collection supports efficient random access to its
 * elements, such as ArrayList.
 * 
 * Remote: This marker interface is used in the context of Java RMI (Remote
 * Method Invocation) to indicate that a remote object can be accessed from a
 * different JVM.
 * 
 */
