//9*9乘法表
public class Multi{
public static void main(String[] args){
	int row;
	int col;
	int sum =0;
	for(row=1;row<=9;row++){
		for(col=1;col<=row;col++){
			sum=row*col;
		    System.out.print(col+"*"+row+"="+sum+"\t");
		}
		System.out.println();
		}
	}

}
