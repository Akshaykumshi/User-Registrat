package webapp;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

public class ListUser {

List<Person> ListUser;
void insertDB(Person P)
{
	DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
	String mysqlUrl = "jdbc:mysql://localhost/UserRegist";
	Connection con = DriverManager.getConnection(mysqlUrl, "User","User123");
	System.out.println("Connection established......");
	String SQL = "INSERT INTO User_Reg(username,password,name,phno,address,DOB) " + "VALUES(?,?,?,?,?,?)";
	long id = 0;
	try (PreparedStatement pstmt = con.prepareStatement(SQL,Statement.RETURN_GENERATED_KEYS)){
		pstmt.setString(1,P.username);
		pstmt.setString(2,P.password);
		pstmt.setString(3,P.name);
		pstmt.setString(4,P.phno);
		pstmt.setString(5,P.address);
		pstmt.setString(6,P.DOB);
		int affectedRows = pstmt.executeUpdate();
		if (affectedRows > 0) {
			try (ResultSet rs = pstmt.getGeneratedKeys()) {
                if (rs.next()) {
                    id = rs.getLong(1);
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
		}
	}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
			
Person getRecord(String username,String password)
{
	//Iterator<Person> it1=ListUser.listIterator();
	int length =ListUser.size();
	for(int i=0;i<length;i++){
	
		if((i.getUsername().equals(username)) && (i.getPassword().equals(password)))
		{
			return i;
		}
	
	}

	
	
}
void addUser(Person P)
    {
    	ListUser.add(P);
    	insertDB(P);
    	
    }

}
