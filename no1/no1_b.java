import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no1_b {
	public static void main (String[] args) throws IOException{
		int flag = 0;
		int count = 0;
		System.out.println("s1：");
		System.out.println("s2：");
		
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		String str1 = br.readLine();
		String str2 = br.readLine();
		char[] charArray1 = str1.toCharArray();
		char[] charArray2 = str2.toCharArray();
		
		System.out.println(charArray1.length);
		for(int i=0;i<charArray1.length;i++){
			count = 0;
			for(int j=0;j<charArray2.length;j++){
				if(i==charArray1.length) i = 0;
				if(charArray1[j+i]==charArray2[j]){
					count ++;
				}
				if(count == charArray2.length){
					flag = 1;
					break;
				}
			}
		}
		if(flag == 1) System.out.println("true");
		else System.out.println("false");
	}
}