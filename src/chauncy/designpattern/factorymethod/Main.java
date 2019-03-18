package chauncy.designpattern.factorymethod;

/**
 * @classDesc: 功能描述(工厂方法设计模式)
 * @author: ChauncyWang
 * @createTime: 2019年3月18日 下午4:02:20
 * @version: 1.0
 */
public class Main {
	public static void main(String[] args) {
		Car audi = AudiFactory.create();
		Car benz = BenzFactory.create();
		audi.run();
		benz.run();
	}
}
