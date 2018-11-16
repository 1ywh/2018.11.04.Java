public class Person{
	//属性
	private int age;
	
	private String name;	
	
	//普通方法，行为
	//toString方法
	public String toString(){
		return "我叫"+name+"年龄"+age;		
	}
	
	//默认的方法
	public Person(){
		
	}
	
	//重载构造方法，方法名和类名一样，无返回值
	public Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	
	//getter方法,得到数据
	String getName(){	
	   return name;
	}
	int getAge(){
	   return age;
	}	
	
	//setter方法，可以进行修改
	void setName(String name){
	   this.name=name;	
	}
	void setAge(int age){
	   this.age=age;
	}
	
	public static void main(String[] args){
		//创造一个对象person
		Person person=new Person();		 		
		//对对象的属性进行赋值
		person.name="li";
		person.age=1;
		//toString方法
		System.out.println(person);
		
		//引用传递
		//将person对象引用的地址给了person2
		//它俩指的是同一段内存空间
		Person person2=person;
		person2.age=333;//注意此时堆内存里age的值就改变了
		
		
		Person person1=new Person("Alice",23);//创造对象的时候调用方法
		System.out.println(person);
		System.out.println(person2);		
		System.out.println(person1);
	}	
	
}