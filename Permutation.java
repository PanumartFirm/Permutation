import java.util.Scanner;

public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner kb= new Scanner (System.in);
     System.out.print("input String for Permutations :");
     String str = kb.next();
     Switch(str);
		
	}
	private static void Switch(String str){
		Switch("",str);
	}public static void Switch(String prefix,String str){
		int N = str.length();
		if(N ==0){
			System.out.println(prefix);
		}else {
			for(int i = 0;i<N;i++){
				//System.out.println(str.substring(0, i)+str.substring(i+1,N) );
				Switch(prefix+str.charAt(i),
				str.substring(0, i)+str.substring(i+1,N) );

			}
		}
		
	}

	
}
