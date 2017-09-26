import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
	
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char ch [] = new char[1];
		String inStr = "";
		String s,t,r = "";
		
		
		while ((inStr = br.readLine()) != null){
			
			StringTokenizer strToken = new StringTokenizer(inStr, " ");
			
			s = strToken.nextToken();
			t = strToken.nextToken();
			r = "";
					
			if (s.length() > t.length()){
				System.out.println("No");
				continue;
			}
			
			Integer i = 0 , j = 0 ;
			
			
			while(i < s.length()){
				while (j < t.length()){
					
					if(s.charAt(i) == t.charAt(j)){
						ch[0] = t.charAt(j);
						r = r + new String (ch);
						j = j + 1;
						break;
					}
					
					j = j + 1; 	
				}
				i = i + 1;
			}
			
			
			if (s.equals(r))
			System.out.println("Yes");
			else
			System.out.println("No");
			
		}

		
}

}





/*


sequence subsequence
person compression
VERDI vivaVittorioEmanueleReDiItalia
caseDoesMatter CaseDoesMatter


*/

