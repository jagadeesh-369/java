import operations.Shape;
public class Perimeter1 implements Shape{
	public double periRectangle(){
		double perimeter=2*(side1+side2);
		return perimeter;
	}
}
class Perimeter{
	public static void main(String[] args){
		Perimeter1 ob = new Perimeter1();
		System.out.println(ob.periRectangle());
	}
}
