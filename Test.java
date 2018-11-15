public class Test{
     public static void main(String[] args){
	Outer outer=new Outer();
	System.out.println(outer.age());//18
	System.out.println(outer.name());//liu 
	System.out.println(new B().getName());//liu
	
	//非静态内部类在其他地方使用的时候创建对象的方式
	Outer.InnerA innerA =new Outer().new InnerA();
	System.out.println(innerA .name());//liu
    }
}
//普通类A
class A{
	private String name="liu";
	public String getName(){
		return this.name;		
	} 	
}
//B继承A
class B extends A{
	private int age=18;
	public int getAge(){
		return this.age;			
    }
	public String getName(){
		return super.getName();		
	} 	
//类Outer
class Outer{
    //内部类InnerA并且继承了A	
	class InnerA extends A{
		public String name(){
		return super.getName();//父类	
	    }
	} 	
	class InnerB extends B{
		public int age(){
		return super.getAge();
	    }	
	}
    //成员函数	
	public int age(){
		return new InnerB().age();		
	}
	public String name(){
		return new InnerA().name();	
	} 	
}
	
	
	
