package Person;

public class PersonDriverClass {
	
	public static void main(String args[]) {
	
		PersonInfo obj=new PersonInfo();
		obj.fname="Sumithra";
		obj.lname="M";
		//obj.age=10;
		obj.setage(10);
		System.out.println("age="+obj.getage());
		obj.show();
		//obj.display();
		
		System.out.println(obj);
		
	
	}

}
