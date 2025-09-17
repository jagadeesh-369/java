import prime.Primecheck;
public class calculate_prime{
	public static void main(String[] args){
		Primecheck pc = new Primecheck();
		int[] numbers ={2,4,3,5,7,68};
		System.out.println("Prime numbers are");
		for(int num:numbers){
			if(pc.prime(num)){
				System.out.println(num);
			}
		}
	}
}
