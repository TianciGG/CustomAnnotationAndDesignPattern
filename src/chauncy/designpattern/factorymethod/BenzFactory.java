package chauncy.designpattern.factorymethod;

public class BenzFactory {
	static public Car create(){
		return new Benz();
	}
}
