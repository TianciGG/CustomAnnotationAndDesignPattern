package chauncy.designpattern.singleton;


/**
 * 
 * @classDesc: 功能描述(保证Singleton这个类只能在jvm中有一个实例)
 * @author: ChauncyWang
 * @createTime: 2019年3月18日 上午11:17:54
 * @version: 1.0
 */
class Singleton {

	// 因为此类不能被实例化所以要变成static,静态的在堆内存中只能修饰一个
	private static Singleton singleton;

	/**
	 * 如果把构造函数私有化，反射也不能初始化
	 */
	private Singleton() {

	}

	/**
	 * @methodDesc: 功能描述(懒汉式：当需要的时候才会被实例化，之后都是一个实例。但是懒汉式线程不安全，可以使用同步锁解决线程不安全的问题，把容易出现线程不安全的代码包裹起来)
	 * @author: ChauncyWang
	 * @param: @return
	 * @createTime: 2019年3月18日 上午11:25:54
	 * @returnType: Singleton
	 */
	static public Singleton getSingleton() {
		if (singleton == null) {
			synchronized(Singleton.class){
				singleton = new Singleton();
			}
		}
		return singleton;
	}
}

/**
 * @classDesc: 功能描述(懒汉式设计模式)
 * @author: ChauncyWang
 * @createTime: 2019年3月18日 上午11:16:33
 * @version: 1.0
 */
public class SingletonIdler {
	public static void main(String[] args) {
		Singleton s1 = Singleton.getSingleton();
		Singleton s2 = Singleton.getSingleton();
		System.out.println(s1 == s2);

	}
}
