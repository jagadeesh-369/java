import java.util.ArrayList;
public class ArrayInt{
	public static void main(String[] args){
		ArrayList<Integer>num=new ArrayList<>();
			for(int i=1;i<=10;i++){
					num.add(i*1);
			}
			System.out.println("Using ForEach loop");
			for(int numbers:num){
					System.out.println(numbers);
			}
			System.out.println("Using For Loop");
			for(int i=0;i<10;i++){
					System.out.println("num["+i+"]="+num.get(i));
			}
			
	}
}
