//代理模式，不改变真正业务模式的实现
public class ProxyTest{
	
	public static void main(String[] args){
		RealSubject realSubject=new RealSubject();
		ProxySubject  proxySubject=new ProxySubject(realSubject);
		proxySubject.buyComputer();
	}
	
}
interface Subject{
	
	void buyComputer();
}
//真正业务
class RealSubject implements Subject{
	
	public void buyComputer(){
		System.out.println("购买电脑");	
	}
	
}

//代理类,辅助真正业务类,把目标功能扩展
class ProxySubject implements Subject{
	
	//写成接口类型
	private final Subject target;
	
	public  ProxySubject(Subject target){
	     this.target=target;
	}
	
	public void buyComputer(){
	     System.out.println("生产电脑");
	     this.target.buyComputer();
		 System.out.println("售后服务");
	}
}