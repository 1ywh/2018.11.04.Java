import java.util.GregorianCalendar;
import java.util.Scanner;
public class LeapYear{
    public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("输入年份");
		String s=scan.nextLine();
		int year=Integer.parseInt(s);
		
		//方法一，使用逻辑表达式
		if(year%400==0||(year%4==0 && year%100!=0)){
			System.out.println(year+"是闰年");
		}	
		else{
			System.out.println(year+"不是闰年");
		}
		
		//方法二，使用if-elseif语句
		if(year%400==0){			
			System.out.println(year+"是闰年");
		}
		else if(year%4==0&&year%100!=0){
			System.out.println(year+"是闰年");
		}
		else{
			System.out.println(year+"不是闰年");
		}
		
		//方法三，使用if-else语句
		if(year%400==0){
			System.out.println(year+"是闰年");
		}
	    else{
			if(year%100!=0){
		        if(year%4==0){
				   System.out.println(year+"是闰年");
			    }
		        else{
			       System.out.println(year+"不是闰年");
		        }
			}
			else{
			 	 System.out.println(year+"不是闰年");
			}
	    }
       
	   //方法四，使用日期时间型的变量来判断
		boolean leapYear;
		GregorianCalendar gregorianCalendar=new GregorianCalendar();
		leapYear=gregorianCalendar.isLeapYear(year);
		System.out.println(year+"是闰年吗？"+leapYear);
    }
}

