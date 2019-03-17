package chauncy.builtinannotations;

import java.util.ArrayList;
import java.util.Date;

/**
 * 任何类的父类是object类
 * @classDesc: 功能描述(JDK一些内置注解的使用)
 * @author: ChauncyWang
 * @createTime: 2019年3月17日 上午12:09:53
 * @version: 1.0
 */
public class UserEntity extends Object {
	// object类下面有哪些方法
	// @Override 标识子类重写父类,如果变更注解标识的方法名而父类没有，则会报错，这就体现了@Override注解的校验功能
	@Override
	public String toString() {
		return super.toString();
	}

	// 加上@Deprecated注解就把这个方法声明成过时的了
	@Deprecated
	static public void add() {

	}

	@SuppressWarnings("all")
	public static void main(String[] args) {
		// parse方法里的@Deprecated注解，表示过时的
		new Date().parse("");

		// @SuppressWarnings阻止警告，参数可以使用数组，也可以使用all表示忽略所有警告
		@SuppressWarnings({ "rawtypes", "unused" })
		ArrayList arrayList = new ArrayList();
	}
}
