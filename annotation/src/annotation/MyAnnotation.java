package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//通过@Target注解修饰注解MyAnnotation，指定MyAnnotation只能修饰方法，以及成员变量
@Target({ ElementType.METHOD, ElementType.FIELD })
// 通过Retention注解修饰MyAnnotation，执行MyAnnotation的生命周期在运行时，信息也可以获取
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
	// 定义注解的属性

	String name();

	String job();

	String addr();

}
