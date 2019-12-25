import unit4.collectionsLib.Node;
public class PhoneBook{
	private Node<Contact> book;


	public PhoneBook(){
		this.book=null;

	}

	public Void addContact(String name, String phone){
		Node<Contact> pos= this.book;
		while(pos.getNext().getValue().getName().compareTo(name)<0){
			pos = pos.getNext();
		}

		if(pos.getNext().getValue().getName().compareTo(name)==0){
			pos.getNext().getValue().setPhone(phone);
		}
		else{
			Contact c= new Conatct(name, phone);
			pos.setNext(new Node<Contact>(c, pos.getNext()));
		}
	}

	public Void delContact(String name){
		Node<Conatct> pos = this.book;
		while(pos.getNext().getValue().getName()!=name){
			pos=pos.getNext()
		}
		pos.setnext(pos.getnext().getNext());
	}

	public String getPhone(String name){
		Node<Contact> pos = this.book;
		while(pos!=null && !pos.getValue().getName().equals(name)){
			pos=pos.getNext()
		}
		if(pos!= null){
			return pos.getValue().getPhone();
		}
		return null;
	}

	public String toString(){
		Node<Contact> pos = this.book;
		String s="";
		while(pos!=null){
			s+=pos.getValue().toString()+"/n";
		}
		return s;
	}



}