package OOPs;

public class Car {
	String name;
	int price;
	public Car(String name,int price) {
		this.name=name;
		this.price=price;
	}
	public void printAboutCar() {
		System.out.println(name+" "+price);
	}
}