// //饿汉式：
// //特点:外部无法产生新的实例化对象，只能通过static方法取得实例化对象
// class Singleton{
    // // 在类的内部可以访问私有结构，所以可以在类的内部产生实例化对象  
	
	// private final static Singleton singleton=new Singleton();
	
	// //私有构造方法
	// private Singleton(){
		
	// }
	// public static Singleton getInstance(){
		// return singleton;
	// }
     // public void print(){
	  // System.out.println("hello");
    // }
// }
// public class SingletonTest{
	// public static void main(String[] args){
		// //声明对象
		// Singleton singleton=null;
		// singleton=Singleton.getInstance();
		// singleton.print();
	// }
// }

// //懒汉式单例模式
// //特点：当第一次去使用Singleton对象的时候才会为其产生实例化对象的操作
// class Singleton{
    // // 在类的内部可以访问私有结构，所以可以在类的内部产生实例化对象  
	
	// private static Singleton singleton;
	
	// //私有构造方法
	// private Singleton(){
		
	// }
	// public static Singleton getInstance(){
		// if(singleton==null){//表示此时未实例化
			// singleton=new Singleton();
		// }	
		// return singleton;
	// }
     // public void print(){
	  // System.out.println("hello");
    // }
// }
// public class SingletonTest{
	// public static void main(String[] args){
		// //声明对象
		// Singleton singleton=null;
		// singleton=Singleton.getInstance();
		// singleton.print();
	// }
// }
// //性别多例
// class  Sex{
	// private String title;
	// public static final int M=1;
	// public static final int F=2;
	// private static final Sex MALE=new Sex("男");
	// private static final Sex FEMALE=new Sex("女");
	// private Sex(String title){
		// this.title=title;
	// }
     // public static Sex getInstance(int flag){
		 // switch(flag){
			 // case M: 
			      // return MALE;
			 // case F: 
			      // return FEMALE;
			 // default:
			      // return null;	
		 // }
	// }
	// public String toString(){
		// return this.title;
	// }	
// }
// public class SingletonTest{
	// public static void main(String[] args){
		// Sex sex=Sex.getInstance(Sex.M);
		// System.out.println(sex);
	// }	
// }
