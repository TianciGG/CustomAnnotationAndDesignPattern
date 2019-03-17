package chauncy.customannotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @classDesc: 功能描述(属性注解)
 * @author: ChauncyWang
 * @createTime: 2019年3月17日 下午11:03:23
 * @version: 1.0
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface SetProperty {
	String name();

	int length();
}
