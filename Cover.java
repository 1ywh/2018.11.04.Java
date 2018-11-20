//覆写
public class Cover{
		public static void main(String[] args){
		//父类的
		Father father=new Father();
		father.print();
		
		//子类的
		Son son=new Son();
		son.print();
		
		//B,就近原则
		System.out.println(son.getName());
		
		//运行时看new的那个类，此时和左边无关
		Father father1=new Son();
		father1.print();
	}
}
class Father{
	
	public String name="A";
	//父类成员函数
	public void print(){		
		System.out.println("Father的print方法");
	}
	
	public void hello(){		
		System.out.println("Father的hello方法");
}}
class Son extends Father{
	
	private String name="B";
	//覆写了父类成员方法
	public void print(){
        super.print();		
		System.out.println("Son的print方法");	
    }
	//子类方法
    public void hello(){
        super.hello();				
		System.out.println("Son的hello方法");
    }
    public String getName(){
	return name;
	}	
}