package dom;


import web.Gestion;

public class SerClients implements Gestion {
	
	@Override
	public  void addClient(String address,String nom,String prenom,int phone ) {
		
		DbManager.newClient(nom, prenom, address, phone);
	}
	 
	

}
