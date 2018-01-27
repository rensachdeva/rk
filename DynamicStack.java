/*IMPLEMENT DYNAMIC SIZED STACK POP(),PUSH(),PEEK() OPEARTIONS */
package AdvancedJavaTest;

public class DynamicStack 
{
	private int stackSize;
    private int[] array;
    private int top;
 
    /**
     * constructor to create stack with size
     * @param size
     */
    public DynamicStack(int size) {
        this.stackSize = size;
        this.array = new int[stackSize];
        this.top = -1;
    }
 
    /**
     * This method adds new item to the top of the stack
     * @param int tem
     * @throws Exception 
     */
    public void push(int item){
        if(this.isFull())
        {
            System.out.println(("Stack is full. Increasing the capacity."));
            increaseStackCapacity();
        }
        System.out.println("Adding: "+item);
        this.array[++top] = item;
    }
 
    /**
     * This method removes an item from the top of the stack.
     * @return
     * @throws Exception 
     */
    public int pop() 
    {
        if(this.isEmpty())
        {
            System.out.println("Stack is empty. Can not remove element.");
        }
        int item = array[top--];
       // int item =array[top];
      //  top--;
        System.out.println("Removed item: "+item);
        return item;
    }
     
    /**
     * This method returns top of the stack without removing it.
     * @return
     */
    public long peek() {
        return array[top];
    }
 
    private void increaseStackCapacity(){
         
        int[] newStack = new int[stackSize*2];
        for(int i=0;i<stackSize;i++)
        {
            newStack[i] = array[i];
        }
        array = newStack;//ask ramesh
        stackSize = stackSize*2;//ask ramesh
    }
     
    /**
     * This method returns true if the stack is 
     * empty
     * @return
     */
    public boolean isEmpty() {
        return (top == -1);
    }
 
    /**
     * This method returns true if the stack is full
     * @return
     */
    public boolean isFull() {
        return (top == stackSize - 1);
    }
 
    public static void main(String[] args) 
    {
        DynamicStack stack = new DynamicStack(2);
        for(int i=1;i<10;i++)
        {
            stack.push(i);
        }
        for(int i=1;i<10;i++){
            try 
            {
                stack.pop();
            } 
            catch (Exception e) 
            {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}