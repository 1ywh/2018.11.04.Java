public class Fruit1{	
	
	public static void main(String[] args){
		Fruit1 fruit=new Fruit1(2,34,"huang");
		System.out.println(fruit);
		Fruit1.face();
		   
    }
	//类属性---静态属性
	//此时变为共享
    private static String color="yy";
   
    private int size;
    private int prize;
	
	//构造方法
	public Fruit1(){		
	  
	}
	public Fruit1(int size){		
	  this.size=size;
	}
    public Fruit1(int size,int prize){	  
	  this(size);
	  this.prize=prize;
	  }
	public Fruit1(int size,int prize,String color){
      this(size,prize);
	  this.color=color;
    }
	 int getSize(){
		return size;
	}
	//1.未覆写该方法的话输出对象为地址
	public String toString(){
		return size+","+prize+","+Fruit1.color;
		
	}
	//2.普通方法，这俩种都可以
	 void fruitinof(){
		System.out.println(this.size+","+this.prize+","+Fruit1.color);
		 	
   }
	public static void face(){
		Fruit1 fruit1=new Fruit1(2,5,"y");
		System.out.println( "水果的属性");
		System.out.println(fruit1);
		fruit1.fruitinof();
	}
	
 }
  
  
  
  