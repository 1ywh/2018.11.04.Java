public class CarPark{
    
	public static void main(String[] args){
    Parking parking=new Parking();
	/*
	parking.park(new Bus());
	parking.park(new Bike());
	parking.park(new Motor());
	*/
	
	//对象数组
	Car[]car=new Car[]{
		new Bus(),new Bike(),new Motor()		
	};
	for(int i=0;i<car.length;i++)
		parking.park(car[i]);
	
	
    }
}
class Parking{
	//
	private static final int standardLength=50;
	
	private static final int standardWidth=70;
	
	public void park(Car car){
	    if(car.Length()<=standardLength&&car.Width()<=standardWidth)
			System.out.println("yes  "+car);
		else{
			System.out.println("no   "+car);
		}
		
   }
}
interface Car{
	
	//车的长度
	int Length();
	//宽度
	int Width();
	
	}
class Bus implements Car{
	 
	public int Length(){
		returnp 30;
		
	}
	public int Width(){
		return 40;
		
	}
	//public String toString(){
		
		//return"Bus="+this.Length()+",Length="+this.Width();
	//}	
}
class Motor implements	Car{
	public int Length(){
     
	   return 50;
		
	}
	public int Width(){
		return 60;
		
	}
	public String toString(){
		
		return"Motor="+this.Length()+",Length="+this.Width();
	}
}
class Bike implements Car{
	public int Length(){
		return 70;
		
	}
	public int Width(){
		return 80;
	}
	public String toString(){
		
		return"Bike="+this.Length()+",Length="+this.Width();
	}
}
