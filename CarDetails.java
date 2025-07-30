//Write a Java Program to show car details
class Car{
	String Name;
	public Car(){
		Name="My Car";
	}
	public Car(int a ,int b){
		Name="My Second Car";
	}
}
public class CarDetails{
	public static void main(String args[]){
		Car c1 = new Car();
		System.out.println(c1.Name);
		Car c2 = new Car(2,3);
		System.out.println(c2.Name);		
	}
}

