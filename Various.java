//多态
 public class Various{
	 
	 public static void main(String[] args){
		
		//子类对象，向上转型 能力变弱，变成父类能力，编译时看的是左边看的是new后的类
		Father father=new Son();
		System.out.println(father.getFatherInof());
		//System.out.println(father.getSonInof()); 
		//error.
		//因为该方法没有被覆写，不在father里面
		
		father.print();//子类，该方法被覆写，调用的是子类方法
		
		//父类对象，向下转型，
		//Son son=(Son)new Father();//编译通过，运行不行CCE
		
		//类型转换有俩个阶段，编译阶段，运行阶段
		//编译时候不进行初始化，只是来判断，运行的时候看new后的类型
		
		Son son=(Son)father;
		System.out.println(father instanceof Son);//结果是true的话就可以运行
		
		System.out.println(son.getFatherInof());
		System.out.println(son.getSonInof()); 
		System.out.println(father.getFatherInof());
		//System.out.println(father.getSonInof()); 
		
		//对象  instanceof 类名，这个转换
	    System.out.println(son instanceof Father);
		
		Father father1=new Son();
		if(father1 instanceof Son){
		
		   Son son1=(Son)father1;
	    }else{
			System.out.println("Father 对象不能转为Son对象");
		}
		
		
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
		//属于父类自己的方法
    }   
	public String getFatherInof(){
		
		return "father gets";
	}

}
class Son extends Father{
	//覆写了父类成员方法
	public void print(){
       // super.print();		
		System.out.println("Son的print方法");	
    }
    public String getSonInof(){
		
		return "son gets";
	}
}	
