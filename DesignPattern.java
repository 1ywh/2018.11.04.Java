//工厂模式
import java.util.Scanner;
public class DesignPattern{
	
	public void code1(){
		
		Client client=new Client();
		client.buy(new Mac());
	}	
	
	public void code2(){
	    
		Client client=new Client();
		client.buy(ComputerFactory.getInstance("All"));		
	}
	public void code3(){
	Client client=new Client();
	//通过读取客户端的输入
    Scanner scanner=new Scanner(System.in);
	while(true){
    System.out.println("输入计算机类型");
    String type=scanner.nextLine();
			if(type.equals("q")){
	        break; 
	 		}
			Computer computer=ComputerFactory.getInstance(type);		
			if(computer==null){
				 System.out.println("没有该"+type+"设备");		
			}else{
				client.buy(computer);            
            }
        }
		/*if(args.length>0){
			String type=args[0];
			Computer computer=ComputerFactory.getInstance(type);		
			if(computer==null){
				 System.out.println("没有该"+type+"设备");		
			}else{
				client.buy(computer);
		    }
		}			
		else{
			 System.out.println("请输入计算机类型");		
			}							
     
	}*/
	}
	public static void main(String[] args){
		Client client=new Client();
		if(args.length>0){
			String type=args[0];
			Computer computer=ComputerFactory.getInstance(type);		
			if(computer==null){
				 System.out.println("没有该"+type+"设备");		
			}else{
				client.buy(computer);
		    }
		}			
		else{
			 System.out.println("请输入计算机类型");		
			}							
     
	}
	
}
//简单工厂
class ComputerFactory{
	
	public static Computer getInstance(String type){
	Computer computer=null;
	switch(type){
		case "Mac":
		    computer=new Mac();
			break;
		case "All":
            computer=new All();
			break;	
		default:
		   System.out.println("不支持"+type+"设备");		
		}
    return computer;		
	}	
}
//3、客户端
class Client{
	
	public void buy(Computer computer){
		computer.printComputer();
		
	}
	
}

//1、接口
interface Computer{
	
	void printComputer();
			
	}

//2、接口的实现
class Mac implements Computer {
	public void printComputer(){
		System.out.println("这是一个Mac设备");
	}
	
}
class All implements Computer{
	public void printComputer(){
		System.out.println("这是一个All设备");
	}
	
} 