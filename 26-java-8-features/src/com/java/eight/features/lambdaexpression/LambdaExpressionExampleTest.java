package com.java.eight.features.lambdaexpression;

public class LambdaExpressionExampleTest {

	public static void main(String[] args) {
		LambdaExpressionExample sum = (x, y) -> System.out.println("The sum of two numbers is : " + (x + y));
		sum.add(50, 60);
	}

}
