package web;



public class Client {
	
	private String nom ,prenom,address ;
	private int phone;
	public Client(String nom, String prenom, String address, int phone) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.address = address;
		this.phone = phone;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}

}
