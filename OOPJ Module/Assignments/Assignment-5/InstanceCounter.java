package Assignment;

public class InstanceCounter {
	static int count = 0;
	
	public InstanceCounter() {
		count++;
	}
	
	public static int getInstanceCount() {
		return count;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceCounter obj1 = new InstanceCounter();
		InstanceCounter obj2 = new InstanceCounter();
		InstanceCounter obj3 = new InstanceCounter();
		InstanceCounter obj4 = new InstanceCounter();
		
		System.out.println("Number of instances created are: "+InstanceCounter.getInstanceCount());		
	}

}
