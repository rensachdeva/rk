package AdvancedJavaTest;

public class DynamicStackImp 
{
	private int stackSize;
	private int top;
	private int[] array;
	
	
	public DynamicStackImp(int size)
	{
		this.stackSize=size;
		this.top=-1;
		this.array=new int[3];
		
	}
	public boolean isFull()
	{
		return top==stackSize;
	}
	public boolean isEmpty()
	{
		return top==-1;
	}
	public int peek()
	{
		return array[top];
	}
	public void push(int item)
	{
		if(isFull())
		{
			array[++top]=item;
		}
		else
		{
			System.out.println("Array is full");
		}
	}
	public int pop()
	{
		if(isEmpty())
		{
			System.out.println("Array is Empty");
		}

		 int itemPopped=array[top--];
		 return itemPopped;
}
	public void incCapacity()
	{
		int[] array2=new int[2*stackSize];
		for(int i=0;i<array.length;i++)
		{
			array2[i]=array[i];
		}
		System.out.println("Increasing sixe");
		array=array2;
		this.stackSize=2*stackSize;
		
		
		
		
		
	}
	
	public static void main(String[] args)
	{
		DynamicStackImp imp=new DynamicStackImp(3);
		imp.push(12);
		imp.peek();
		imp.push(14);
		imp.push(16);

		
	}
	

}

