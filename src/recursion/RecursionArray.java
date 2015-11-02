package recursion;

public class RecursionArray {
	private Integer[] myArray;
	private int arrayLength=0, arrayLength2 = 0;
	
	public RecursionArray(int[] myArray)
	{
		this.myArray = new Integer[myArray.length];
		int i=0;
		for(int element : myArray)
		{
			this.myArray[i++] = element;
		}
	}
	public int computeArrayLength(int index)
	{
		try
		{
			Integer element = myArray[index];
			arrayLength++;
			return computeArrayLength(++index);
		}
		catch( java.lang.ArrayIndexOutOfBoundsException exception)
		{
			return arrayLength;
		}
	}

	public boolean isElementInArray(int index,Integer element)
	{
		try
		{
			if(myArray[index] == element)
			{
				return true;
			}
			else
			{
				return isElementInArray(++index, element);
			}
		}
		catch( java.lang.ArrayIndexOutOfBoundsException exception)
		{
			return false;
		}
	}
	
	void computeLength(int index)
	{
		try
		{
			Integer element = myArray[index];
			arrayLength2++;
			computeLength(++index);
		}
		catch( java.lang.ArrayIndexOutOfBoundsException exception)
		{
			return;
		}
	}
	
	int getLength()
	{
		computeLength(0);
		return arrayLength2;
	}
}
