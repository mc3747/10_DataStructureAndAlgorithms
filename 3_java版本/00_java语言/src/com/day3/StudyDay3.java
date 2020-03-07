package com.day3;

public class StudyDay3 {
//引用变量，可能在堆空间，也可能在栈空间
//对象数组
//构造方法：默认构造方法和自定义构造方法
//this：当前类的属性和方法；另外的构造方法
//this本质：隐藏的，位置最靠前的方法参数
	public static class Dog{
		public  int price;
	};
	public static class  Person{
		public  int age;
		public Dog dog;
	};
	public static void main(String[] args) {
		// 复杂对象
//		Dog dog = new Dog();
//		dog.price = 100;
//		
//		Person person = new  Person();
//		person.age = 20;
//		person.dog = dog;
//		
//		person.dog.price = 200;
//		System.out.println(dog.price);
		
		// 对象数组
		Dog[] dogs = new Dog[7];
		for (int i = 0; i < dogs.length; i++) {
			dogs[i] = new Dog();
			System.out.println(dogs[i]);
		}
		
		
	}


}
