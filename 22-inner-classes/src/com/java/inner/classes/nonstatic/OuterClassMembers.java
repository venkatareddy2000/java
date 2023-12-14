package com.java.inner.classes.nonstatic;

public class OuterClassMembers {
	
	private static int x = 100;
	private int y;

	OuterClassMembers(int y) {
		this.y = y;
	}

	class Inner {
		private int y;

		Inner(int y) {
			this.y = y;
		}

		void method() {
			System.out.println("Outer class X : " + OuterClassMembers.x);
			System.out.println("Outer class Y : " + OuterClassMembers.this.y);
			System.out.println("Inner class Y : " + this.y);
		}

	}

	public static void main(String[] args) {
		
		OuterClassMembers outer = new OuterClassMembers(50);
		OuterClassMembers.Inner inner = outer.new Inner(60);
		inner.method();

	}

}
