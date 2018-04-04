package annotation;

import java.lang.reflect.Method;

public class Test {
		//通过反射获取注解信息
	public static void main(String[] args) throws Exception {
		// 1 获取备注解的Class对象
		Class clazz = Persion.class;
		// 2 根据Class对象获取Method对象
		Method method = clazz.getMethod("fun3");
		// 3 根据Class类对象 Method对象或者是Field
		MyAnnotation annotation = method.getAnnotation(MyAnnotation.class);
		// 4 测试
		System.out.println(annotation);
 	}

}
