package dom;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;





public class DbManager {
	//private static	Credit creditResult ;
	private static final String dbUrl = "jdbc:mysql://localhost/travelagency";
	//private static final String dbClass = "com.mysql.jdbc.Driver";
	
	private static final String userName = "root";
	private static final String password = "";
	
	
	public static void newClient(String nom,String prenom,String address,int phone  ){	
		
	
		String queryIns="INSERT INTO `travelagency`.`client` ( `NomClient`, `PrenomClient`, `AddressClient`, `TelClient`)"
				+ " VALUES ('"+nom+"', '"+prenom+"',  '"+address+"',  '"+phone+"')";
	try {

	Class.forName("com.mysql.jdbc.Driver");
	Connection con = (Connection) DriverManager.getConnection (dbUrl, userName, password);
	Statement stmt = con.createStatement(); 
			stmt.executeUpdate(queryIns);
	con.close();
		
	} //end try

	catch(SQLException e) {
		System.out.println(e);
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	
}

}
