public class Fibonaccii{

     public static void main(String[] args){

         int[] a=new int[20];
		 a[0]=1;
		 a[1]=1;
		 for(int i=2;i<20;i++){
			 a[i]=a[i-1]+a[i-2];
		 }
		 for(int i=0;i<20;i++){
			 if(i%5==0){
				 System.out.println();
			 }
			 System.out.printf("%d\t",a[i]);			 
		 }
     }
}