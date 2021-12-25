package week3.day1;

public class Assignment3_AxisBank extends Assignment3_BankInfo{
	
	public void deposit() {
		System.out.println("This is AxisBank's deposit account");
	}

	public static void main(String[] args) {
		
		Assignment3_BankInfo bank = new Assignment3_AxisBank();
		bank.saving();
		bank.deposit();

	}

}
