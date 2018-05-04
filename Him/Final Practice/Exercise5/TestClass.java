import java.util.*;
public class TestClass {
	public static void main(String[] args) {
		Car c1 = new Car(180,5,1599,129);
		Car c2 = new Car(220,7,1798,150);
		HotAirBalloon b1 = new HotAirBalloon(80,10,600);
		HotAirBalloon b2 = new HotAirBalloon(100,5,550);
		Vehicle[] vList = {c1,c2,b1,b2};
		// Write your program her
		filerSearch(90,1,vList);
		System.out.println("--------------------");
		filterSearchLoop(90,6,vList);

	}
	public static void filerSearch(int speed, int passenger, Vehicle[] vList){
		Arrays.stream(vList).filter(vehicle -> vehicle.getNumberOfPassengers() >= passenger && vehicle.getMaxSpeed() >= speed)
			.forEach( vehicle -> System.out.println(vehicle.getClass().getSimpleName() + ": "+vehicle));
	}
	public static void filterSearchLoop(int speed, int passenger, Vehicle[] vList){
		for(int i = 0 ; i < vList.length ; i++){
			if(vList[i].getNumberOfPassengers() >= passenger && vList[i].getMaxSpeed() >= speed)
				System.out.println(vList[i].getClass().getSimpleName() + ": "+vList[i]);
		}
	}
}