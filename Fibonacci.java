public class Fibonacci{
    public static void main(String[] args){
     int f1=1,f2=1;
	 for(int i=1;i<=10;i++){
		 System.out.printf("%5d\t%5d\t",f1,f2);
		 if(i%2==0){
			System.out.println(); 
		 }
		 f1=f1+f2;
		 f2=f1+f2;		 
	    }
    }
}
