package com.venky.wrapper.classes.demo;

public class PrimitivesandString {

	public static void main(String[] args) {

		// Explicit (Primitive to String)

		// byte to String
		byte byteValue = 10;
		String byteString = Byte.toString(byteValue);

		// short to String
		short shortValue = 500;
		String shortString = Short.toString(shortValue);

		// int to String
		int intValue = 42;
		String stringValue = Integer.toString(intValue);

		// long to String
		long longValue = 123456789L;
		String longString = Long.toString(longValue);

		// float to String
		float floatValue = 3.14159f;
		String floatString = Float.toString(floatValue);

		// double to String
		double doubleValue = 2.71828;
		String doubleString = Double.toString(doubleValue);

		// char to String
		char charValue = 'A';
		String charString = Character.toString(charValue);

		// boolean to String
		boolean boolValue = true;
		String boolString = Boolean.toString(boolValue);

		// Display results
		System.out.println("Explicit (Primitive to String):");
		System.out.println("byte to String: " + byteString);
		System.out.println("short to String: " + shortString);
		System.out.println("int to String: " + stringValue);
		System.out.println("long to String: " + longString);
		System.out.println("float to String: " + floatString);
		System.out.println("double to String: " + doubleString);
		System.out.println("char to String: " + charString);
		System.out.println("boolean to String: " + boolString);
		System.out.println();

		// Explicit (String to Primitive)

		// String to byte
		String parsedByteString = "15";
		byte parsedByte = Byte.parseByte(parsedByteString);

		// String to short
		String parsedShortString = "1000";
		short parsedShort = Short.parseShort(parsedShortString);

		// String to int
		String intString = "42";
		int parsedInt = Integer.parseInt(intString);

		// String to long
		String parsedLongString = "9876543210";
		long parsedLong = Long.parseLong(parsedLongString);

		// String to float
		String parsedFloatString = "2.71828";
		float parsedFloat = Float.parseFloat(parsedFloatString);

		// String to double
		String parsedDoubleString = "3.14";
		double parsedDouble = Double.parseDouble(parsedDoubleString);

		// String to char
		String parsedCharString = "B";
		char parsedChar = parsedCharString.charAt(0);

		// String to boolean
		String parsedBoolString = "false";
		boolean parsedBool = Boolean.parseBoolean(parsedBoolString);

		// Display results
		System.out.println("Explicit (String to Primitive):");
		System.out.println("String to byte: " + parsedByte);
		System.out.println("String to short: " + parsedShort);
		System.out.println("String to int: " + parsedInt);
		System.out.println("String to long: " + parsedLong);
		System.out.println("String to float: " + parsedFloat);
		System.out.println("String to double: " + parsedDouble);
		System.out.println("String to char: " + parsedChar);
		System.out.println("String to boolean: " + parsedBool);
		System.out.println();

		// Implicit (Primitive to String)

		// byte to String
		String explicitByteString = String.valueOf(byteValue);

		// short to String
		String explicitShortString = String.valueOf(shortValue);

		// int to String
		String explicitIntString = String.valueOf(intValue);

		// long to String
		String explicitLongString = String.valueOf(longValue);

		// float to String
		String explicitFloatString = String.valueOf(floatValue);

		// double to String
		String explicitDoubleString = String.valueOf(doubleValue);

		// char to String
		String explicitCharString = String.valueOf(charValue);

		// boolean to String
		String explicitBoolString = String.valueOf(boolValue);

		// Display results
		System.out.println("Implicit (Primitive to String):");
		System.out.println("byte to String: " + explicitByteString);
		System.out.println("short to String: " + explicitShortString);
		System.out.println("int to String: " + explicitIntString);
		System.out.println("long to String: " + explicitLongString);
		System.out.println("float to String: " + explicitFloatString);
		System.out.println("double to String: " + explicitDoubleString);
		System.out.println("char to String: " + explicitCharString);
		System.out.println("boolean to String: " + explicitBoolString);
		System.out.println();

		// Implicit (String to Primitive)

		// String to byte
		byte explicitParsedByte = Byte.valueOf(parsedByteString);

		// String to short
		short explicitParsedShort = Short.valueOf(parsedShortString);

		// String to int
		int explicitParsedInt = Integer.valueOf(intString);

		// String to long
		long explicitParsedLong = Long.valueOf(parsedLongString);

		// String to float
		float explicitParsedFloat = Float.valueOf(parsedFloatString);

		// String to double
		double explicitParsedDouble = Double.valueOf(parsedDoubleString);

		// String to char
		char explicitParsedChar = parsedCharString.charAt(0);

		// String to boolean
		boolean explicitParsedBool = Boolean.valueOf(parsedBoolString);

		// Display results
		System.out.println("Implicit (String to Primitive):");
		System.out.println("String to byte: " + explicitParsedByte);
		System.out.println("String to short: " + explicitParsedShort);
		System.out.println("String to int: " + explicitParsedInt);
		System.out.println("String to long: " + explicitParsedLong);
		System.out.println("String to float: " + explicitParsedFloat);
		System.out.println("String to double: " + explicitParsedDouble);
		System.out.println("String to char: " + explicitParsedChar);
		System.out.println("String to boolean: " + explicitParsedBool);
	}

}
