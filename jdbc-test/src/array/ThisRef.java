package array;

import java.util.ArrayList;
import java.util.List;

public class ThisRef {
	 private int rollnum;
	 private String name;
	 private String email;
	 
	 ThisRef(){
		rollnum=0;
		name="";
		email="";
			  
		  }
	 public ThisRef(int rollnum,String name,String email) {
		 this.rollnum=rollnum;
		 this.name=name;
		 this.email=email;
		 
	 }
	  
	  public int getRollnum() {
		return rollnum;
	}

	public void setRollnum(int rollnum) {
		this.rollnum = rollnum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	 
    
	public String toString() {
	return "ThisRef [rollnum=" + rollnum + ", name=" + name + ", email=" + email + "]";
	}
	public static void main(String[] args) {
	ThisRef t1=new ThisRef(20,"sachin","s@gamil.com");
	ThisRef t2=new ThisRef(90,"Dac","s@gamil.com");
	List<ThisRef> list = new ArrayList<>();
	list.add(t1);
	list.add(t2);
	System.out.println(list);
}

	
		
	}
