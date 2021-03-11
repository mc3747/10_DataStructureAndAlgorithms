

import java.text.SimpleDateFormat;
import java.util.Date;

class Times {
	private static final SimpleDateFormat fmt = new SimpleDateFormat("HH:mm:ss.SSS");
	
	public interface Task {
		void execute();
	}
	
	public static void test(String title, Task task) {
		if (task == null) return;
		title = (title == null) ? "" : ("【" + title + "】");
		System.out.println(title);
		System.out.println("开始：" + fmt.format(new Date()));
		long begin = System.currentTimeMillis();
		task.execute();
		long end = System.currentTimeMillis();
		System.out.println("结束：" + fmt.format(new Date()));
		double delta = (end - begin) / 1000.0;
		System.out.println("耗时：" + delta + "秒");
		System.out.println("-------------------------------------");
	}
}

public class Complexity {
	public static void main(String[] args) {
//		
		System.out.print("hello world\n");
		System.out.print(fib1(0));
		int n = 45;
		
//		测试时间的小工具测试
		//方法1的时间
		Times.test("fib1", new Times.Task() {
		public void execute() {
			System.out.println(fib1(n));
		}
	});
		//方法2的时间
		Times.test("fib2", new Times.Task() {
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
	
//	大O分析法案例
	// O(1)
	public static void test1(int n) {
		// 1次，O(1)
		if (n > 10) { 
			System.out.println("n > 10");
		} else if (n > 5) { // 2
			System.out.println("n > 5");
		} else {
			System.out.println("n <= 5"); 
		}
		
		// 1 + 4 + 4 + 4
		for (int i = 0; i < 4; i++) {
			System.out.println("test");
		}
		
	}
	
	// O(n)
	public static void test2(int n) {
		
		// 1 + 3n
		for (int i = 0; i < n; i++) {
			System.out.println("test");
		}
	}
	
	// O(n^2)
	public static void test3(int n) {
		// 1 + 2n + n * (1 + 3n)
		// 1 + 2n + n + 3n^2
		// 3n^2 + 3n + 1
		
		
		// O(n)
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.println("test");
			}
		}
	}
	
	// O(n)
	public static void test4(int n) {
		// 1 + 2n + n * (1 + 45)
		// 1 + 2n + 46n
		// 48n + 1
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 15; j++) {
				System.out.println("test");
			}
		}
	}
	
	// O(logn)
	public static void test5(int n) {
		// 8 = 2^3
		// 16 = 2^4
		
		// 3 = log2(8)
		// 4 = log2(16)
		
		// 执行次数 = log2(n)
		while ((n = n / 2) > 0) {
			System.out.println("test");
		}
	}
	
	// O(logn)
	public static void test6(int n) {
		// log5(n)
		while ((n = n / 5) > 0) {
			System.out.println("test");
		}
	}
	
	// O(nlogn)
	public static void test7(int n) {
		// 1 + 2*log2(n) + log2(n) * (1 + 3n)
		// 1 + 3*log2(n) + 2 * nlog2(n)
		
		for (int i = 1; i < n; i = i * 2) {
			// 1 + 3n
			for (int j = 0; j < n; j++) {
				System.out.println("test");
			}
		}
	}
	//	斐波那契数1:递归,重复调用：O(2^n)
	public static int test8(int n) {
		if (n <= 1) return n;
		return fib1(n - 1) + fib1(n - 2);
	}
	
//	斐波那契数2：O(n)
	public static int test9(int n) {
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
	// O(n)
	public static void test10(int n) {
		int a = 10;
		int b = 20;
		int c = a + b;
		int[] array = new int[n];
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i] + c);
		}
	}

}
