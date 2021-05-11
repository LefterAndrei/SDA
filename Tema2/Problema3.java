package Tema2;

public class Problema3 {
	public static void main(String[] args) {
		Adress address = new Adress();
		address.setcity("Brasov");
		address.setstreet("Iezerului");
		address.setnumber(171);
		
		PaymentMethod pm = new PaymentMethod();
		
		String last_name = "Lefter";
		String first_name = "Andrei";
		int age = 69;
		
		Customer c = new Customer();
		c.setfn(first_name);
		c.setln(last_name);
		c.setage(age);
		c.setaddress(address);
		
		System.out.println(c.getCompleteName());
		System.out.println(c.getFullAddress());
		
	}
}