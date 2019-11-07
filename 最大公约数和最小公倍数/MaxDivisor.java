
public class MaxDivisor {
	public int fun(int a,int b){
		int m = 0;
		while(b!=0){
			m = a%b;
			a = b;
			b = m;
		}
		return a;
	}
}

class MinMultiple extends MaxDivisor{
	public int fun(int a,int b){
		int m = super.fun(a, b);
		return (a*b)/m;
	}
}

