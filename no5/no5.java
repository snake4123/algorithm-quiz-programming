import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no5 {
	public static void main (String[] args)throws IOException{
		int num[] = new int[100];
		for (int i=0;i<100;i++) num[i] = 0;
		int i = 0;
		int j,k,l;
		int tmp = 0;
		int m = 0;
		int n = 0;
		int flag1 = 0;
		int flag2 = 0;
		String str;
		System.out.print("入力(終了する場合は-1を入力)：");
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		
		for(;;){
			str = br.readLine();
			num[i] = Integer.parseInt(str);
			if(num[i]<0) break;
			
			i++;
			
		}
		System.out.println("ソート前");
		for(l=0;l<i;l++){
			System.out.print(num[l]);
			if(l==i-1){
			}
			else System.out.print(",");
		}
		for(j=0;j<i;j++){
			for(k=j+1;k<i;k++){
				if(num[j]>num[k]){
					tmp = num[j];
					num[j] = num[k];
					num[k] = tmp;
					flag1 = 1;
				}
			}
			if(flag1==1&&flag2==0){
				m=j;
				n = m;
				flag2 = 1;
			}
			if(flag1==1){
				n++;
				flag1 = 0;
			}
		}
		System.out.println();
		System.out.println("ソート後");
		for(l=0;l<i;l++){
			System.out.print(num[l]);
			if(l==i-1){
			}
			else System.out.print(",");
		}
		System.out.println();
		System.out.println("出力：m="+m+",n="+n);
		
	}
}
