//最大值
public class Sort1{
	public static void bubbleSort(int[] arr){
         int a=arr.length;
         int temp=0;
		 int max=0;
              for(int j=0;j<a;j++){
                 if(arr[j]>max){
                     max=arr[j];
         }
        }
		 System.out.println(max);
       }
	public static void main(String []args){
		int []arr={-3,33,95,65,111};
        bubbleSort(arr);
	}
}
