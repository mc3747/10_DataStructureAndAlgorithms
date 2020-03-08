package day6;
//接口
interface Flyanimal {
	void fly();
}
//实现接口的类
class Ant implements Flyanimal {
	public void fly() {
		System.out.println("昆虫 can  fly");
	}
}
//实现接口的类
class Bird implements Flyanimal {
	public void fly() {
		System.out.println("鸟类 can  fly");
	}
}
//调用
public class StudyDay6_1 {
	public static void main(String[] args) {
		Ant ant = new Ant();
		ant.fly();

		Bird bird = new Bird();
		bird.fly();
	}
}
