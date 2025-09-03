class Parent{
	int num=100;
	
}
class Child extends Parent{
	int num=200;
	
	void display(){
		System.out.println("Parent class num is :  "+ super. num);
		System.out.println("child class num is:  "+num);
	}
}
public class MemberHiding{
	public static void main(String[] args){
		Child c=new Child();
		c.display();
	}
}
