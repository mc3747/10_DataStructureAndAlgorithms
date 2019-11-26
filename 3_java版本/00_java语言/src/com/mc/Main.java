/*
 * 1，package包名
 * 2，文件名和类名要一致，都为Main
 * 3，入口函数为main（），而且public修饰
 * 4，没有public修饰，可与文件名不同
 * 4，main函数调用了java开发包JDK提供的打印函数System.out.print()
 * */


package com.mc;
import com.mc2.Demo;

public class Main {
	public static void main(String[] args) {
		System.out.print("hello world\n");
		baseType();
		packageType();
		arrayType();
		objectType();
		inheritDemo();
		packageDemo();
	};
//1，基本数据
	/*
	整型类型：byte（字节）、short（短整型）、int（整型）、long（长整型）
	浮点类型：float（单精度浮点）、double（双精度浮点）
	字符型：char
	布尔型：boolean
	*/
	public static void baseType() {
		int a = 5;
		System.out.println(a);
	};
	
//2，封装数据
	/*
	Integer：对应封装了基本类型 int；
	Long：对应封装了基本类型 long；
	Float：对应封装了基本类型 float；
	Double：对应封装了基本类型 double；
	Boolean：对应封装了基本类型 boolean；
	String：对应封装了字符串类型 char[]。
	*/	
	public static void packageType() {
		Integer oa = new Integer(6);
		System.out.println(oa);
	};
	
//3，数组
	public static void arrayType() {
		int[] a = {1,2};
		System.out.println(a[1]);
	};
	
//4,对象
	public static void objectType() {
		Dog dog1 = new Dog(2, 10);// 通过 new 关键词创建了一个 Dog 对象 dog1
		int age = dog1.getAge();// 调用 dog1 的 getAge() 方法
		dog1.run();// 调用 dog1 的 run() 方法
	};

//5，权限修饰符
/*
private 修饰的函数或者成员变量，只能在类内部使用。
protected 修饰的函数或者成员变量，可以在类及其子类内使用。
public 修饰的函数或者成员变量，可以被任意访问。	
*/	
	
//6，继承
/*
Java 语言使用 extends 关键字来实现继承。
被继承的类叫作父类，继承类叫作子类。
子类继承父类的所有非 private 属性和方法。
 **/	
	public static void inheritDemo() {
		MiniDog miniDog = new MiniDog(3, 8);
		miniDog.run();
		
	}
	
//	7，容器
/*
 工具类，底层封装的各种数据结构
 ArrayList 底层就是数组，LinkedList 底层就是链表，HashMap 底层就是散列表等。
 这些容器我们可以拿来直接使用，不用从零开始开发，大大提高了编码的效率
 * */	
	
//	8，package包
	public static void packageDemo() {
		Demo demo = new Demo();
		demo.showDemo();
	}
}

 class Dog { // 定义了一个 Dog 类
	  private int age; // 属性或者成员变量
	  private int weight;

	  public Dog(int age, int weight) { // 构造函数
	    this.age = age;
	    this.weight = weight;
	  }

	  public int getAge() { // 函数或者方法
	    return age;
	  }
	  
	  public int getWeigt() {
	    return weight;
	  }
	  
	  public void run() {
		  System.out.println("年龄"+age +"重量"+ weight);
	  }
	};
 
 class MiniDog extends Dog{
	 public MiniDog(int age, int weight) {
		super(age, weight);
	}
	 public void wangwang() {
		 System.out.println("旺旺");
	  }
 
 }
 
 