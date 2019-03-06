public class Test11{
	 //主方法抛出异常
	 // public static void main(String[] args) throws Exception{
		 // System.out.println(calculate(10,0));
	 // }
    // public static void main(String[] args) {
         // try {
              // System.out.println(calculate(10, 0));
         // } catch (Exception e) {
              // e.printStackTrace();
         // }
    // }
     // public static int calculate(int x,int y) throws Exception {
         // return x/y ;
     // }
	 // public static void main(String[] args){
// try {
// throw new Exception("抛个异常玩玩") ;
// } catch (Exception e) {
// e.printStackTrace();
// }
// }s


public static void main(String[] args) throws Exception{
int num1 = 20 ;
int num2 = 30 ;
if (num1+num2==50) {
throw new AddException("错误的相加操作") ;
}
}



}
class AddException extends Exception {
public AddException(String msg) {
super(msg) ;
}
}