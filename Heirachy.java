//java program using hierachy inheritance
class A{
	int num=100;
	A(){	
		System.out.println("A is a constructor");		
	}
}
class B extends A{
	int num=150;
	B(){
		System.out.println("B is a constructor");
		System.out.println("Parent class is :"+ super.num);		
	}
}
class C extends B{
	C(){
		System.out.println("C is a constructor");	
	}
}
public class Heirachy{
	public static void main(String[] args){

		C c =new C();
	}
}
