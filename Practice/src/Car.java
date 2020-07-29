
public class Car implements Vehicle {

	public static void main(String[] args) {
		System.out.println(Vehicle.a);
		Car c=new Car();
		c.speed();

	}

	@Override
	public void speed() {
		System.out.println("speed of car is 80-100");
	}

}
