
public class fibonacci {

	public static int Fibo (int x){
		if(x < 2){
			return x;
		}
		else{
			x = x - 1;
			x = Fibo(x) + Fibo(x-1);
			return x;
		}
	}
	
}
