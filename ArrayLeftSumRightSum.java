
public class ArrayWalSum {
	public static int ar[]= {7,0,0,0,7};
	public static void main(String args[]) {
		
		int sum=0;
		for(int i:ar) {
			sum+=i;
			
		}
		//System.out.println(sum);
		for(int i=1;i<ar.length;i++) {
			gg(i);
			
		}
		
		
	}
	public static void gg(int leftlimit) {
		int lsum=0;
		int rsum=0;
		for(int i=0;i<leftlimit;i++) {
			lsum+=ar[i];
	
		}
		//System.out.println("lsum"+lsum);
		for(int i=leftlimit+1;i<ar.length;i++) {
			rsum+=ar[i];
		}
		//System.out.println("rsum"+rsum);
		if(lsum==rsum) {
			System.out.println("Index where the sum of left array and right array is equal:"+leftlimit);
		}
		
		
	}
}
