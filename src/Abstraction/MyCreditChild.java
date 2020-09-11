package classwork.oops.abstraction;

public class MyCreditChild extends AbstractPayemntParent{



	@Override
	public void processPayment() {
		System.out.println("Payment approved");		
	}

	@Override
	public void sendmail() {
		System.out.println("sent mail");
		
	}
	
	public static void main(String[] args) {
		MyCreditChild obj = new MyCreditChild();
		obj.processPayment();
		obj.sendmail();
		obj.myWalletProcess();
	}

}
