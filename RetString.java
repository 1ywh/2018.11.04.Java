public class RetString{
	   	
    public static String fillAfter(String str,char filledChar, int len){
		char[]ch=new char[len];
		if(str>=len){
		   return str;
		}
		else{		
		for(int i=0;i<=len-str;i++){
			
			ch[i]=filledChar;
		   }
		
		String str1=new String(ch);
	    String str3=str+str1;
		return str3;			
		}
	}	
	public static void main(String[] args){
		
		System.out.println(fillAfter("ll",'o',9));
		
	 	
	}
}


