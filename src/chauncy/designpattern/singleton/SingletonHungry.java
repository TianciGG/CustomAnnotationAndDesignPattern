package chauncy.designpattern.singleton;

//饿汉式是当class文件被加载的时候，就会被初始化执行，天生线程安全。
class Singletonn{
	private static final Singletonn singletonn=new Singletonn();
	
	private Singletonn(){
		
	}
	
	static public Singletonn getSingletonn() {
		return singletonn;
	}
}

/**   
 * @classDesc: 功能描述(饿汉式设计模式)  
 * @author: ChauncyWang
 * @createTime: 2019年3月18日 下午12:48:57   
 * @version: 1.0  
 */  
public class SingletonHungry {
	public static void main(String[] args) {
		Singletonn s1 = Singletonn.getSingletonn();
		Singletonn s2 = Singletonn.getSingletonn();
		System.out.println(s1==s2);
	}
}
