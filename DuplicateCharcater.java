import java.util.*;
public class DuplicateCharcater {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String str=sc.nextLine();
		char[] ch=str.toCharArray();
		int length=str.length();
		for(int i=0;i<length;i++){
			for(int j=i+1;j<length;j++){
				if(ch[i]==ch[j]){
					System.out.println("Duplicate character is: "+ch[j]);
					break;
				}
			}
		}
		
	}	
}

