import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no3 {
	public static void main (String[] args) throws IOException{
		int flag = 0;
		System.out.print("n=");
		
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		String str = br.readLine();
		int n = Integer.parseInt(str);
		
		int left[][] = new int[n][n];
		int right[][]= new int[n][n];
		
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				left[i][j] = 0;
				right[i][j] = 0;
			}
			
		}
		//2次元配列を作成
		//括弧の数はnを超えず，配列
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(n-j-i<0) 
				left[i][j] = n-ｊ-i;
				right[i][j] = n-ｊ-i;
				
			}
			
		}
		
	}
}
