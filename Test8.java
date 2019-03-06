class Person{
private String name ;
private int age ;
public Person(String name, int age) {
this.age = age ;
this.name = name ;
}

public String toString() {
return "姓名："+this.name+",年龄："+this.age ;
}
}

public class Test8 {
public static void main(String[] args) {
fun(new Person("yuisama",25) );
fun("Hello");
}
public static void fun(Object obj) {
System.out.println(obj.toString()); // 默认输出对象调用的就是toString()方法
}
}