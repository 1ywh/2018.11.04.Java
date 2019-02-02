//模板设计
public class Made{

      public static void main(String[] args){
		 Coffee coffee=new Coffee();
		 coffee.makeDrink();
		 System.out.println();
 		
		Tea tea=new Tea();
	    tea.makeDrink();
		 System.out.println();
		
		Coffee cof1=new Coffee(false);
		 cof1.makeDrink();
	  }

}
//一个抽象类
abstract class Drink{
	//final，public
	public final void makeDrink(){
		this.boilWater();
 		
		this.waterInputCup();
		
		if(this.isAddMajor())
		  this.addMajor();
		this.addMinor();
		this.clean();
	}
	//普通方法
	public final void boilWater(){
		System.out.println("烧水");
		
	}
	public final void waterInputCup(){
		System.out.println("水倒入杯中");
		
	}
	//抽象方法
	public abstract void addMajor();
	
	public abstract void addMinor();	
	
	//改变流程的方法，不用写抽象，默认是true，子类可以覆写
	public boolean isAddMajor(){

       return true;
	 
	 }
	 public void clean(){
		 
		 
	 }
}
//
class Coffee extends Drink{
	
	private boolean Major=true;
	
	//默认构造方法
	public Coffee(){
		
	}
	//构造方法传一个值
	public Coffee( boolean Major){
		
		this.Major=Major;
	}
	public  void addMajor(){
		
		System.out.println("第三步");
			
	}
	public void addMinor(){
		
		System.out.println("第四步");
		
	}	
	//覆写父类的方法
	public boolean isAddMajor(){
		return this.Major;
		
	}
	
}
class Tea extends Drink{
	public void addMajor(){
		
		System.out.println("3");
				
	}
	public  void addMinor(){
		
		//System.out.println("4");
		
	}
	public void clean(){
		 System.out.println("打扫");
		 
	 }

}