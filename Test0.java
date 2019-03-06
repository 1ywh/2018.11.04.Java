interface A{

void print();
}
class B implements A{
public void print(){
System.out.println("b");
}
// public String toString(){
// return "kk";
// }

}
public  class Test0{

public static void main(String[] args){
      A a=new B();
      Object b=a;
	  System.out.println(b);
	  B d=(B)b;
	  System.out.println(d);
	  

}}
