package chauncy.designpattern.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import chauncy.designpattern.proxy.staticproxy.House;
import chauncy.designpattern.proxy.staticproxy.XiaoMing;

/**   
 * @classDesc: 功能描述(jdk动态代理)  
 * @author: ChauncyWang
 * @createTime: 2019年3月19日 下午5:36:41   
 * @version: 1.0  
 */  
public class JdkProxy implements InvocationHandler{
	public Object target;
	
	public JdkProxy(Object target){
		this.target=target;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("我是房产中介。。使用jdk动态代理开始监听了！");
		Object invoke = method.invoke(target, args);
		System.out.println("我是房产中介。。使用jdk动态代理结束监听了！");
		return invoke;	
	}
	
	public static void main(String[] args) {
		XiaoMing xiaoMing = new XiaoMing();
		JdkProxy jdkProxy = new JdkProxy(xiaoMing);
		//jdk动态代理通过反射机制生成代理类
		House house = (House) Proxy.newProxyInstance(xiaoMing.getClass().getClassLoader(), xiaoMing.getClass().getInterfaces(), jdkProxy);
		house.sell();
	}
	
}
