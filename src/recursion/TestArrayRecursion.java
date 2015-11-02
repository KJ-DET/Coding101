package recursion;

public class TestArrayRecursion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] someList = {56,78,23,45,89,90};
		RecursionArray testArray = new RecursionArray(someList );
		
		
		System.out.println("Array length is::" + testArray.computeArrayLength(0));
		System.out.println("Is 45 in the array::" + testArray.isElementInArray(0,45));
		System.out.println("Is 11 in the array::" + testArray.isElementInArray(0,11));
		System.out.println("Array length2 is::" + testArray.getLength());
		
	}

}
