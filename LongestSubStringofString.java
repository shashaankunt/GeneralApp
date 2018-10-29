import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class LongestSub {

	
	public static void main(String args[]) {
		
		Scanner scan=new Scanner(System.in);
		String abc=scan.nextLine();
		Set<Character> hs=new TreeSet<Character>();
		
		int count=0;
	List<Integer> al=new ArrayList<Integer>(); 
		
char ar[]=abc.toCharArray();
		for(char a:ar) {
			
			if(hs.add(a))
			{
				count++;
				al.add(count);
				
			}
			else {
				count=0;
				hs.clear();
				hs.add(a);
				count++;
				al.add(count);
				
			}
			Collections.sort(al);
		
			
		
		
		}
		System.out.println(al.get(al.size()-1));
		
		//System.out.println(count);
	

			
			
			
	//	}
		
	}
	
}
