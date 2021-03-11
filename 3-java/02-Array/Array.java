
public class Array {
	
	private static class ObjectA{
		String string;
		int i1;
		byte b1;
		ObjectB objectB;
	}
	private static class ObjectB{
		
	}
	private final static Unsafe UNSAFE;
	// 只能通过反射获取Unsafe对象的实例
	static {
		try {
			UNSAFE = (Unsafe) Unsafe.class.getDeclaredField("theUnsafe").get(null);
		} catch (Exception e) {
			throw new Error();
		}
	}
	
	
	public static void main(String[] args) {
		
		int array[] = new int[] {11,22,33};
		//打印值
		System.out.println(array[2]);
		//打印地址
		System.out.println(array.toString());
		System.out.println(array);
		//打印存储空间
		//		System.out.println(ObjectSizeFetcher.getObjectSize(array));
		Field[] fields = ObjectA.class.getDeclaredFields();
		for (Field field : fields) {
			　　System.out.println(field.getName() + "---offSet:" + UNSAFE.objectFieldOffset(field));
		};
		
	}
}
