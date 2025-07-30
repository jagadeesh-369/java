//Write a Java Program to show the Student Details
class Student{
	String FirstName;
	String LastName;
	String RegdNo;
	int Marks;
	void setFirstName(String f){
		FirstName=f;
	}
	void setLastName(String l){
		LastName=l;
	}
	void setRegdNo(String r){
		RegdNo=r;
	}
	void setMarks(int m){
		Marks=m;
	}
	void getFirstName(){
		System.out.println("First Name : "+FirstName);
	}
	void getLastName(){
		System.out.println("Last Name : "+LastName );
	}
	void getRegdNo(){
		System.out.println("Regd no:"+RegdNo);
	}
	void getMarks(){
		System.out.println("Marks :"+Marks);
	}
	void getFullName(){
		System.out.println("Full Name : "+FirstName+" "+LastName);
	}
}
public class StudentDemo{
	public static void main(String args[]){
		Student s =new Student();
		s.setFirstName("HARI");
		s.setLastName("KUMAR");
		s.setRegdNo("24PA1A05M0");
		s.setMarks(90);
		s.getFirstName();
		s.getLastName();
		s.getRegdNo();
		s.getMarks();
		s.getFullName();
	}
	
}
