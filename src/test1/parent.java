package test1;

public abstract class parent {
	
int EmpNo=11;
	
	public void Display() {
		System.out.println("Emp No:"+EmpNo);
	}
	
	
	abstract void run();
	abstract void horn();
}