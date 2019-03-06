public class Student{
     //属性
	 private int age;
	 private String name;
	 private int high;
	 //构造方法
	 public Student(){
		 System.out.println("无参构造");	 
	 }
	// this调用构造方法的语句必须在构造方法首行
	
	public Student(String name){
		 this();//调用本类无参构造
		 this.name=name;
	 } 
	 public Student(int age,String name){
		this(name);//调用本类有参构造
		this.age=age;		
	}
	public Student(String name,int age,int high){
	    this(age,name);
		this.high=high;
		this.display();//调用this的普通方法
		
	}
	//普通方法
	public void display(){
		System.out.println("**************");
	}
	
	
	//setter
	public void setName(String name){
		 this.name=name;
	}
	public void setAge(int age){
		 this.age=age;
	}
	public void setHigh(int high){
		 this.high=high;
	}
	//getter
	public int getAge(){
		 return age;
	}
	public String getName(){
		 return name;
	}
	public int getHigh(){
		 return high;
	}
	//toString,如果不覆写该方法输出的是类名加地址
	public String toString(){
		 return name+" "+age+" "+high;
	}
	
	
	
	
	public static void main(String[] args){
		Student stu1=new Student();
		Student stu2=new Student("stu2");
		Student stu3=new Student(20,"stu3");
		Student stu4=new Student("stu4",20,160);
		Student stu5=new Student();
		P u=new  P();
	   // 无参构造
       // 无参构造
       // 无参构造
       // 无参构造
       // **************
       // 无参构造
       // null 0 0
       // stu2 0 0
       // stu3 20 0
       // stu4 20 160
       // null 0 0
		System.out.println(stu1);
		System.out.println(stu2);
		System.out.println(stu3);
		System.out.println(stu4);
		System.out.println(stu5);
		System.out.println(u);
		u.print();
	}
}
class P{
	public void print(){
        System.out.println(this);
    }
}
