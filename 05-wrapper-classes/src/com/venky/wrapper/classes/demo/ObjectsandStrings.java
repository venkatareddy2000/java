package com.venky.wrapper.classes.demo;

public class ObjectsandStrings {

	public static void main(String[] args) {

		// Implicit Conversion (from wrapper objects to strings)

		// Byte to String (implicit)
		Byte byteObject = 42;
		String byteStringImplicit = byteObject.toString();

		// Short to String (implicit)
		Short shortObject = 500;
		String shortStringImplicit = shortObject.toString();

		// Integer to String (implicit)
		Integer intObject = 42;
		String intStringImplicit = intObject.toString();

		// Long to String (implicit)
		Long longObject = 123456789L;
		String longStringImplicit = longObject.toString();

		// Float to String (implicit)
		Float floatObject = 3.14f;
		String floatStringImplicit = floatObject.toString();

		// Double to String (implicit)
		Double doubleObject = 2.71828;
		String doubleStringImplicit = doubleObject.toString();

		// Character to String (implicit)
		Character charObject = 'A';
		String charStringImplicit = charObject.toString();

		// Boolean to String (implicit)
		Boolean boolObject = true;
		String boolStringImplicit = boolObject.toString();

		// Explicit Conversion (from wrapper objects to strings)

		// Byte to String (explicit)
		String byteStringExplicit = String.valueOf(byteObject);

		// Short to String (explicit)
		String shortStringExplicit = String.valueOf(shortObject);

		// Integer to String (explicit)
		String intStringExplicit = String.valueOf(intObject);

		// Long to String (explicit)
		String longStringExplicit = String.valueOf(longObject);

		// Float to String (explicit)
		String floatStringExplicit = String.valueOf(floatObject);

		// Double to String (explicit)
		String doubleStringExplicit = String.valueOf(doubleObject);

		// Character to String (explicit)
		String charStringExplicit = String.valueOf(charObject);

		// Boolean to String (explicit)
		String boolStringExplicit = String.valueOf(boolObject);

		// Implicit Conversion (from strings to wrapper objects)

		// String to Byte (implicit)
		String byteString = "42";
		Byte byteObjectImplicit = Byte.valueOf(byteString);

		// String to Short (implicit)
		String shortString = "500";
		Short shortObjectImplicit = Short.valueOf(shortString);

		// String to Integer (implicit)
		String intString = "42";
		Integer intObjectImplicit = Integer.valueOf(intString);

		// String to Long (implicit)
		String longString = "123456789";
		Long longObjectImplicit = Long.valueOf(longString);

		// String to Float (implicit)
		String floatString = "3.14";
		Float floatObjectImplicit = Float.valueOf(floatString);

		// String to Double (implicit)
		String doubleString = "2.71828";
		Double doubleObjectImplicit = Double.valueOf(doubleString);

		// String to Character (implicit)
		String charString = "B";
		Character charObjectImplicit = charString.charAt(0);

		// String to Boolean (implicit)
		String boolString = "false";
		Boolean boolObjectImplicit = Boolean.valueOf(boolString);

		// Explicit Conversion (from strings to wrapper objects)

		// String to Byte (explicit)
		Byte byteObjectExplicit = Byte.valueOf(byteString);

		// String to Short (explicit)
		Short shortObjectExplicit = Short.valueOf(shortString);

		// String to Integer (explicit)
		Integer intObjectExplicit = Integer.valueOf(intString);

		// String to Long (explicit)
		Long longObjectExplicit = Long.valueOf(longString);

		// String to Float (explicit)
		Float floatObjectExplicit = Float.valueOf(floatString);

		// String to Double (explicit)
		Double doubleObjectExplicit = Double.valueOf(doubleString);

		// String to Character (explicit)
		Character charObjectExplicit = charString.charAt(0);

		// String to Boolean (explicit)
		Boolean boolObjectExplicit = Boolean.valueOf(boolString);

		// Display results
		System.out.println("Implicit Conversion (from wrapper objects to strings):");
		System.out.println("Byte to String (implicit): " + byteStringImplicit);
		System.out.println("Short to String (implicit): " + shortStringImplicit);
		System.out.println("Integer to String (implicit): " + intStringImplicit);
		System.out.println("Long to String (implicit): " + longStringImplicit);
		System.out.println("Float to String (implicit): " + floatStringImplicit);
		System.out.println("Double to String (implicit): " + doubleStringImplicit);
		System.out.println("Character to String (implicit): " + charStringImplicit);
		System.out.println("Boolean to String (implicit): " + boolStringImplicit);
		System.out.println();

		System.out.println("Explicit Conversion (from wrapper objects to strings):");
		System.out.println("Byte to String (explicit): " + byteStringExplicit);
		System.out.println("Short to String (explicit): " + shortStringExplicit);
		System.out.println("Integer to String (explicit): " + intStringExplicit);
		System.out.println("Long to String (explicit): " + longStringExplicit);
		System.out.println("Float to String (explicit): " + floatStringExplicit);
		System.out.println("Double to String (explicit): " + doubleStringExplicit);
		System.out.println("Character to String (explicit): " + charStringExplicit);
		System.out.println("Boolean to String (explicit): " + boolStringExplicit);
		System.out.println();

		System.out.println("Implicit Conversion (from strings to wrapper objects):");
		System.out.println("String to Byte (implicit): " + byteObjectImplicit);
		System.out.println("String to Short (implicit): " + shortObjectImplicit);
		System.out.println("String to Integer (implicit): " + intObjectImplicit);
		System.out.println("String to Long (implicit): " + longObjectImplicit);
		System.out.println("String to Float (implicit): " + floatObjectImplicit);
		System.out.println("String to Double (implicit): " + doubleObjectImplicit);
		System.out.println("String to Character (implicit): " + charObjectImplicit);
		System.out.println("String to Boolean (implicit): " + boolObjectImplicit);
		System.out.println();

		System.out.println("Explicit Conversion (from strings to wrapper objects):");
		System.out.println("String to Byte (explicit): " + byteObjectExplicit);
		System.out.println("String to Short (explicit): " + shortObjectExplicit);
		System.out.println("String to Integer (explicit): " + intObjectExplicit);
		System.out.println("String to Long (explicit): " + longObjectExplicit);
		System.out.println("String to Float (explicit): " + floatObjectExplicit);
		System.out.println("String to Double (explicit): " + doubleObjectExplicit);
		System.out.println("String to Character (explicit): " + charObjectExplicit);
		System.out.println("String to Boolean (explicit): " + boolObjectExplicit);
	}

}
