package prime;
public class Primecheck{
	public boolean prime(int n){
		if(n<=1){
			return false;
		}
		for(int i=2;i<=(n-1);i++){
			if(n%i==0){
				return false;
			}
		}
		return true;
	}
}
