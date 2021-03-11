
import java.lang.instrument.Instrumentation;

class ObjectSizeFetcher {
	private static Instrumentation instrumentation;
	
	public static void premain(String args, Instrumentation inst) {
		instrumentation = inst;
	}
	
	public static long getObjectSize(Object o) {
		return instrumentation.getObjectSize(o);
	}
}
public class Array {
	
	public static void main(String[] args) {
		
		int array[] = new int[] {11,22,33};
		//打印值
		System.out.println(array[2]);
		//打印地址
		System.out.println(array.toString());
		System.out.println(array);
		//打印存储空间
		System.out.println(ObjectSizeFetcher.getObjectSize(array));
		
	}
}
