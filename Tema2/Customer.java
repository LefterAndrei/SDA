package Tema2;

public class Customer {

	protected String first_name = new String();
	protected String last_name = new String();
	protected int age = 0;
	protected Adress address = new Adress(first_name, first_name, age);
	protected PaymentMethod pm = new PaymentMethod();
	
	
	
	Customer(){
		this.first_name = "Lefter";
		this.last_name = "Andrei";
		this.age = 0;
		
	}
	Customer(String fn, String ln, int age){
		this.first_name = fn;
		this.last_name = ln;
		this.age = age;
		
	}
	public String getfn() {
		return first_name;
	}

	public void setfn(String a) {
		first_name = a;
	}
	
	public String getln() {
		return last_name;
	}

	public void setln(String b) {
		last_name = b;
	}
	
	public void setage(int x1) {
		age = x1;
	}

	public double getage() {
		return age;
	}
	
	public void setaddress(Adress a) {
		address = a;
	}

	public Adress getaddress() {
		return address;
	}
	
	public String getCompleteName(){
		return "Prenume: "+this.first_name + " Nume: "+this.last_name;
		
	}
	
	public String getFullAddress(){
		return address.getFullAddress();
	}
	
}
