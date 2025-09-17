import operations.Shape;
public class Perimeter implements Shape{
	public double periRectangle(){
		double perimeter=2*(side1+side2);
		return perimeter;
	}
}
class Example2{
	public static void main(String[] args){
		Perimeter ob = new Perimeter();
		System.out.println(ob.periRectangle());
	}
}
