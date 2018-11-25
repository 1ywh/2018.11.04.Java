public class Str{
	
	// 重复某个字符
	public static String repeat(char c, int count){
	
	if(count<=0){
       
	   return"";		
	}
	else{
	 
	 String s="";
	 
	 for(int i=0;i<count;i++){		 
		 
		 s+=c;
	    }	 	
     return s;
    }
}
    
	//字符填充于字符串前 
	public static String fillBefore(String str,char filledChar, int len){
		
		String s="";	
        	
		for(int i=str.length();i<len;i++){			
			
			s+=filledChar;
		}
		if(str.length()>len){			
			
			return str;
		}else{
			
			return str+s;
		}
		
	}
    //字符填充于字符串后	
	public static String fillAfter(String str,char filledChar, int len){
		
		String s="";	
        	
		for(int i=str.length();i<len;i++){
			
			s+=filledChar;
		}
		if(str.length()>len){
			
			return str;
		}else{
			return s+str;
		}
		
	}
    //移除字符串中所有给定字符串
     public static String removeAll(CharSequence str, char strToRemove) {
       String str3="";
	   for(int i=0;i<str.length();i++){
			if(str.charAt(i)==strToRemove){				
				continue;
			}
			else{
				str3=str3+str.charAt(i);
				
			}			
		}
		return str3;
    }   
	//反转字符串
     public static String reverse(String str) {
        
		String Ae="";
		for(int i=str.length()-1;i>=0;i--){		   
         Ae=Ae+str.charAt(i);		
		}
        return Ae;
    }	
		
	public static void main(String[] args){
		
		System.out.println(fillAfter("abc",'A',6));
		System.out.println(repeat('d',7));
	 	System.out.println(fillBefore("abc",'A',6));
		System.out.println(removeAll("aa-cc-vv-ff",'-'));
		System.out.println(reverse("abcdef"));
	}	
}