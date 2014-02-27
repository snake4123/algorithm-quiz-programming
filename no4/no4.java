
public class no4 {
	static int minus (int a,int b){
		int c = 0;
		b = -b;
		c = a + b;
		return c;
	}
	static int multiply(int a, int b){
		int c = 0;
		for(int i=0;i<b;i++){
			c += a;
		}
		return c;
	}
	static int divide(int a, int b){
		int c = a;
		int count = 0;
		for(;;){
			c = minus(c,b);
			count++;
			if(c<=0) break;
		}
		return count;
	}
	public static void main(String[] args){
		int a = 6;
		int b = 2;
		
	System.out.println(minus(a,b));
	System.out.println(multiply(a,b));
	System.out.println(divide(a,b));
	}	
}
