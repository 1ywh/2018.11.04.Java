import java.util.Scanner;
interface A{
	void print();
}
class B implements A{
	public void print(){
		System.out.println("B");
	}
}
class C implements A{
	public void print(){
		System.out.println("C");
	}
}
class  Factory{
	public static A D(String type){
	A a =null;	
	switch(type){
		case "B": a =new B();
		break;
		case "C":a =new C();
		break;
		default:
		System.out.println("不支持");	
	}
	return a;	
	}
	
}
public class Client{
	//看调用的是哪个类
      public void buy(A a){
		  a.print();
	  }
	  public  static void main(String[] args){
		
	  Client client =new Client();
      Scanner scan=new Scanner(System.in);
	    System.out.println("输入");
	  String type=scan.nextLine();
      A a =Factory.D(type);
	  client.buy(a);
	  }

}
