public class Contact{
	
	private String name;
	private String phone;

	public Contact(String name, String Phone){
		this.name = name;
		this.phone = phone;
	}

	public Void setName(name){
		this.name = name;
	}

	public Void setPhone(phone){
		this.phone = phone;
	}

	public String getName(){
		return this.name;
	}

	public String getPhone(){
		return this.phone;
	}	


	public String toString(){
		  return String.format("%-20s %-10s", this.name, this.phone); 
    }



}