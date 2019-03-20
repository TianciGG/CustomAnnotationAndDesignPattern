package chauncy.designpattern.proxy.staticproxy;

/**   
 * @classDesc: 功能描述(中介)  
 * @author: ChauncyWang
 * @createTime: 2019年3月19日 下午5:21:45   
 * @version: 1.0  
 */  
public class StaticProxy implements House{
	private XiaoMing xiaoMing;

	public StaticProxy(XiaoMing xiaoMing){
		this.xiaoMing=xiaoMing;
	}
	
	@Override
	public void sell() {
		//方法之前，可以应用于日志的打印	
		System.out.println("我是中介，你卖方的操作，我开始监听了！");
		xiaoMing.sell();
		//方法之后，可以应用于日志的打印
		System.out.println("我是中介，你卖方的操作，我结束监听了！");
	}
	
	public static void main(String[] args) {
		StaticProxy proxy = new StaticProxy(new XiaoMing());
		proxy.sell();
	}
	
}
