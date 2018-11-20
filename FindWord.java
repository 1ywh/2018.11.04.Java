import java.util.Random;
import java.util.Scanner; 
public class FindWord{
	
	private final int  value;
//随机数    
public FindWord(){
	
	Random random=new Random();
    this.value =random.nextInt(100); 
	
}
//游戏
public void play(){
    
	Scanner scanner=new Scanner(System.in);
    while(true){
	    System.out.println("请输入数字：");
	    int type=scanner.nextInt();	   
    
	//判断你输入的数字大小
	if(type>this.value){
		System.out.println("高了");
	}	 
	 else if(type<this.value){
	 System.out.println("低了");
	 }
	 else {
	 System.out.println("Bingo!");
	 break;
	 }	
   } 
 }
	public static void main(String[] args){
	    //Finder fi=new Finder();
		new FindWord().play();	 
	}
}
 

	
	
	
	

	 

	 
