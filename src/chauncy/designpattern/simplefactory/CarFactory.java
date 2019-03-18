package chauncy.designpattern.simplefactory;

public class CarFactory {
	static public Car createCar(String carType){
		//jdk1.7支持String类型switch
		Car car=null;
		switch (carType) {
		case "奥迪":
			car=new Audi();
			break;
		case "奔驰":
			car=new Benz();
			break;
		default:
			break;
		}
		return car;
	}
}
