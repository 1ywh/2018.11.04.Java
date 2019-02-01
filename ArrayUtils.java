import java.util.Random;
public class ArrayUtils{

    //1.计算数组中最大值
    public static int arrayMaxElement(int[] data){
        if(data == null){
            //IllegalArgumentException 参数异常
            throw new IllegalArgumentException("data must be not null.");
        }
        int max = Integer.MIN_VALUE;
		int maxIndex=0;
        for(int i=0; i<data.length; i++){
            if(data[i]>max){
                max=data[i];
				maxIndex=i;
            }
        }
        return max;
      }
    
    //2.计算数组中最小值
    public static int arrayMinElement(int [] data){
        if(data == null){
            throw new IllegalArgumentException("data must be not null.");
        }
        int min = Integer.MAX_VALUE;
		int minIndex=0;
        for(int i=0; i<data.length; i++){
            if(data[i]<min){
                min=data[i];
				minIndex=i;
            }
        }
        return min;
    }
        
    //3.计算数组值之和
    public static int arrayElementSum(int [] data){
        if(data == null){
            throw new IllegalArgumentException("data must be not null.");
        }
        int sum = 0;
        for(int i=0; i<data.length; i++){
            sum=sum+data[i];
        }
        return sum;
    }
	
	//4.计算平均值
	public static int arrayElementAverage(int[] data){
		int sum=arrayElementSum(data);
		return sum/data.length;		
	}
    
	//5.数组拼接
    public static int[] arrayJoin(int[] a, int[] b){
        if(a ==null){
            throw new IllegalArgumentException("a must be not null.");
        }
        if(b == null){
            throw new IllegalArgumentException("b must be not null.");
        }             
        int len = a.length+b.length;
        int[] c= new int[len];
        for(int i=0; i<a.length; i++){
            c[i]=a[i];
        }
        for(int i=a.length; i<c.length;i++){
            c[i]=b[i-a.length];
        }
        return c;
    }

    //6.数组截取
    //[start, end)
    public static int[] arraySub(int[] a, int start , int end){
        if(a==null){
           throw new IllegalArgumentException("a must be not null.");
        }
        if(start < 0 || end < 0){
            throw new IllegalArgumentException("start or end  must be > 0.");
        }
        if(end < start){
            throw new IllegalArgumentException("end > start.");
        }
        if(start>=a.length){
            throw new IllegalArgumentException("start must be < a.length .");
        }
        
        int count = end-start;
        if(count>a.length){
            throw new IllegalArgumentException("sub length must be <= a.length .");
        }
        
        int[] b = new int[count];
        for(int i=start; i< end;i++){
            b[i-start]=a[i];
        }
        return b;
    }
	
	//7.数组元素的删除
    public static void deleteNum(int[] a,int x){
		int i=0;
		//找到要删除的元素
		for(i=0;i<a.length;i++){
			if(a[i]==x){
				break;
			}
		}
		//从要删除元素的位置开始，每个元素向前移动
		// for(int j=i;j<a.length-1;j++){
			// a[j]=a[j+1];
		// }
		for(int j=i+1;j<a.length;j++){
			a[j-1]=a[j];
		}
		for(int j=0;j<a.length-1;j++){
			System.out.printf(a[j]+" ");
		}		
	}
	
	//8.已经排好序数组元素的插入
	public static int[] insertNum(int[] a,int x){
		int i=0;
		//N是有序数组a的长度
		int N=a.length-1;
		 for(i=0;i<N;i++ ){
			 if(x<a[i]){
				 break;				 
		    }
		}
		//从最后一个元素开始往后移动，给插入的数据提供位置
	    for(int j=N;j>i;j--){
			a[j]=a[j-1];
		}
	    a[i]=x;
		return a;	
	}
	
	//9.数组元素冒泡排序
	public static int[] bufferSort(int[] a){
		int temp=0;
		for(int i=0;i<a.length-1;i++){
			for(int j=0;j<a.length-1-i;j++){
				if(a[j]>a[j+1]){
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}				
			}			
		}
		return a;				
	}
	
	//10.数组元素选择排序
	public static int[] choiceSort(int[] a){
        int temp=0;		
		for(int j=0;j<a.length-1;j++){
			int minIndex=j;
		     for(int i=j;i<a.length;i++){
			     if(a[i]<a[minIndex]){
				     minIndex=i;		
			     }
		    }	
			temp=a[minIndex];
			a[minIndex]=a[j];
			a[j]=temp;
		}
		return a;
	} 
    
	//11.输出数组中的元素
    public static void printArray(int[] a){
        if(a  == null){
            return;
        }
        // for(int i=0; i< a.length; i++){
             // System.out.print(a[i]+" ");
        // }
		for(int b:a){
			System.out.printf(b+" ");
		}
        System.out.println();
    }
    
    
    public static void main(String[] args){
        
        int[] a = new int[]{1,3,2,5,4};
		int[] b = {2,5,7,8,9,9,7};
		
		//数组a赋值（0~5的随机数）
		// int[] a=new int[5];
		// Random ran=new Random();
		// for(int i=0;i<a.length;i++){
			// a[i]=ran.nextInt(6);			
		// }
		
        int max = arrayMaxElement(a);
        System.out.println(max);//5
        
		int min = arrayMinElement(a);
        System.out.println(min);//1
        
		System.out.println(arrayElementSum(a));//15
		
		System.out.println(arrayElementAverage(a));//3
		
		int[] join = arrayJoin(a,b);
		printArray(join); //1 3 2 5 4 2 5 7 8 9 9 7
		
		int[] sub = arraySub(b,3,6);   
        printArray(sub); //8 9 9   

        printArray(bufferSort(b));//2 5 7 7 8 9 9		
		
		printArray(choiceSort(b));//2 5 7 7 8 9 9	
	
	    printArray(insertNum(b,45));//2 5 7 7 8 9 9 45
       
	    deleteNum(a,2);//1 3 5 4
	}
}