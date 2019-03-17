package chauncy.customannotation;

//一个类可以使用多个注解
@SetTable("user_table")
public class UserEntity {
	@SetProperty(name = "user_name", length = 10)
	private String userName;
	@SetProperty(name = "user_age", length = 8)
	private Integer age;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	
}
