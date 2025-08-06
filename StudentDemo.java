//Write a Java Program to show details by placing college as static 
class Student{
	int rollno;
	String name;
	static String college = "VITB";
	Student(int r,String n){
		rollno=r;
		name=n;
	}
	void display(){
		System.out.println("Roll no: "+"   "+rollno+"\nName:  "+name+"   "+"\nCollege:  "+" "+college);
	}
}
public class StudentDemo{
	public static void main(String args[]){
		Student s1=new Student(101,"JAGADEESH");
		Student s2=new Student(102,"MANI");
		s1.display();
		s2.display();
	}
}
