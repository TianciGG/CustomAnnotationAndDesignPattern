package chauncy.designpattern.factorymethod;

public class AudiFactory {
	static public Car create(){
		return new Audi();
	}
}
