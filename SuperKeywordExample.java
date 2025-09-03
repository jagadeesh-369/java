class Parent {
    	int num = 100;

    	// Parent class constructor
    	Parent() {
        		System.out.println("Parent class constructor called");
    	}

    	void display() {
 	       	System.out.println("This is Parent class method");
    	}
}

class Child extends Parent {
    	int num = 200;

    	// Child class constructor
    	Child() {
        		// Call to Parent class constructor
        		super();
        		System.out.println("Child class constructor called");
    	}

    	void show() {
        		// Accessing child and parent variables
        		System.out.println("Child num: " + num);
        		System.out.println("Parent num using super: " + super.num);

        		// Calling parent class method
        		super.display();
    	}
}

public class SuperKeywordExample {
    	public static void main(String[] args) {
        		Child obj = new Child(); 	// calls Parent constructor first
        		obj.show();
    	}
}
