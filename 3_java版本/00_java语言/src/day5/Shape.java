package day5;

public abstract class Shape {
//	面积
	protected double area;
	
//	周长
	protected double girth;

	public double getArea() {
		return area;
	}

	public double getGirth() {
		return girth;
	}
	public void show() {
		calculate();
		System.out.println("面积:" + area + "✅" + "周长:" + girth);
	}
	protected abstract void calculate();
}
