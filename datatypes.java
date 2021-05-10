package fundamental;

public class datatypes {
	char c='a';	    //2 byte
	byte b=12;		//1 byte
	short s=568;		//2 byte
	int	 i=6543;	//4 byte
	long l=142576L;	//8 byte
	float f=1.1f;	//4 byte
	double d=1.1234d;	//8 byte
   //boolean size can be  precisely identified
	 boolean b1=true;
	void show()
	{
		System.out.println(i);
		System.out.println(f);
		System.out.println(b);
		System.out.println(s);
		System.out.println(l);
		System.out.println(d);
		System.out.println(c);
		 System.out.println(b1); 
	}
	public static void main(String[] args) {
		datatypes obj=new datatypes();
		obj.show();
		
	}

}
