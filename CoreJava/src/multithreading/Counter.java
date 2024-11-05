package multithreading;

public class Counter {

	int count=0;
	// synchronized keyword used to get accurate answer
	synchronized public void increment()
	{
		this.count++;
	}

}
