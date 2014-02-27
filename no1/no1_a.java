import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no1_a {
	public static void main (String[] args) throws IOException{
		int flag = 0;
		System.out.println("入力：");
		
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		String str = br.readLine();
		char[] charArray = str.toCharArray();
		
		System.out.println(charArray.length);
		for(int i=0;i<charArray.length;i++){
			for(int j=i+1;j<charArray.length;j++){
				if(charArray[i]==charArray[j]){
					flag ++;
				}
			}
		}
		if(flag > 0) System.out.println("false");
		else System.out.println("true");
	}
}
