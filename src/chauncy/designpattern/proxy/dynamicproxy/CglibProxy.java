package chauncy.designpattern.proxy.dynamicproxy;

import java.lang.reflect.Method;

import chauncy.designpattern.proxy.staticproxy.House;
import chauncy.designpattern.proxy.staticproxy.XiaoMing;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**   
 * @classDesc: 功能描述(cglib动态代理，cglib.jar依赖asm.jar。asm.jar专门用于生成字节码文件，做字节码类库操作)  
 * @author: ChauncyWang
 * @createTime: 2019年3月20日 下午12:44:50   
 * @version: 1.0  
 */  
public class CglibProxy implements MethodInterceptor{

	@Override
	public Object intercept(Object o, Method method, Object[] arr, MethodProxy methodProxy) throws Throwable {
		System.out.println("我是房产中介。。使用cglib动态代理开始监听了！");
		Object invokeSuper = methodProxy.invokeSuper(o, arr);
		System.out.println("我是房产中介。。使用cglib动态代理结束监听了！");
		return invokeSuper;
	}
	
	public static void main(String[] args) {
		CglibProxy cglibProxy = new CglibProxy();
		//cglib动态代理使用asm框架生成代理类
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(XiaoMing.class);
		enhancer.setCallback(cglibProxy);
		House house = (House) enhancer.create();
		house.sell();
	}

}
