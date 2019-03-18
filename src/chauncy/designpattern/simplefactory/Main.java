package chauncy.designpattern.simplefactory;

/**   
 * @classDesc: 功能描述(简单工厂设计模式)  
 * @author: ChauncyWang
 * @createTime: 2019年3月18日 下午3:55:38   
 * @version: 1.0  
 */  
public class Main {
	public static void main(String[] args) {
		/*//传统创建对象的方式
		Audi audi = new Audi();
		Benz benz = new Benz();
		audi.run();
		benz.run();*/
		//使用工厂创建对象的方式
		Car car1 = CarFactory.createCar("奥迪");
		Car car2 = CarFactory.createCar("奔驰");
		car1.run();
		car2.run();
	}
}
