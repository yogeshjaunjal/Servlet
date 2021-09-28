package com.nt.interfaace;

abstract public class carnivourous implements zoo {	
	

}

abstract class herbivourous implements zoo{
	
}

abstract class aquatic implements zoo{
	
}
class lion extends carnivourous{
	@Override
	public void run() {
		System.out.println("lion run 130 km/h speed");
	};
	@Override
	public void eat() {
		System.out.println("lion eat meat");
		
	}
}
class zebra extends herbivourous{
	@Override
	public void run() {
		
		System.out.println("zebra run 40  km/h speed");

	}
	@Override
	public void eat() {
		System.out.println("zebra  eat tree leaf");
	
	}
}
class dolphins extends aquatic{
	@Override
	public void run() {
		
	}
	@Override
	public void eat() {
		
	}
}