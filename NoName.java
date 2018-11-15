//匿名内部类
public class NoName{
	public static  void main(String[] args){
		new Outer().display(20);
		
		
	}	
}
interface MyInterface{
	
	void test();//做声明
	
}
class Outer{
	private int num=9;
	//final int value 调用以后不再修改
	
	public void display(int value){
	    
		//匿名内部类实现了一个接口
		new  MyInterface(){		
		  
		  public void test(){
			   System.out.println(num++);
			   System.out.println(value);
		}		
	}.test();
  }	  
}
