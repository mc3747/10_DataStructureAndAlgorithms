package com.mc;

import com.mc.Times.Task;

public class Main {
	public static void main(String[] args) {
//		
		System.out.print("hello world\n");
		System.out.print(fib1(0));
		int n = 45;
		
//		测试时间的小工具测试
		//方法1的时间
		Times.test("fib1", new Task() {
		public void execute() {
			System.out.println(fib1(n));
		}
	});
		//方法2的时间
		Times.test("fib2", new Task() {
		public void execute() {
			System.out.println(fib2(n));
		}
	});
		
	}
//	斐波那契数1:递归
	public static int fib1(int n) {
		if (n <= 1) return n;
		return fib1(n - 1) + fib1(n - 2);
	}
	
//	斐波那契数2
	public static int fib2(int n) {
		if (n <= 1) return n;
		int first = 0;
		int second = 1;
		for (int i = 0; i < n - 1; i++) {
			int sum = first + second;
			first = second;
			second = sum;
		}
		return second;
		
	}
	

}
