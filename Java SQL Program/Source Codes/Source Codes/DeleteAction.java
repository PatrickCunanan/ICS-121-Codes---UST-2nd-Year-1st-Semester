package javasqlprogram;

import java.sql.*;
import java.awt.event.ActionEvent;

import javax.swing.*;

public class DeleteAction extends MainClass{

	static void DeleteActionPerformed(ActionEvent a) throws Exception{
		String URL = "jdbc:mysql://localhost:3306/record";
		String User = "root";
		String Pass = "Netoxis98";
		
		try{
			
			Connection c = DriverManager.getConnection(URL, User, Pass);
			Statement s = c.createStatement();
			
				String SID = JOptionPane.showInputDialog(null, "Student ID", "Input Stud_ID of row to be deleted.");
				int iSID = Integer.parseInt(SID);
				String SQLins = "delete from students where Stud_ID = " + iSID;
				s.executeUpdate(SQLins);
				JOptionPane.showMessageDialog(null, "Record successfully deleted!", "", JOptionPane.PLAIN_MESSAGE);		
		}
		catch (Exception e) {
			JOptionPane.showMessageDialog(null,new String("Error! Wrong input / Record does not exist!"));
			e.printStackTrace();
		}
	}
}
