package Tema2;

public class Adress {
	
	
	protected String city = new String();
	protected String street = new String();
	protected int number = 0;
	
	Adress(){
		this.city = "Lefter";
		this.street = "Andrei";
		this.number = 0;
		
	}
	
	Adress(String city, String street, int number){
		this.city = city;
		this.street = street;
		this.number = number;
	
	}
	
	

	public String getcity() {
		return city;
	}

	public void setcity(String a) {
		city = a;
	}
	
	public String getstreet() {
		return street;
	}

	public void setstreet(String b) {
		street = b;
	}
	public void setnumber(int x1) {
		number = x1;
	}

	public double getnumber() {
		return number;
	}
	
public String getFullAddress(){
		
		return "oras: "+this.city +" strada: "+this.street+" numar:"+this.number;
	}
}
