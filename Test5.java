//import java.util.Arrays;
//import java.util.Scanner;
// public class S{
	// public static double test(int sum){
		 // if(sum<=1){
			 // return 1;	 
		 // }
		 // else{
			 // return test(sum-1)* sum;	 		 
		 // }
// }
   // public static void main(String[]args){
     // // Scanner scan=new Scanner(System.in);
     // // char a=scan.nextLine().charAt(0);
     // // System.out.println(a);
	// System.out.println(test(60));
	// for(int i=1;i<10;i++){
		// for(int j=1;j<i;j++){
			// System.out.printf("%d\t",i*j);
		// }
		// System.out.println();
	// }
	// class Person{

// public Person(){
// System.out.println("2.Person类的构造方法");
// }
// { //定义在类中，不加任何修饰符，构造块
// System.out.println("1.Person类的构造块");
// }
// }
// public class S{
// public static void main(String[] args) {
// new Person();
// new Person();

// public class S{
	// { //定义在类中，不加任何修饰符，构造块
          // System.out.println("1.Person类的构造块");
// }
// public S(){
// System.out.println("2.Person类的构造方法");
// }
// static { //定义在非主类中的静态块
// System.out.println("3.Person类的静态块");
// }
// public static void main(String[] args) {
// System.out.println("--start--");
// new S();
// new S();
// System.out.println("--end--");
// }
// }
public calss Test5{
	 public static void main(String[] args) {
         System.out.println("---start---");
         new HelloB();
         new HelloA();
         System.out.println("---end---");
      }
}

class HelloA {
    //构造方法
     public HelloA(){
         System.out.println("Hello A!父类构造方法");
     }
    //非静态代码块
    {
     System.out.println("i'm A class.父类非静态代码块");
    }
     //静态代码块
    static{
         System.out.println("static A 父类静态代码块");
        }
     }
 class HelloB extends HelloA {
     //构造方法
     public HelloB(){
        System.out.println("Hello B! 构造方法");
     }
     //非静态代码块
     {
         System.out.println("i'm B class.非静态代码块");
     }
     //静态代码块
     static{
         System.out.println("static B 静态代码块");
         }
    
    }


	// public class S{
		// byte b1=1,b2=2,b3,b6,b8;
         // final byte b4=4,b5=6,b7=9;
        // public void test() {
// // b3=(b1+b2); /*语句1*/
// // b6=b4+b5; /*语句2*/
// // b8=(b1+b4); /*语句3*/
// // b7=(b2+b5); /*语句4*/
// System.out.println(b1+b4);
// }
		// public static void main(String[] args){
			
// new S().test();

			
		// class Person{
// public void print(){
// System.out.println("1.我是爸爸！");
// }
// }
// class Student extends Person{
// public void print(){
// System.out.println("2.我是儿子！");
// }
// public void fun(){
// System.out.println("只有儿子有！");
// }
// }

// public class Test{
// public static void main(String[] args) {
// Person per = new Student();
// per.print();
// //这个时候父类能够调用的方法只能是本类定义好的方法
// //所以并没有Student类中的fun()方法，那么只能够进行向下转型处理
// Student stu = (Student) per;
// stu.fun();
// }
// } 
	
	
	
	
	
	
	
      // for (int temp : result) {
         // System.out.println(temp);
         // }
		 // Arrays.sort(a,1,3);
		 // for (int temp : a) {
         // System.out.println(temp);
         // }
    
	
    
    
// printArray(dataA) ;
// }
// public static void printArray(int[] temp) {
// for (int i = 0 ; i<temp.length ; i++) {
// System.out.println(temp[i]) ;
// }
// System.out.println() ;
// }
	


// class Test{
	// public int a;
// }
	   // for(String s:args)
		   // System.out.println(s);
	// java.util.Random rnd=new java.util.Random();
	// rnd.setSeed(443);
	// System.out.println(rnd.nextInt());
	 // System.out.println(11+1l);
	 // Test t=new Test();
	 // System.out.println(t.a);
	 // byte data = (byte)300;
	 // System.out.println(data);//44
	 // System.out.println(1.1*1.1);//1.2100000000000002
	 // int num=9;
	 // char num1='9';
	 // System.out.println(num);//9
	 // System.out.println(num1);//9
	 // System.out.println(num1+num);//66
	 // int maxValue = Integer.MAX_VALUE;
     // int minValue = Integer.MIN_VALUE;
     // System.out.println(maxValue);//2147483647
     // System.out.println(minValue);//-2147483648
	 // System.out.println(maxValue+1);//-2147483648
	 // System.out.println(minValue+1);//2147483647
	 // long num3 = maxValue+1l;//用long来解决数据溢出问题
     // System.out.println(num3);//2147483648
	 // double n=2.3;
	 // System.out.println(n*2);
	 // int numA = 10 ;
// int numB = 4 ;
// // int/int型还是int型
// System.out.println(numA/numB) ;
// // 如果要想准确计算，必须将其中一个变量变为double类型
// System.out.println(numA/(double) numB) ;
//char a='A';
// int a='A';
// char num=(char)a;
// System.out.println(num);
// char b='号';
// System.out.println(b);
       // char ch='\101';
// int x = 3;
// int y = 4;
// int result = x++ * y;
// System.out.println(x);
// System.out.println(result);	 
// char a2 = '哈';
// int num2 = 10;
// System.out.println(a2>num2);  
// if(10/0==0){
// System.out.println("条件满足");}
// if(1<2||(10==0)){
// System.out.println("条件满足");
// 
    
    //声明并动态初始化数组（同时创建）
    // int[] a=new int[3];
	// a[0]=1;
	// a[1]=2;
	// a[2]=3;
	// //声明并静态初始化数组（同时创建）
	// int[] b=new int[]{1,2,3};
	// for(int c: a){
		// System.out.printf(c+" ");  
	// }
	// //false初始化时不能指定个数
	 // int[] d=new int[3]{1,2,3};
    
	// //false只能在声明时直接初始化
     // a={1,2,3};
	 // int[] data = new int[] {1,2,3,4,5} ;
	 // data[1]=4;
// printArray(data) ; // 其效果等价于 int[] temp = data ;
// }
// public static void printArray(int[] temp) {
// for (int i = 0 ; i<temp.length ; i++) {
// System.out.println(temp[i]) ;
// }
   
    
  // }
// }
// class Person{
// public Person(){
// System.out.println("**Person类对象产生**");
// }
// }
// class Student extends Person{
// public Student(){
// super() ; //此语句在无参时写于不写一样
// System.out.println("**Student类对象产生**");
// }
// }
// public class Test5{
// public static void main(String[] args) {
// new Student();
// }
// }abstract class Person{
// private String name ; // 属性
// public String getName(){ // 普通方法
// return this.name;
// }
// public void setName(String name){
// this.name = name ;
// }
// {}为方法体，所有抽象方法上不包含方法体
// abstract class Person{
// private String name ; // 属性
// public String getName(){ // 普通方法
// return this.name;
// }
// public void setName(String name){
// this.name = name ;
// }
// public abstract void getPersonInfo() ; //抽象方法
// public static Person getInstance() { //取得A类对象
// class Student extends Person{ //定义抽象类的子类 （内部类）
// public void getPersonInfo(){
// System.out.println("I am a student");
// }

// }
// return new Student();
// }
// }
 // public class Test5{
 // public static void main(String[] args) {
// // Person per = Person.getInstance();
// // per.getPersonInfo() ; //被子类所覆写的方法
// Integer a=9;Integer b=9;System.out.println(a==b);
 // }
 // }
// class Person{
// public void (`){}
	
// }
// abstract class A{
	// private String name;
	// private int age;
	// public String toString(){
		// return name+age;
	// }
	// public int getAge(int age){
		// return age;
	// }
	// public String getName(String name){
		// return name;
	// }
	// abstract public void print();	
// }
// class B extends A{
	// public void print(){
		// System.out.println("你呢");
	// }
	
	
// }
// public class Test5{
	// public static void main(String[] args){
		// A a=new B();
		// a.toString();
	// }
	
	
// }
// abstract class Made{
	 // public final void drink(){
		 // this.a();
		 // this.b();
		 // if(e())
		 // this.c();
		 // this.d();	 
	 // }
	// public void a(){
		// System.out.println("1");
	// }
	// public void b(){
		// System.out.println("2");
	// }
	// public abstract void c();
	// public abstract void d();
	// public boolean e(){
		// return true;
	// }
	
// }
// class Tea extends Made{
	// public void c(){
		// System.out.println("3");
	// }
	// public void d(){
		// System.out.println("4");
	// }
// }
// class Coll extends Made{
	// public void c(){
		// System.out.println("2");
	// }
	
	// public void d(){
		// System.out.println("2");
	// }
	// public boolean e(){
		// String answer=getA();
		// if(answer.equals("y")){
			// return true;
		// }else{
			// return false;
		// }
	// }
	// private String getA(){
		// //String
		// Scanner scan=new Scanner(System.in);
		// System.out.println("shuru ");
		// String answer=scan.nextLine();
	    // return answer;
	// }
// }
// public class Test5{
// public static void main(String[] args){
	// // Made tea=new Tea();
	// // tea.drink();
	 
	// Coll c=new Coll();
	// c.drink();
// Integer num1 = new Integer(10) ;
// Integer num2 = new Integer(10) ;
// System.out.println(num1 == num2);//false 
// System.out.println(num1 == new Integer(10));//false 
// System.out.println(num1.equals(new Integer(10)));//true
	// String str = String.valueOf(100) ;
// System.out.println(str);
// String a="12";
// double o=Double.parseDouble(a);
	// System.out.println(o);
// }
	
// }

