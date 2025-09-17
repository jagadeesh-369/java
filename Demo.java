import java.util.*;
interface Shape{
	public double periTriangle();
	public double periRectangle();
}
class Perimeter implements Shape{
	double side1,side2,side3,perimeter;
	Perimeter(double s1,double s2,double s3){
		side1=s1;
		side2=s2;
		side3=s3;
	}
	public double periTriangle(){
		perimeter=side1+side2+side3;
		return perimeter;
	}
	public double periRectangle(){
		perimeter=2*(side1+side2);
		return perimeter;
	}
}
class Demo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three sides");
		double s1 = sc.nextDouble();
		double s2 = sc.nextDouble();
		double s3 = sc.nextDouble();
		Perimeter ob = new Perimeter(s1,s2,s3);
		System.out.println("Perimeter of Triangle"+ob.periTriangle());
		System.out.println("Perimeter of rectangle"+ob.periRectangle());
	}
}
