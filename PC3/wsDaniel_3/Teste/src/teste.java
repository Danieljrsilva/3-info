import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
public class teste {//1
	public static void main(String[] args) throws
	ClassNotFoundException, SQLException {//2
		
		String local = "jdbc:mysql://localhost:3306/teste";
		String user = "root";
		String pass = "1234";
		Connection conn = DriverManager.getConnection(local, user, pass);
		String sql = "SELECT * from tab";
		PreparedStatement pstm = conn.prepareStatement(sql);
		ResultSet rs = pstm.executeQuery();
		while(rs.next()) {//3
			JOptionPane.showMessageDialog(null, 
					"id: " + rs.getString("id") +
					"\ndes: " + rs.getString("des"));
		}//3
		rs.close();
		pstm.close();
	}//2	

}//1
