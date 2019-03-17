package chauncy.customannotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @classDesc: 功能描述(表的别名)
 * @author: ChauncyWang
 * @createTime: 2019年3月17日 下午10:59:13
 * @version: 1.0
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface SetTable {
	String value();

}

/*@SetTable("user_table")
class UserEntity {
	@SetProperty(name = "user_name", length = 10)
	private String userName;
	private Integer age;
}*/