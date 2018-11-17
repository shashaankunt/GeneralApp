public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		String a = "";
        int[] oc=new int[26];
        for(char c:a.toCharArray())
        {
            oc[c-'a']++;
            
        }
        
        for(int i=0;i<26;i++){
            System.out.println("array:"+oc[i]);
        }
        char cha='a';
        int best=0;
        
        for(int j=0;j<26;j++){
            System.out.println(oc[j]);
                        System.out.println("--------BEST----"+best);
            if(oc[j]>best){
                cha=(char)((int)'a'+j);
                System.out.println("cha"+cha);
                best=oc[j];
                System.out.println("best"+best);                
            }
            if(oc[j]==best){
                continue;
            }
        }
        System.out.println(cha);
	}
}
