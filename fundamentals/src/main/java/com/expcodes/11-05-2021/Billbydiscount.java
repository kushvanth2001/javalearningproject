//class to show discount acording to the coustmer bill using if else ladder
public class Billbydiscount {

   public static void main(String args[]){
	
	int bill=99;
	
	if(bill <100 && bill >= 1) {//if case
	  
	  System.out.println(" your discount is "+bill%5);
	  
	}
	
	else if(bill < 1000 && bill >= 100) {
	  
	  System.out.println("your discount is"+bill%10);
	  
	}
	else if(bill <10000 && bill >=1000) {
	    
	  System.out.println("your dicount is"+bill%15);
	  
	}
	else if(bill <100000 && bill >=10000) {
	    
	  System.out.println("your discount is"+bill%20);			

	}
	else {
	    
	  
	  System.out.println("no dicount for u");			
	
	}
   
       
   }
