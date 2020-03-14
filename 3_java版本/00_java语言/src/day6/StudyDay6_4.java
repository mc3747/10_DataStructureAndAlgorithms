package day6;
//静态方法的例子
//接口定义静态方法1
interface Eating {
	static void eat(String name) {
		System.out.println("Eating✅" + name);
	}
}
//接口定义静态方法2
interface Sleeping {
	static void eat(String name) {
		System.out.println("Sleeping✅" + name);
	}
}
//接口定义静态方法3
interface Dogs extends Eating, Sleeping {
	static void eat(String name) {
		System.out.println("Dog✅" + name);
	}
}
//实际使用
public class StudyDay6_4 {
	public static void main(String[] args) {
		Dogs.eat("1");
		Eating.eat("2");
		Sleeping.eat("3");
	}
}
