Wpackage com.kosta.day08;

public class Vehicle {
	
	int a = 10;
	String no;
	
	public Vehicle(String no) {
		super();
		this.no = no;
		System.out.println("Vehicle created.");
	}

	public void run(){
		System.out.println("Vehicle run.");
	}
}
