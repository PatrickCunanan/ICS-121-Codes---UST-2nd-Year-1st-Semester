package javasqlprogram;

import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class SearchButton extends SearchAction {

	static void Search(ActionEvent a) throws Exception{
		String URL = "jdbc:mysql://localhost:3306/record";
		String User = "root";
		String Pass = "Netoxis98";
		
		Connection c = DriverManager.getConnection(URL, User, Pass);
		Statement s = c.createStatement();
		ResultSet r = s.executeQuery("select * from students");
        String text = textField.getText();
        boolean flag=false;
        int n=Integer.parseInt(text);
        try{
        	r.first();
        	do{
                          int p=Integer.parseInt(r.getString("Stud_ID"));
                          if (n==p)
                          {
                           textField_1.setText(r.getString("Last_Name"));
                           textField_2.setText(r.getString("First_Name"));
                           textField_3.setText(r.getString("Age"));
                           textField_4.setText(r.getString("Gender"));
                           flag=true;
                          }
						
                     } while (r.next());
					    if (flag==false)
                      JOptionPane.showMessageDialog(btnSearch,new String("Record Not Found!"));
                  }
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
