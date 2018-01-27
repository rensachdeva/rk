/*Question 9a.*/
package AdvancedJavaTest;
//rkrkrkrrk
public class DeadLockThread {
	 
	    String str1 = "I";
	    String str2 = " am ";
	    String str3=" Locked ";
	     
	    Thread trd1 = new Thread("My Thread 1"){
	        public void run()
	        {
	            while(true)
	            {
	                synchronized(str1)
	                {
	                    synchronized(str2)
	                    {
	                    	synchronized(str3)
	                    	{
	                    		System.out.println(str1 + str2+str3+"1");
	                    	}
	                    }
	                }
	            }
	        }
	    };
	     
	    Thread trd2 = new Thread("My Thread 2"){
	        public void run()
	        {
	            while(true)
	            {	            	
	            	synchronized(str1)
	                {
	                    synchronized(str2)
	                    {
	                    	synchronized(str3)
	                    	{                  	
	                    		System.out.println(str2 + str1+str3+"2");
	                    	}
	                    }
	                }
	            }
	        }
	    };
	    
	    Thread trd3 = new Thread("My Thread 3"){
	        public void run()
	        {
	            while(true)
	            {	            	
	            	synchronized(str1)
	                {
	                    synchronized(str2)
	                    {
	                    	synchronized(str3)
		                    {
	                    		System.out.println(str2 + str1+str3+"3");
		                    }
	                    }
	                }
	            }
	        }
	    };
	     
	    public static void main(String a[]){
	    	DeadLockThread mdl = new DeadLockThread();
	        mdl.trd1.start();
	        mdl.trd2.start();
	        mdl.trd3.start();

	    }
	}
