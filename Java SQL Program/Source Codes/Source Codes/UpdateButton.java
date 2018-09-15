package javasqlprogram;

import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

import com.mysql.jdbc.PreparedStatement;

public class UpdateButton extends UpdateAction {

	static void Update(ActionEvent a) throws Exception{
		String URL = "jdbc:mysql://localhost:3306/record";
		String User = "root";
		String Pass = "Netoxis98";
		
		Connection c = DriverManager.getConnection(URL, User, Pass);
		PreparedStatement p;
		try{
        	String update = "update students set Last_Name=?, First_Name=?, Age=?, Gender=? where Stud_ID=?";
        	int iSID = Integer.parseInt(textField.getText());
        	int iA = Integer.parseInt(textField_3.getText());
        	String LN = textField_1.getText();
        	String FN = textField_2.getText();
        	String G = textField_4.getText();
        	
        	p=(PreparedStatement) c.prepareStatement(update);
			p.setString(1, LN);
			p.setString(2, FN);
			p.setInt(3, iA);
			p.setString(4, G);
			p.setInt(5, iSID);
			p.executeUpdate();
			
			JOptionPane.showMessageDialog(btnUpdate,new String("Record Updated!"));
        }
		catch (Exception e) {
			JOptionPane.showMessageDialog(null,new String("Error! Wrong input!"));
			e.printStackTrace();
		}
		
	}

}
