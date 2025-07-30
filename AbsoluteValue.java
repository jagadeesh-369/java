import java.util.Scanner;
class AbsoluteValue1{
	
	public double AbsoluteValue(double x){
		if(x<0){
			return -x;
		}
		else{
			return x;
		}
	}
}
public class AbsoluteValue{
	public static void main(String args[]){
		AbsoluteValue1 A=new AbsoluteValue1();
		System.out.println("Enter x value");
		Scanner Sc =new Scanner(System.in);
		double x= Sc.next.Double();
		System.out.println(x);
	}
}
