package abstraction;

public class ExampleBankDetails {

	public static void main(String[] args) {
		
		Bank sb = new BOI();
		sb.details();
		sb.methodBank();
		Bank.staticMethod(); // Syntax : interface_name.method_name
		
		Bank axis = new Bank() {
			public void details()
			{
				System.out.println("Axis Bank");
			}
			
			public void address()
			{
				System.out.println("Address of axis bank");
			}
			
		};
		
		axis.details();
		axis.address();
			

	}

}
