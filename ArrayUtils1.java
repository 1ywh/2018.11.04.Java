public class ArrayUtils1{
	
	//1.打印二维数组
     public static void display(int[][] data){
	 //打印二维数组的时候一层一层来看foreach
		 for(int[] a: data){
			 for(int b: a){
				 System.out.printf("%3d",b);
			 }
			 System.out.println();		
		 }	
      System.out.println();		
	 }
	
	//2.打印上三角矩阵
	public static  void arrayUp(int[][] a){
	 for(int i=0;i<a.length;i++){
	     for(int k=0;k<i;k++)
		    System.out.printf("\t");
	     for(int j=i;j<a[0].length;j++){
		System.out.printf("%d\t",a[i][j]);
	    }
		System.out.println();
	  }	
	  System.out.println();
	}	  
	
	//3.打印下三角矩阵
	public static void arrayLower(int[][] a){
		for(int i=0;i<a.length;i++){
			for(int j=0;j<i+1;j++){
				System.out.printf("%d\t",a[i][j]);
			}
			System.out.println();
		}	
    System.out.println();		
	} 
	 public static void main(String[] args){
		 int[][] a={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
   	      System.out.println("原始数组");
		  display(a);
		  System.out.println("下三角矩阵");
		  arrayLower(a);
		  System.out.println("上三角矩阵");
	      arrayUp(a);
	}
}