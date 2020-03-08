package day4;

import day4.*;
import day4.model.Cat;


public class StudyDay4 {
	public static void main(String[] args) {
		
//1,直接导入类:包名 + 文件名 + 类名
		day4.model.Dog dog = new day4.model.Dog();
		dog.age = 5;
		System.out.println(dog.age);
		
//2,顶部导入类:import + 包名 + 类名,可以引用所有
		Cat cat = new Cat();
		cat.age = 5;
		System.out.println(cat.age);
		
//3,
		
	};
	
}
