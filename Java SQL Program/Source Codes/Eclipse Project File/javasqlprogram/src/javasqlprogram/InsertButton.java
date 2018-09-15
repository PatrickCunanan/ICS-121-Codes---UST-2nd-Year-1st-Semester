package javasqlprogram;

import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

public class InsertButton extends InsertAction{


	static void Insert(ActionEvent a) throws Exception{
		String URL = "jdbc:mysql://localhost:3306/record";
		String User = "root";
		String Pass = "Netoxis98";
		
		try{
			Connection c = DriverManager.getConnection(URL, User, Pass);
			PreparedStatement p;
			String SQLins = "insert into students values (?,?,?,?,?)";
									
			int iSID = Integer.parseInt(textField.getText());
			String LN = textField_1.getText();
			String FN = textField_2.getText();
			int iA = Integer.parseInt(textField_3.getText());
			String G = textField_4.getText();
			
			p=c.prepareStatement(SQLins);
			p.setInt(1, iSID);
			p.setString(2, LN);
			p.setString(3, FN);
			p.setInt(4, iA);
			p.setString(5, G);
			p.executeUpdate();
			
			JOptionPane.showMessageDialog(null, "Record successfully inserted!", "", JOptionPane.PLAIN_MESSAGE);
		}
		catch (Exception e) {
			JOptionPane.showMessageDialog(null,new String("Error! Wrong input!"));
			e.printStackTrace();
		}
		
	}
}
