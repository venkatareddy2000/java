package com.venky.wrapper.classes.demo;

public class PrimitivesandObjectsDemo {

	public static void main(String[] args) {

		/* byte - Byte */
		byte byte1 = 10;
		System.out.println("Byte1 : " + byte1);
		/* converting byte into Byte explicitly */
		Byte byte2 = Byte.valueOf(byte1);
		System.out.println("Byte2 : " + byte2);
		/* converting byte into Byte by the compiler automatically(Implicitly) */
		Byte byte3 = byte1;
		System.out.println("Byte3 : " + byte3);
		/* converting Byte into byte explicitly */
		byte byte4 = byte3.byteValue();
		System.out.println("Byte4 : " + byte4);
		/* converting Byte into byte by the compiler automatically(Implicitly) */
		byte byte5 = byte3;
		System.out.println("Byte5 : " + byte5);

		/* short - Short */
		short short1 = 11;
		System.out.println("short1 : " + short1);
		/* converting short into Short explicitly */
		Short short2 = Short.valueOf(short1);
		System.out.println("Short2 : " + short2);
		/* converting short into Short by the compiler automatically(Implicitly) */
		Short short3 = short1;
		System.out.println("Short3 : " + short3);
		/* converting Short into short explicitly */
		short short4 = short3.shortValue();
		System.out.println("short4 : " + short4);
		/* converting Short into short by the compiler automatically(Implicitly) */
		short short5 = short3;
		System.out.println("Short5 : " + short5);

		/* int - Integer */
		int num1 = 12;
		System.out.println("Num1 : " + num1);
		/* converting int into Integer explicitly */
		Integer num2 = Integer.valueOf(num1);
		System.out.println("Num2 : " + num2);
		/* converting int into Integer by the compiler automatically(Implicitly) */
		Integer num3 = num1;
		System.out.println("Num3 : " + num3);
		/* converting Integer into int explicitly */
		int num4 = num3.intValue();
		System.out.println("Num4 : " + num4);
		/* converting Integer into int by the compiler automatically(Implicitly) */
		int num5 = num3;
		System.out.println("Num5 : " + num5);

		/* long - Long */
		long long1 = 13L;
		System.out.println("Long1 : " + long1);
		/* converting long into Long explicitly */
		Long long2 = Long.valueOf(long1);
		System.out.println("Long2 : " + long2);
		/* converting long into Long by the compiler automatically(Implicitly) */
		Long long3 = long1;
		System.out.println("Long3 : " + long3);
		/* converting Long into long explicitly */
		long long4 = long3.longValue();
		System.out.println("Long4 : " + long4);
		/* converting Long into long by the compiler automatically(Implicitly) */
		long long5 = long3;
		System.out.println("Long5 : " + long5);

		/* float - Float */
		float float1 = 14.123F;
		System.out.println("Float1 : " + float1);
		/* converting float into Float explicitly */
		Float float2 = Float.valueOf(float1);
		System.out.println("Float2 : " + float2);
		/* converting float into Float by the compiler automatically(Implicitly) */
		Float float3 = float1;
		System.out.println("Float3 : " + float3);
		/* converting Float into float explicitly */
		float float4 = float3.floatValue();
		System.out.println("Float4 : " + float4);
		/* converting Float into float by the compiler automatically(Implicitly) */
		float float5 = float3;
		System.out.println("Float5 : " + float5);

		/* double - Double */
		double double1 = 14.1234567D;
		System.out.println("Double1 : " + double1);
		/* converting double into Double explicitly */
		Double double2 = Double.valueOf(double1);
		System.out.println("Double2 : " + double2);
		/* converting double into Double by the compiler automatically(Implicitly) */
		Double double3 = double1;
		System.out.println("Double3 : " + double3);
		/* converting Double into double explicitly */
		double double4 = double3.doubleValue();
		System.out.println("Double4 : " + double4);
		/* converting Double into double by the compiler automatically(Implicitly) */
		double double5 = double3;
		System.out.println("Double5 : " + double5);

		/* boolean - Boolean */
		boolean boolean1 = true;
		System.out.println("Boolean1 : " + boolean1);
		/* converting boolean into Boolean explicitly */
		Boolean boolean2 = Boolean.valueOf(boolean1);
		System.out.println("Boolean2 : " + boolean2);
		/* converting boolean into Boolean by the compiler automatically(Implicitly) */
		Boolean boolean3 = boolean1;
		System.out.println("Boolean3 : " + boolean3);
		/* converting Boolean into boolean explicitly */
		boolean boolean4 = boolean3.booleanValue();
		System.out.println("Boolean4 : " + boolean4);
		/* converting Boolean into boolean by the compiler automatically(Implicitly) */
		boolean boolean5 = boolean3;
		System.out.println("Boolean5 : " + boolean5);

		/* char - Character */
		char char1 = 'A';
		System.out.println("char1 : " + char1);
		/* converting char into Character explicitly */
		Character char2 = Character.valueOf(char1);
		System.out.println("Char2 : " + char2);
		/* converting char into Character by the compiler automatically(Implicitly) */
		Character char3 = char1;
		System.out.println("Char3 : " + char3);
		/* converting Character into char explicitly */
		char char4 = char3.charValue();
		System.out.println("Char4 : " + char4);
		/* converting Character into char by the compiler automatically(Implicitly) */
		char char5 = char3;
		System.out.println("char5 : " + char5);

	}

}
