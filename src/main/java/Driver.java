public class Driver {

	public static void main(String[] args) {
		
		Counter counter = new Counter();
		
		System.out.println("Result Count:" + counter.getCount());
		
		counter.increment();
		
		System.out.println("Result Count:" + counter.getCount());
		
		counter.decrement();
		
		System.out.println("Result Count:" + counter.getCount());
		
	}

}
