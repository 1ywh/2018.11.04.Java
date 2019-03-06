public class Test7{
public static void main(String[] args){
// String str1 = "Hello" ;
// String str = new String("Hello") ;
// System.out.println(str1.equals(str));
// System.out.println("Hello".equals(str));

//该字符串常量并没有保存在对象池之中
// String str1 = new String("hello") ;
// String str2 = "hello" ;
// String str3 = "hello" ;
// System.out.println(str1 == str2); // false
// System.out.println(str3 == str2); // true

// String str4 = new String("hello").intern() ;
// String str5 = "hello" ;
// System.out.println(str4 == str5); // true
 
 
// String str1 = "hello" ;
// String str2 = "Hello" ;
// //计大小写比较
// System.out.println(str1.equals(str2)); // false
// //不计大小写比较
// System.out.println(str1.equalsIgnoreCase(str2)); //true
// //比较俩个字符串大小关系，大于返回整数、小于返回负数、相等返回0
// System.out.println("a".compareTo("A")); //32

// String a="helloword";
// System.out.println(a.contains("l"));//true
// //(从指定位置判断)查找字符串位置
// System.out.println(a.indexOf("l"));//2
// System.out.println(a.indexOf("l",3));//3
// //(从指定位置判断)由后向前查找字符串位置
// System.out.println(a.lastIndexOf("l",2));//2
// System.out.println(a.lastIndexOf("l"));//3
// //(从指定位置判断)是否以指定字符串开头
// System.out.println(a.startsWith("l0",2));//true
// System.out.println(a.startsWith("l"));//false
// //是否以指定字符串结尾

// System.out.println(a.endsWith("r"));//false
// //替换全部
// System.out.println(a.replaceAll("l","_"));//he__oword
// //替换首个
// System.out.println(a.replaceFirst("l","_"));//he_loword

// String b="hello java !";
// //全部拆分
// String[] c=b.split(" ");
// for(String d:c){
	// System.out.println(d);
// }
// //部分拆分,2为数组长度
// String[] e=b.split(" ",2);
// for(String f:e){
	// System.out.println(f);
// }

// String str = "yuisama:27|yui:25" ;
// String[] result = str.split("\\|") ;
// for (int i = 0; i < result.length; i++) {
// String[] temp = result[i].split(":") ;
// System.out.println(temp[0]+" = "+temp[1]);
// }
// String str = "192.168.1.1" ;
// String[] result = str.split("\\.") ;
// for(String s: result) {
// System.out.println(s);
// }

 // String b="hello java !";
 // //从指定位置开始截取
 // System.out.println(b.substring(6));//java !
 // //从指定位置开始截取部分内容
 // System.out.println(b.substring(6,10));//java
 // System.out.println("hello".isEmpty());
// System.out.println("".isEmpty());
// System.out.println(new String().isEmpty());

// System.out.println(fistUpper("yuisama"));
// System.out.println(fistUpper(""));
// System.out.println(fistUpper("a"));
// }
// public static String fistUpper(String str) {
// if ("".equals(str)||str==null) {
// return str ;
// }
// if (str.length()>1) {
// return str.substring(0, 1).toUpperCase()+str.substring(1) ;
// }
// return str.toUpperCase() ;

// StringBuffer sb = new StringBuffer();
// sb.append("Hello").append("World");
// System.out.println(sb);//HelloWorld
// StringBuffer a=new StringBuffer("helloword!");
// System.out.println(a.reverse());//!drowolleh
// System.out.println(a.reverse());//helloword!
// System.out.println(a.delete(5,9));//hello!
// System.out.println(a.insert(5,"java"));//hellojava!
b(new Person(12,"li"));
}
public static void b(Object obj){
	System.out.println(obj.toString());
 }
}
class Person{
	private String name;
	private int age;
	public Person(int age,String name){
		this.name=name;
		this.age=age;
	}
	public String toString(){
		return this.name+this.age;
	}	
}




