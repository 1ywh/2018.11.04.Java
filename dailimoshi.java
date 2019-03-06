//代理模式
interface A{
void buy();
}
//真的业务
class B implements A{
	public void buy(){
		System.out.println("2");
	}
}
//代理
class C implements A{
	private  A t;
	
	public C(A t){
		this.t=t;
	}
	public void o(){
		System.out.println("1");
	}
	public void d(){
		System.out.println("3");
	}
	public void buy(){
		this.o();
		this.t.buy();
		this.d();
	}
}
// class F{
	// public  static  C y(){
		// return  new C(new B());
	// }
// }
public class dailimoshi{
	
	public static void main(String[] args){
		new C(new B()).buy();
		//F.y().buy();
	}
}