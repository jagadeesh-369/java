//Write a Java Program for Calculator by using Static Method
class Calculator{
	static int add(int a,int b){
		return a+b;
	}
	static int sub(int a ,int b){
		return a-b;
	}
	static int mult(int a ,int b){
		return a*b;
	}
	static double div(double a,double b){
	
			return a/b;
	} 
}
public class CalculatorDemo{
	public static void main(String[] args){
		int a = Calculator.add(10,20);
		int m = Calculator.mult(2,7);
		int s = Calculator.sub(34,23);
		double d = Calculator.div(20,3);
		System.out.println("Add: "+a+"\nMult: "+m+"\nSub: "+s+"\nDiv: "+d);
	}
}
