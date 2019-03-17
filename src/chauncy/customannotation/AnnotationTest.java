package chauncy.customannotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 定义注解使用@interface 
 * --@Target 表示该自定义注解允许使用的范围，如只允许在方法上使用 
 * --@Retention 表示需要在什么级别保存该注释信息，用于描述注解的生命周期（即：被描述的注解在什么范围内有效）
 * @classDesc: 功能描述(自定义注解)
 * @author: ChauncyWang
 * @createTime: 2019年3月17日 下午9:58:49
 * @version: 1.0
 */
@Target(value = ElementType.METHOD)
// 表示 运行级别保留，编译后的class文件中存在，在jvm运行时保留，可以被反射调用。
@Retention(RetentionPolicy.RUNTIME)
public @interface AnnotationTest {
	// 传入的值
	String value() default "";

	int classId() default 0;

	String[] sArr();
}

class AnnotationDemo {
	private String name;

	@AnnotationTest(value = "Chauncy", classId = 123, sArr = { "45", "678" })
	// @AnnotationTest("Chauncy")
	public void add() {

	}
}