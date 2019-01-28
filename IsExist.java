public class IsExist{
     public static void main(String[] args){
	    Test test=new Test();
	    test.test();	
    }  
} 
class Test{
	      private byte i=127;
		  private int j=-2147483648;
	void test(){
		if(i+1<i){
			System.out.println("存在i+1<i的数");	
		}
		if(j-1>j){
			System.out.println("存在j-1>j的数");		
		}
	}
} 



