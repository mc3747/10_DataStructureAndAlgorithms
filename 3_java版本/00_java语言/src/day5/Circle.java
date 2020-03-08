package day5;

public class Circle extends Shape {
//	构造方法
	public Circle(double radius) {
		this.radius = radius;
	};

//	半径变量
	private double radius;

//  重写父类的抽象方法
	@Override
	protected void calculate() {
		double half = Math.PI * radius;
		area = half * radius;
		girth = half * 2;
	}

}
