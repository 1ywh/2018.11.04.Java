//模板设计模式
abstract class Made{
	 public final void drink(){
		 this.a();
		 this.b();
		 if(e())
		 this.c();
		 this.d();	 
	 }
	public void a(){
		System.out.println("1");
	}
	public void b(){
		System.out.println("2");
	}
	public abstract void c();
	public abstract void d();
	public boolean e(){
		return true;
	}
	
}
class Tea extends Made{
	public void c(){
		System.out.println("3");
	}
	public void d(){
		System.out.println("4");
	}
}
class Coll extends Made{
	public void c(){
		System.out.println("2");
	}
	
	public void d(){
		System.out.println("2");
	}
	public boolean e(){
		String answer=getA();
		if(answer.equals("y")){
			return true;
		}else{
			return false;
		}
	}
	private String getA(){
		//String
		Scanner scan=new Scanner(System.in);
		System.out.println("shuru ");
		String answer=scan.nextLine();
	    return answer;
	}
}
public class platformDesigner{
public static void main(String[] args){
	// Made tea=new Tea();
	// tea.drink();
	 
	Coll c=new Coll();
	c.drink();
	
	
	
}
	
}

