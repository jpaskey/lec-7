package speedtest;
import java.util.Vector;

import datatypes.SimpleElement;




public class CollectionsSpeedTest {
	
	/** Add numIterations new objects to an array and return the number
	 * of milliseconds taken by the test. 
	 * @param numAdds
	 * @return time in milliseconds
	 */
	public static float timeArrayAdds(int numAdds)
	{
		long startTime, endTime;
		
		startTime = System.nanoTime();
		
		SimpleElement[] list = new SimpleElement[numAdds];
		
		for(int i=0; i < numAdds; i++) {
			SimpleElement e = new SimpleElement(i);
			list[i] = e;
		}
		
		endTime = System.nanoTime();
		
		return (endTime - startTime)/1000000.0f;
	}
	
	/** Add numIterations new objects to a Vector and return the number
	 * of milliseconds taken by the test. 
	 * @param numAdds
	 * @return time in milliseconds
	 */
	public static float timeVectorAdds(int numAdds)
	{
		long startTime, endTime;

		startTime = System.nanoTime();

		Vector<SimpleElement> list = new Vector<SimpleElement>();
		
		for(int i=0; i < numAdds; i++) {
			SimpleElement e = new SimpleElement(i);
			list.add(e);
		}

		endTime = System.nanoTime();
		
		return (endTime - startTime)/1000000.0f;
	}
	
	/** Add numIterations new objects to the FRONT of a Vector and return the number
	 * of milliseconds taken by the test. 
	 * @param numAdds
	 * @return time in milliseconds
	 */
	public static float timeVectorAddsToFront(int numAdds)
	{
		long startTime, endTime;

		startTime = System.nanoTime();
		// TODO
		endTime = System.nanoTime();
		
		return (endTime - startTime)/1000000.0f;
	}
		
	/** Add numIterations new objects to a Linked List and return the number
	 * of milliseconds taken by the test. 
	 * @param numAdds
	 * @return time in milliseconds
	 */
	public static float timeLinkedListAdds(int numAdds)
	{
		long startTime, endTime;

		startTime = System.nanoTime();
		// TODO
		endTime = System.nanoTime();
		
		return (endTime - startTime)/1000000.0f;
	}
	/** Add numIterations new objects to the FRONT of a Linked List and return the number
	 * of milliseconds taken by the test. 
	 * @param numAdds
	 * @return time in milliseconds
	 */
	public static float timeLinkedListAddsToFront(int numAdds)
	{
		long startTime, endTime;

		startTime = System.nanoTime();
		// TODO
		endTime = System.nanoTime();
		
		return (endTime - startTime)/1000000.0f;
	}

	
	
	public static void main(String[] args) {
		
		int numAdds = 500000;
		int numIterations = 50;
		float timer = 0;
		
		for (int i = 0; i < numIterations; i++) {
			timer += timeArrayAdds(numAdds);
		}
		System.out.println("Array : Time to add " + numAdds + " elements: " + timer/numIterations + " ms");
		
		
		timer = 0;
		for (int i = 0; i < numIterations; i++) {
			timer += timeVectorAdds(numAdds);
		}
		System.out.println("Vector: Time to add " + numAdds + " elements: " + timer/numIterations + " ms");
		
		/*
		timer = 0;
		for (int i = 0; i < numIterations; i++) {
			timer += timeLinkedListAdds(numAdds);
		}
		System.out.println("LList : Time to add " + numAdds + " elements: " + timer/numIterations + " ms");
		
		
		
		System.out.println("*** ADDING TO FRONT OF LIST ***");
		numAdds = 50000;
		timer = 0;
		System.out.println("Array: does not support adding to start of list!");
		for (int i = 0; i < numIterations; i++) {
			timer += timeVectorAddsToFront(numAdds);
		}
		System.out.println("Vector: Time to add " + numAdds + " elements: " + timer/numIterations + " ms");
		
		timer = 0;
		for (int i = 0; i < numIterations; i++) {
			timer += timeLinkedListAddsToFront(numAdds);
		}
		System.out.println("LList : Time to add " + numAdds + " elements: " + timer/numIterations + " ms");
		*/
		
	}

}
