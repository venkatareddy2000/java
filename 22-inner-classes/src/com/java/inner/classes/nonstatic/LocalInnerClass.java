package com.java.inner.classes.nonstatic;

public class LocalInnerClass {

	void method1() {
		System.out.println("From outer class method1");

		/* Local inner class is defined inside a method, block or a constructor */
		class Inner {
			void method2() {
				System.out.println("From inner class method2");
			}
		}

		/* We can create an object for the Local inner class inside the method itself */
		Inner inner = new Inner();
		inner.method2();
	}

	public static void main(String[] args) {
		LocalInnerClass outer = new LocalInnerClass();
		outer.method1();

	}

}
