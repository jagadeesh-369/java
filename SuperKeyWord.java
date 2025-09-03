//java program using superkeyword
class Parent{
	int num=100;
	Parent(){
		System.out.println("Parent class is excetued");
	}
	void display(){
		System.out.println("This is Parent class");	
	}
}
class Child extends Parent{
	int num=200;
	Child(){
		super();
		System.out.println("Child Class is excetued");
	}
	void show(){
		System.out.println("parent class is "+ super.num);
		System.out.println("child class is "+ num);
		super.display();
	}
}
public class SuperKeyWord{
	public static void main(String[] args){
		Child c= new Child();
		c.show();
	}
}
