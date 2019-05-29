	public class test6{
		static int u=6;
		static {
			u=u+9;
		}
	public static void main(String[] args){
		System.out.println(u);
	}
		static{
			u=u/3;
		}
	}