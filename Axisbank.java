package week4;

public class Axisbank extends bankinfo {
public void deposit() {
	System.out.println("override deposit");
	
}
public static void main(String[] args) {
	Axisbank bnk=new Axisbank();
	bnk.saving();
	bnk.deposit();
	bnk.fixed();
	
	
}



}
