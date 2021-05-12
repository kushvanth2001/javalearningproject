/* program is for a sign board at a function hall
 *everyone to be greeted before checking of their invitation
 * if the the invitation is valid , it should give a message about his/her seat name
 * with an message enjoy party
 */
package javalearing;

public class Greeting {
	int seat=1;String invitation;
	Greeting(String invitation){
		this.invitation=invitation;
	}
	public void greet() {
		do {
			System.out.println("Welcome Come to the Party");
			System.out.println("show us your invitation");
			if(invitation=="valid") {
				System.out.println("your seat number is"+seat);
				System.out.println("Enjoy party");
				seat++;
				break;
				 				//used do while to fist greet without condition 
								//after greeting it checks for condition
				}
			else {
				break;
			}
			
		}while(invitation=="valid") ;
			
	}
 public void displaySeatOcc() {
	 System.out.print("number of seats occupied=");
	 for(int i=1;i<=seat;i++) {
		 System.out.print(i+",");
	 }
 }
	
	
public static void main(String[] args) {
		Greeting obj=new Greeting("valid");
		obj.greet();
		obj.displaySeatOcc();
		
	}

}
