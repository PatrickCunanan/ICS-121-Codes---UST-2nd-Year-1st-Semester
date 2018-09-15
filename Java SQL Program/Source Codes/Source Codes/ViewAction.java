package javasqlprogram;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.SpringLayout;

import net.proteanit.sql.DbUtils;

import javax.swing.JTable;
import javax.swing.JScrollPane;

public class ViewAction extends MainClass {
	

	/**
	 * @wbp.parser.entryPoint
	 */
	static void ViewActionPerformed(ActionEvent a) throws Exception{
		String URL = "jdbc:mysql://localhost:3306/record";
		String User = "root";
		String Pass = "Netoxis98";
		
		JFrame sf = new JFrame("SubJFrame");
		sf.setResizable(false);
	    sf.getContentPane().setBackground(Color.LIGHT_GRAY);
	    SpringLayout springLayout = new SpringLayout();
	    sf.getContentPane().setLayout(springLayout);
	    
	    JScrollPane scrollPane = new JScrollPane();
	    sf.getContentPane().add(scrollPane);
	    
	    JScrollPane scrollPane_1 = new JScrollPane();
	    springLayout.putConstraint(SpringLayout.NORTH, scrollPane_1, 10, SpringLayout.NORTH, sf.getContentPane());
	    springLayout.putConstraint(SpringLayout.WEST, scrollPane_1, 10, SpringLayout.WEST, sf.getContentPane());
	    springLayout.putConstraint(SpringLayout.SOUTH, scrollPane_1, 229, SpringLayout.NORTH, sf.getContentPane());
	    springLayout.putConstraint(SpringLayout.EAST, scrollPane_1, 606, SpringLayout.WEST, sf.getContentPane());
	    sf.getContentPane().add(scrollPane_1);
	    
	    table = new JTable();
	    scrollPane_1.setViewportView(table);
	    sf.setTitle("Student Table");
	    sf.setBackground(Color.LIGHT_GRAY);
	    sf.setSize(622, 268);
	    sf.setVisible(true);
	    sf.setLocation(300,200);	
	    
	    try{
	    	Connection c = DriverManager.getConnection(URL, User, Pass);
			Statement s = c.createStatement();
			ResultSet r = s.executeQuery("select * from students order by Last_Name");
			table.setModel(DbUtils.resultSetToTableModel(r));
			
	    }
	    catch (Exception e) {
			e.printStackTrace();
		}
	}
	 static javax.swing.JTextArea textArea_1;
	 static javax.swing.JTextArea textArea_2;
	 static javax.swing.JTextArea textArea_5;
	 static javax.swing.JTextArea textArea_6;
	 static javax.swing.JTextArea textArea_7;
	 private static JTable table;
}
