package day6;
//多态的实例
class A_Animal {
	public void speak() {
		System.out.println("Animal-Speak");
	}
}

class A_Dog extends A_Animal {
	@Override
	public void speak() {

		System.out.println("Dog-WangWang");
	}
}

class A_Cat extends A_Animal {
	@Override
	public void speak() {

		System.out.println("Cat-MiaoMiao");
	}
}

public class StudyDay6_5 {
	static void speak(A_Animal animal) {
		animal.speak();
	}

	public static void main(String[] args) {
		speak(new A_Animal());
		speak(new A_Dog());
		speak(new A_Cat());
	}
}
