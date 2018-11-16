//交换俩数的值
 class Swap{	 
	 public static  void Swap(int a,int b){
		a=a^b;
		b=b^a;
		a=a^b;
		 System.out.println(a+","+b);		
	 }
	public static void main(String[] args){		
		int a=1,b=2;	
        Swap(a,b);       
	}
 }
 