package abstraction;

abstract class BuisnessDetails
{
	abstract void coupons();
}

class WeekDays extends BuisnessDetails
{
	void coupons()
	{
		System.out.println("Weekdays 20% off");
	}
}

class WeekEnd extends BuisnessDetails
{
	void coupons()
	{
		System.out.println("Weekend Fun");
	}
}

public class BuisnessLogic {
	
	public static void main(String[] args) {
		
		new WeekDays().coupons();
		new WeekEnd().coupons();
		
	}

}
