class Person{
public String info = "爸爸！";

}
class Student4 extends Person{
public String info = "儿子！" ;
public void print(){
//不找本类中的属性
System.out.println(super.info);
System.out.println(this.info);
}
}
public class Test4{
public static void main(String[] args) {
new Student4().print();
}
}