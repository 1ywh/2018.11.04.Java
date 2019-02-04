//程序简单属性、构造方法、普通方法、定义对象来实现结果
public class Fruit{
	

	//属性
    private String color;
    private int size;
    private int prize;
	
	//构造方法
	public Fruit(int size){		
	  this.size=size;
	}
    public Fruit(int size,int prize){	  
	  this(size);
	  this.prize=prize;
	}
	public Fruit(int size,int prize,String color){
      this(size,prize);
	  this.color=color;
	}
			
	//普通方法
	 String fruitinof(){
		
		return "大小: "+size+" 价格："+prize+" 颜色："+color;
		
	}	
	void face(){
		
		System.out.println( "水果的属性");
		System.out.println(this.fruitinof());	
		System.out.println(this);//this 指向的是该Fruit类的成员
	}
	
	public static void main(String[] args){
		Fruit fruit=new Fruit(7);
		new Fruit(2,34,"huang").face();
		new Fruit(2,34).face();
		//匿名对象
		System.out.println(new Fruit(7));
  }
  
}
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
