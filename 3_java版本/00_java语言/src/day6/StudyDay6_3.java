package day6;
//接口的例子
//接口
interface Eatable {
	default void eat(String name) {
		System.out.println("Eatable✅" + name);
	}
};

//接口的实现类Dog
class Dog implements Eatable {
}

//接口的实现类Cat
class Cat implements Eatable {
	@Override
	public void eat(String name) {
		Eatable.super.eat(name);
		System.out.println("cat eat✅" + name);
	}
}
//使用
public class StudyDay6_3 {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.eat("bone");
		Cat cat = new Cat();
		cat.eat("fish");
	}
}
