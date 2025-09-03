//java program using ArrayLists
import java.util.ArrayList;
public class ArraysListDemo{
	public static void main(String[] args){
		ArrayList<String> fruits = new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Mango");
		fruits.add("Orange");
		System.out.println("Fruits  List is :  "+ fruits);
		System.out.println("First fruit is : "+fruits.get(0));
		fruits.set(1,"Grapes");
		System.out.println("After Update :"+ fruits);
		fruits.remove("Mango");
		System.out.println("After removing mango"+fruits);
		System.out.println("Size of an array List"+fruits.size());
		for (int i  = 0; i < fruits.size() ; i++){
			System.out.println("fruit["+i+"]="+fruits.get(i));
		}
		for(String fruit : fruits){
				System.out.println(fruit);
		}	
	}
}
