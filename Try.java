package AdvancedJavaTest;

public class Try {
	
	private int size=2;
	private int[] arr=new int[size];

	public Try(int size) {
		this.size = size;
		this.arr=new int[size];
		
	}
		public int getSize() {
		return size;
	}

		public void setSize(int size) {
		this.size = size;
	}


		public void incSize()
		{
			int[] arr2=new int[4];
			arr2[0]=arr[0];
			arr2[1]=arr[1];
			arr2[2]=9;
			arr2[3]=15;

			arr=arr2;
			for(int i=0;i<arr2.length;i++)
			{
				System.out.println(arr[i]);
			}
			
		}

	public static void main(String[] args) 
	{
		/*trying to change the array by assigning a new array*/
		Try t=new Try(2);
		t.arr[0]=1;
		t.arr[1]=2;
		t.incSize();
	
	}

}
