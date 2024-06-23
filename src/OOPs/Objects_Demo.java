package OOPs;

public class Objects_Demo {
class A{
	String name="VA";
	void print(String name) {
		System.out.println(name);
	}
}
	public static void main(String[] args) {
		Car mustang = new Car();
		System.out.println(mustang.name+ " "+mustang.price);
		mustang.name = "VA's Car";
		mustang.price = 800000;
		System.out.println(mustang.name+ " "+mustang.price);
		Car auto = new Car();
		auto.name = "Auto rickshaw";
		auto.price = 5000;
		System.out.println(auto.name+" "+auto.price);
	}

}
