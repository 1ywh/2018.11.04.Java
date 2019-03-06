// abstract class A{
// public A(){
// this.print();
// }
// public abstract void print();
// }
// class B extends A{
// private int num =100;
// public B(int num){
// //super();
// this.num=num;
// }
// public void print(){
// System.out.println(this.num);}

// }
// public class Test10{
	// public static void main(String[] args){
		// new B(30);//.print();
	// }
// }
// class Person{
	// public void fun(){
		// this.print();
	// }
	// private void print(){
		// System.out.println("1");
	// }
	
	
// }
// class Student extends Person{
	// public void print(){
		
		// System.out.println("2");
	// }
// }
public  class Test10{
	public static void swap (int args1,char[] args2){
		args1=10;
		char[] chars=args2;
		chars[0]='A';
		args2=new char[]{'C','D'};
		for(int i=0;i<args2.length;i++){
		     System.out.println(args2[i]);// C D
	    }
    }
    public static void main(String[] args){
	int a=20;
	char[] ch=new char[]{'a','b'};
	swap(a,ch);
	for(int i=0;i<ch.length;i++){
		System.out.println(ch[i]);//A b
	}
	System.out.println(a);//20
	}
}
