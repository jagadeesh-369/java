//Write a Java Program for Finding the area and perimeter of the rectangle by using constructor Overloading
public class Rectangle{
	double length;
	double breadth;
	public Rectangle(){
		this.length=0.0;
		this.breadth=0.0;
	}
	public Rectangle(double length,double breadth){
		this.length=length;
		this.breadth=breadth;
	}
	public double getArea(){
		return length*breadth ;
	}
	public double getPerimeter(){
		return 2*(length + breadth);
	}
}
public class RectangleDemo{
	public static void main(String args[]){
		Rectangle r1= new Rectangle();
		System.out.println("Rectangle Details : "+"Area"+ r1.getArea()+ "Perimeter"+ r1.getPerimeter());
		Rectangle r2=new Rectangle(10,15);
		System.out.println("Rectangle Details : "+"Area"+ r2.getArea()+ "Perimeter"+ r2.getPerimeter());
		
	}
}

