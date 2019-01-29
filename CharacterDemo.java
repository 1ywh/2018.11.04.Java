//判断该字符是不是字母字符（大写还是小写）、数字、其他字符
import java.util.*;
public class CharacterDemo{
    public static void main(String[] args){
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("请输入字符");
		
		String c=scanner.nextLine();	
		
		char ch= c.charAt(0);
		
		if(Character.isLetter(ch)){
			if(Character.isUpperCase(ch)){				
				System.out.println("字符"+ch+"是大写字母");
			}
			else {
				System.out.println("字符"+ch+"是小写字母");
			}
		}
		else if(Character.isDigit(ch)){
			System.out.println("字符"+ch+"是数字");
		}
		else {
		System.out.println("字符"+ch+"是其他字符");
		}
	}
}