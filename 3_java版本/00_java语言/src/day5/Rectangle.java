package day5;

public class Rectangle extends Shape {
//	构造方法
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	};

//	长和宽变量
	private double width;
	private double height;

//  重写父类的抽象方法
	@Override
	protected void calculate() {
		area = width * height;
		girth = (width + height) * 2;
	}

}
