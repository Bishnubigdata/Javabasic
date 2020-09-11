package classwork.oops.abstraction;

public abstract class AbstractPayemntParent {
	
	
	public abstract void processPayment();
	public abstract void sendmail();
	
	public void myWalletProcess() {
		System.out.println(" approved");
	}
	

}
