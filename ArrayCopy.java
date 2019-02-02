import java.util.Arrays;
public class ArrayCopy{
   public static void main(String[] args){
	
	//1.二维数组复制
	 int[][] a=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
	 int[][] b=new int[3][3];
	 for(int i=0;i<a.length;i++){
		 b[i]=a[i].clone();		 
	 }
	 int[][] c=a.clone();
	
	//改变c[0][0]的值a[0][0]的值也改变
	 c[0][0]=2;
	 System.out.println(Arrays.deepToString(a));
	 System.out.println(Arrays.deepToString(b));
	 System.out.println(Arrays.deepToString(c));
	
	//2.循环复制   
	 int[] d=new int[]{1,3,5,7,9};
	 int[] e=new int[11];
	 for(int i=0;i<d.length;i++){
	          e[i]=d[i];
	 }
     System.out.println("循环复制"+Arrays.toString(e));
   
    
	//3.数组克隆
     int[] f=new int[]{1,3,5,7,9};
     int[] g=f.clone();
     System.out.println("直接用clone"+Arrays.toString(g));
	
	//4.System.arraycopy(源数组名称，源数组开始点，目标数组名称，目标数组开始点，拷贝长度);
     int[] dataA = new int[]{1,2,3,4} ;
     int[] dataB = new int[]{11,22,33} ;
     System.arraycopy(dataB,0,dataA,2,2) ;//11 22 1 2 3 4 
     System.out.println("System.arraycopy方法"+Arrays.toString(dataA));
	
	//5.Arrays.copyOf(数组名，新长度)
	 int[] result = Arrays.copyOf(dataA,3);
	 System.out.println(Arrays.toString(result));
	 
	//6.Arrays.copyOfRange（数组名，起始索引，结束索引）
     int[] result1 = Arrays.copyOfRange(dataA,0,2);
      System.out.println(Arrays.toString(result1));
    }
}