public class Sort3{
	public static int Serach(int[] arr,int value){
     int a=arr.length;
	
	 int left =0;
	 int right=a-1;
	 //[0,a-1]
	 while(left<=right){
		  int mid=(left+right)/2;
		if(value==arr[mid]){
		 return mid;
	    } else if(value<arr[mid]){
			right=mid-1;
		}else{
			left=mid+1;	
		}
	 } 
     return -1;
	}
}