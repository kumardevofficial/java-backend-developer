package atm;

public class Customer {

	public static void main(String[] args) {
		Atm atm = new Atm();
		System.out.println(atm.atmId);
		System.out.println(atm.bankName);
		System.out.println(atm.location);
		System.out.println(atm.showCashAvailable());

	}

}
