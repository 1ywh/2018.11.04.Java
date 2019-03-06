 
 public class Boday{
 
 public static void main (String[] args){
	 
	 Object o=3;
	
	 int value=(int)o;
	 System.out.println(value);
	
	//装箱
	 Integer i=new Integer(3);
	 int value1=i.intValue();//return 3
	 System.out.println(value1);
	 
	 Integer k=8;
	  System.out.println(++k*5);
	 Integer a=999;
	 Integer b=999;
	 System.out.println(a==b);//true
	
	Integer j=Integer.valueOf(127);
	Integer n=Integer.valueOf(127);
	 System.out.println(j==n);//true
	 
	 
	 
 }
 
 
 }