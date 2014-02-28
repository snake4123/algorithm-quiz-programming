import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no4 {
	static int minus (int a,int b){
		int c = 0;
		b = ~b + 1;//ビット反転によりマイナスを実現
		c = a + b;
		return c;
	}
	//かけるものの回数だけ足せば答えになる
	static int multiply(int a, int b){
		int c = 0;
		int tmp = 0;
		if(b<0){
			tmp = a;
			a = b;
			b = tmp;
		}
		if(a<0&&b<0){
			a = Math.abs(a);
			b = Math.abs(b);
		}
		for(int i=0;i<b;i++){
			c += a;
		}
		return c;
	}
	/*引いた回数が答えになる,ただし求められるのは商のみ*/
	static int divide(int a, int b){
		int c = a;
		int count = 0;
		if (b == 0){
			b = 100;
			count = 999;
		}
		if(a<0&&b<0){
			a = Math.abs(a);		//両方がマイナスならば，答えはプラスになるようにする
			b = Math.abs(b);
			c = a;
			for(;;){
				c = minus(c,b);
				count++;
				if(c<=0) break;
			}
		}
		else if(a>0&&b>0){
			for(;;){
				c = minus(c,b);
				count++;
				if(c<=0) break;
			}
		}
		if(a<0){
			a = Math.abs(a);		//片方がマイナスならば，答えはマイナスになるようにする
			c = a;
			for(;;){
				c = minus(c,b);
				if(c<=0){
					count = -count;
					break;
				}
				count++;
			}
		}
		if(b<0){
			b = Math.abs(b);		//片方がマイナスならば，答えはマイナスになるようにする
			for(;;){
				c = minus(c,b);
				if(c<=0){
					count = -count;
					break;
				}
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		System.out.print("a=");
		String str = br.readLine();
		int a = Integer.parseInt(str);
		System.out.print("b=");
		str = br.readLine();
		int b = Integer.parseInt(str);
		
		System.out.println("減算："+minus(a,b));
		System.out.println("乗算："+multiply(a,b));
		if(Math.abs(divide(a,b))>=999){
			System.out.println("除算：0で割れません"); 
		}
		else System.out.println("除算："+divide(a,b)); 
	}	
}
