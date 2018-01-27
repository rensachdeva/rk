package AdvancedJavaTest;

import java.util.Objects;

class StudentTree{
	     
	    private String name;
	    private int marks;
	    private int reg_num;
	//Constructor for ques 2     
	    public StudentTree(String n, int r){
	        this.name = n;
	        this.reg_num = r;
	    }
	    
		//Constructor for ques 3   
	    public StudentTree(String n, int r,int s){
	        this.name = n;
	        this.marks = s;
	        this.reg_num=r;
	    }
	    
	     
	    public String getName() {
	        return name;
	    }
	    public void setName(String name) {
	        this.name = name;
	    }
	    public int getMarks() {
	        return marks;
	    }
	    public void setMarks(int marks) {
	        this.marks = marks;
	    }
	    public void setRegNum(int r){
	    	this.reg_num=r;
	    }
	    public int getRegNum() {
	        return reg_num;
	    }
	    
		 @Override
	    public String toString(){
	        return "Name: "+this.name+"-- marks: "+this.marks+"Reg Number:"+this.reg_num;
	    }
	    	 
		 @Override
		 public int hashCode() 
		 {
		  //returns this.name.hashcode()+this.regno.hashcode();
			 return Objects.hash(this.name,this.reg_num,this.marks);
		 }
		
		 @Override
		 public boolean equals(Object arg0)
		 {	
			  if(arg0 instanceof StudentTree) { 
			    return (((StudentTree)arg0).name.equals(this.name));}
			  return (((StudentTree)arg0).name.equals(this.name));
			   //return false;
		  
		 }
	}
