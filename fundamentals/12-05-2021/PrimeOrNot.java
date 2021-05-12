package javalearing;

public class PrimeOrNot {
	int num=10, i=1,count=0;
	PrimeOrNot(int num){
	 this.num=num;
	}
	public void check() {
		while(num>i) {
			if(num%i==0)
				count++;
			
		   i++;
		}
		if(count==2) 
			System.out.print(num+"is a prime");
		else
			System.out.print("it is not a prime number");
		}

	public static void main(String[] args) {
		PrimeOrNot obj= new PrimeOrNot(8);
		obj.check();

	}

}
