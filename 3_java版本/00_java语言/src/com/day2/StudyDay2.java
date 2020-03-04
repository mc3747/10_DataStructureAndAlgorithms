package com.day2;

public class StudyDay2 {

	public static void main(String[] args) {
		numberDemo();
		charDemo();
		stringDemo();
		arrayDemo();
		methodDemo(11, 12, 13);
		printDemo();
	}

//1️⃣数字
	// byte、int、long、double 等为 java
	// 的基础数据类型。所有的包装类（Integer、Long、Byte、Double、Float、Short）都是抽象类 Number 的子类
	// 所有的包装类（Integer、Long、Byte、Double、Float、Short）都是抽象类 Number 的子类
	public static void numberDemo() {
		/*
		 * 1,注意 == 与 equals的区别,== 它比较的是对象的地址mequals 比较的是对象的内容 2,Java 会对 -128 ~ 127
		 * 的整数进行缓存，所以当定义两个变量初始化值位于 -128 ~ 127 之间时，两个变量使用了同一地址： 3,当两个 Integer 变量的数值超出
		 * -128 ~ 127 范围时, 变量使用了不同地址
		 * 
		 */
		Integer i = 100;
		Integer j = 100;
		System.out.println(i == j);
		System.out.println(i.equals(j));

//		Number类和Math类有很多类方法
	}

//️2️⃣字符
	public static void charDemo() {
		// 字符数据
		char ch1 = 'a';
		System.out.println(ch1);
		// 字符对象
		Character ch2 = 'b';
		System.out.println(ch2);
		// 字符数组
		char[] charArray = { 'a', 'b', 'c', 'd', 'e' };
		System.out.println(charArray);

//		Character类有很多类方法
	}

//3️⃣️⃣字符串
	// String 长度大小不可变
	// StringBuffer 和 StringBuilder 长度可变
	// StringBuffer 线程安全 StringBuilder 线程不安全
	// StringBuilder 速度快
	public static void stringDemo() {
		String greeting = "不可变字符串";
		System.out.println(greeting);
		StringBuffer sBuffer = new StringBuffer("可变字符串");
		sBuffer.append("www");
		sBuffer.append(".runoob");
		sBuffer.append(".com");
		System.out.println(sBuffer);
	}

//4️⃣️⃣数组
	// 元素存储在堆空间
	public static void arrayDemo() {
		char[] arr1 = { '1', '2', '3' };
		System.out.println(arr1);
//	   ⚠️ 数组️名称 输出的是对象的哈希值
		int[] arr2 = { 1, 2, 3 };
		System.out.println(arr2);

//		数组的遍历
		for (int i : arr2) {
			System.out.println(i);
		}
	}

//5️⃣️️方法
	// 1，可变参数，必须传同类型的
	// 2，可变参数，必须是最后一个参数，防止歧义
	// 3，基本类型：值传递；引用类型（数组和对象）：地址传递
	// 4，方法签名：方法名 + 参数类型，不包括返回值，必须唯一
	// 5，方法可重载，方法名相同，方法签名不同（参数个数，参数类型不同）

	public static void methodDemo(int... numbers) {
		for (int i : numbers) {
			System.out.println(i);
		}
	}

//6️⃣打印
	public static void printDemo() {
		String name = "Tom";
		int age = 20;
//	方式1：用+，不直观
		System.out.println("my name is" + name + ",age is" + age);
//	方式2：用printf，利用格式化，%n相当于回车
		System.out.printf("my name is %s,age is %d", name, age);

	}
}