import java.util.Scanner;
public class MultipleDecision{
    public static void main(String[] args){
	 Scanner scan=new Scanner(System.in);
	 System.out.println("输入字符");
	 String s=scan.nextLine();
	 int h=Integer.parseInt(s);//将数字字符串转换为等效的int
	 double d=Double.parseDouble(s);//将数字字符串转换为等效的double
	 System.out.println(h);
	 System.out.println(d);	 
	}
}