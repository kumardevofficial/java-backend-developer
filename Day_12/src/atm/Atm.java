package atm;

public class Atm {
	public String atmId = "SBI001";
	public String location = "Banglore";
	private double cashAvailable = 30000;
	public String bankName = "State bank of india";
	
	public double showCashAvailable()
	{
		return this.cashAvailable;
	}
}
