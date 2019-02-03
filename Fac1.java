import java.util.Scanner;
public class Fac{
	public static double test(int sum){
		 if(sum<=1){
			 return 1;	 
		 }
		 else{
			 return test(sum-1)* sum;	 		 
		 }
}
   public static void main(String[]args){
     
	System.out.println(test(60));
   }	 

 
}