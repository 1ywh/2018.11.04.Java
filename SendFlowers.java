public class SendFlowers{
    
	public  static void main(String[] args){
	BoyFriend target=new BoyFriend("Man","Girl");
	Courier P=new Courier(target);
	P.sendFlowers();
		
    }
}
//业务接口
interface Sender{
	
	void sendFlowers();
}
//业务类
class BoyFriend implements Sender{
	//他们的姓名
	private String BoyFriendName; 
	private String GirlFriendName;
	
	public BoyFriend(String BoyFriendName,String GirlFriendName){
		this.GirlFriendName=GirlFriendName;
		this.BoyFriendName=BoyFriendName;		
	}	
	public void sendFlowers(){
		System.out.println(this.BoyFriendName+"送花给"+this.GirlFriendName);		
	}	
}
//代理类
class  Courier implements  Sender{
	
	private final Sender target;
	
	//构造方法
	public Courier(Sender target){
		this.target=target;		
	}
	
	public void sendFlowers(){
		System.out.println("快递员打电话给客户");	
		this.target.sendFlowers();
		System.out.println("客户签收");

		
	}
	
}