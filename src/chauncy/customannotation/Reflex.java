package chauncy.customannotation;

import java.lang.reflect.Field;

/**   
 * @classDesc: 功能描述(使用反射技术获取自定义注解值，实现orm框架的底层原理)  
 * @author: ChauncyWang
 * @createTime: 2019年3月17日 下午11:57:08   
 * @version: 1.0  
 */  
public class Reflex {
	
	public static void main(String[] args) throws ClassNotFoundException {
		// 1.项目使用注解，肯定会使用到反射。反射应用场景 jdbc、springIOC、常用框架、一些注解的底层实现
		Class<?> forName = Class.forName("chauncy.customannotation.UserEntity");
		/*
		 * //getAnnotations()表示该类上用到了哪些注解,只表示类上的 
		 * Annotation[] annotations = forName.getAnnotations(); 
		 * for (Annotation annotation : annotations) {
		 * 	 System.out.println(annotation); 
		 * }
		 */
		Field[] declaredFields = forName.getDeclaredFields();
		StringBuffer sf=new StringBuffer();
		sf.append(" select ");
		/*for (Field field : declaredFields) {
			SetProperty setProperty = field.getAnnotation(SetProperty.class);
			String property = setProperty.name();
			sf.append(property);
		}*/
		for (int i = 0; i < declaredFields.length; i++) {
			SetProperty setProperty = declaredFields[i].getAnnotation(SetProperty.class);
			String property = setProperty.name();
			sf.append(property);
			if(i== declaredFields.length-1){
				sf.append(" from ");
			}else {
				sf.append(" , ");
			}
		}
		// getAnnotation获取某个注解对象
		SetTable setTable = forName.getAnnotation(SetTable.class);
		//表的名称
		String tableName = setTable.value();
		sf.append(" "+ tableName );
		System.out.println(sf.toString());
		//生成orm框架sql语句
		

	}
}
