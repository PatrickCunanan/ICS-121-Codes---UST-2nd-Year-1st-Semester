package javasqlprogram;

import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.SwingConstants;


public class NavigateAction extends MainClass implements ActionListener{

	/**
	 * @wbp.parser.entryPoint
	 */
	static ResultSet r;
	
	
 /**
  * @wbp.parser.entryPoint
  */
 void NavigateActionPerformed(ActionEvent a) throws Exception{
		JFrame sf = new JFrame("SearchJFrame");
	    sf.getContentPane().setBackground(Color.LIGHT_GRAY);
	    SpringLayout springLayout = new SpringLayout();
	    sf.getContentPane().setLayout(springLayout);
	    
	    JLabel lblStudid = new JLabel("Stud_ID:");
	    springLayout.putConstraint(SpringLayout.NORTH, lblStudid, 39, SpringLayout.NORTH, sf.getContentPane());
	    springLayout.putConstraint(SpringLayout.WEST, lblStudid, 20, SpringLayout.WEST, sf.getContentPane());
	    lblStudid.setFont(new Font("Tahoma", Font.PLAIN, 14));
	    sf.getContentPane().add(lblStudid);
	    
	    textField = new JTextField();
	    textField.setEditable(false);
	    springLayout.putConstraint(SpringLayout.NORTH, textField, 39, SpringLayout.NORTH, sf.getContentPane());
	    springLayout.putConstraint(SpringLayout.WEST, textField, 6, SpringLayout.EAST, lblStudid);
	    springLayout.putConstraint(SpringLayout.EAST, textField, 223, SpringLayout.EAST, lblStudid);
	    sf.getContentPane().add(textField);
	    textField.setColumns(10);
	    
	    JLabel label = new JLabel("Last Name:");
	    springLayout.putConstraint(SpringLayout.NORTH, label, 6, SpringLayout.SOUTH, lblStudid);
	    springLayout.putConstraint(SpringLayout.EAST, label, 0, SpringLayout.EAST, lblStudid);
	    label.setFont(new Font("Tahoma", Font.PLAIN, 14));
	    sf.getContentPane().add(label);
	    
	    JLabel lblFirstName = new JLabel("First Name:");
	    springLayout.putConstraint(SpringLayout.NORTH, lblFirstName, 6, SpringLayout.SOUTH, label);
	    springLayout.putConstraint(SpringLayout.WEST, lblFirstName, 0, SpringLayout.WEST, label);
	    lblFirstName.setFont(new Font("Tahoma", Font.PLAIN, 14));
	    sf.getContentPane().add(lblFirstName);
	    
	    JLabel lblAge = new JLabel("Age:");
	    springLayout.putConstraint(SpringLayout.NORTH, lblAge, 6, SpringLayout.SOUTH, lblFirstName);
	    springLayout.putConstraint(SpringLayout.EAST, lblAge, 0, SpringLayout.EAST, lblStudid);
	    lblAge.setFont(new Font("Tahoma", Font.PLAIN, 14));
	    sf.getContentPane().add(lblAge);
	    
	    JLabel lblGender = new JLabel("Gender:");
	    springLayout.putConstraint(SpringLayout.NORTH, lblGender, 6, SpringLayout.SOUTH, lblAge);
	    springLayout.putConstraint(SpringLayout.EAST, lblGender, 0, SpringLayout.EAST, lblStudid);
	    lblGender.setFont(new Font("Tahoma", Font.PLAIN, 14));
	    sf.getContentPane().add(lblGender);
	    
	    textField_1 = new JTextField();
	    textField_1.setEditable(false);
	    springLayout.putConstraint(SpringLayout.NORTH, textField_1, 0, SpringLayout.NORTH, label);
	    springLayout.putConstraint(SpringLayout.WEST, textField_1, 0, SpringLayout.WEST, textField);
	    springLayout.putConstraint(SpringLayout.EAST, textField_1, 0, SpringLayout.EAST, textField);
	    textField_1.setColumns(10);
	    sf.getContentPane().add(textField_1);
	    
	    textField_2 = new JTextField();
	    textField_2.setEditable(false);
	    springLayout.putConstraint(SpringLayout.NORTH, textField_2, 0, SpringLayout.NORTH, lblFirstName);
	    springLayout.putConstraint(SpringLayout.WEST, textField_2, 0, SpringLayout.WEST, textField);
	    springLayout.putConstraint(SpringLayout.EAST, textField_2, 0, SpringLayout.EAST, textField);
	    textField_2.setColumns(10);
	    sf.getContentPane().add(textField_2);
	    
	    textField_3 = new JTextField();
	    textField_3.setEditable(false);
	    springLayout.putConstraint(SpringLayout.NORTH, textField_3, 0, SpringLayout.NORTH, lblAge);
	    springLayout.putConstraint(SpringLayout.WEST, textField_3, 0, SpringLayout.WEST, textField);
	    springLayout.putConstraint(SpringLayout.EAST, textField_3, 0, SpringLayout.EAST, textField);
	    textField_3.setColumns(10);
	    sf.getContentPane().add(textField_3);
	    
	    textField_4 = new JTextField();
	    textField_4.setEditable(false);
	    springLayout.putConstraint(SpringLayout.NORTH, textField_4, 0, SpringLayout.NORTH, lblGender);
	    springLayout.putConstraint(SpringLayout.WEST, textField_4, 0, SpringLayout.WEST, textField);
	    springLayout.putConstraint(SpringLayout.EAST, textField_4, 0, SpringLayout.EAST, textField);
	    textField_4.setColumns(10);
	    sf.getContentPane().add(textField_4);
	    
	    JLabel lblSearchRecord = new JLabel("NAVIGATE RECORDS");
	    springLayout.putConstraint(SpringLayout.WEST, lblSearchRecord, -82, SpringLayout.WEST, textField);
	    springLayout.putConstraint(SpringLayout.EAST, lblSearchRecord, 224, SpringLayout.WEST, textField);
	    lblSearchRecord.setHorizontalAlignment(SwingConstants.CENTER);
	    springLayout.putConstraint(SpringLayout.SOUTH, lblSearchRecord, -6, SpringLayout.NORTH, textField);
	    lblSearchRecord.setFont(new Font("Arial Black", Font.PLAIN, 16));
	    sf.getContentPane().add(lblSearchRecord);
	    
	    JButton btnFirst = new JButton("First");
	    btnFirst.setBackground(Color.WHITE);
	    sf.getContentPane().add(btnFirst);
	    
	    JButton btnLast = new JButton("Last");
	    springLayout.putConstraint(SpringLayout.SOUTH, btnFirst, -6, SpringLayout.NORTH, btnLast);
	    springLayout.putConstraint(SpringLayout.EAST, btnLast, 0, SpringLayout.EAST, btnFirst);
	    springLayout.putConstraint(SpringLayout.SOUTH, btnLast, -5, SpringLayout.SOUTH, sf.getContentPane());
	    btnLast.setBackground(Color.WHITE);
	    sf.getContentPane().add(btnLast);
	    
	    JButton btnNext = new JButton("Next");
	    springLayout.putConstraint(SpringLayout.WEST, btnNext, 226, SpringLayout.WEST, sf.getContentPane());
	    springLayout.putConstraint(SpringLayout.EAST, btnFirst, -6, SpringLayout.WEST, btnNext);
	    springLayout.putConstraint(SpringLayout.EAST, btnNext, -10, SpringLayout.EAST, sf.getContentPane());
	    btnNext.setBackground(Color.WHITE);
	    sf.getContentPane().add(btnNext);
	    
	    JButton btnPrevious = new JButton("Previous");
	    springLayout.putConstraint(SpringLayout.SOUTH, btnNext, -6, SpringLayout.NORTH, btnPrevious);
	    springLayout.putConstraint(SpringLayout.WEST, btnPrevious, 6, SpringLayout.EAST, btnLast);
	    springLayout.putConstraint(SpringLayout.EAST, btnPrevious, -10, SpringLayout.EAST, sf.getContentPane());
	    springLayout.putConstraint(SpringLayout.SOUTH, btnPrevious, -5, SpringLayout.SOUTH, sf.getContentPane());
	    btnPrevious.setBackground(Color.WHITE);
	    sf.getContentPane().add(btnPrevious);
	    
	    JLabel lblNavigators = new JLabel("Navigators:");
	    springLayout.putConstraint(SpringLayout.WEST, btnFirst, 6, SpringLayout.EAST, lblNavigators);
	    springLayout.putConstraint(SpringLayout.WEST, btnLast, 6, SpringLayout.EAST, lblNavigators);
	    springLayout.putConstraint(SpringLayout.NORTH, lblNavigators, 0, SpringLayout.NORTH, btnFirst);
	    springLayout.putConstraint(SpringLayout.WEST, lblNavigators, 0, SpringLayout.WEST, label);
	    springLayout.putConstraint(SpringLayout.EAST, lblNavigators, -165, SpringLayout.EAST, sf.getContentPane());
	    springLayout.putConstraint(SpringLayout.SOUTH, lblNavigators, -5, SpringLayout.SOUTH, sf.getContentPane());
	    lblNavigators.setFont(new Font("Arial Black", Font.PLAIN, 13));
	    lblNavigators.setHorizontalAlignment(SwingConstants.CENTER);
	    sf.getContentPane().add(lblNavigators);
	    sf.setTitle("Navigate Records");
	    sf.setBackground(Color.LIGHT_GRAY);
	    sf.setSize(322, 265);
	    sf.setLocation(300,200);
	    sf.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	    sf.setVisible(true);
	    
	    btnFirst.addActionListener(this);
		btnLast.addActionListener(this);
		btnNext.addActionListener(this);
		btnPrevious.addActionListener(this);
	    
	    try{
	    	String URL = "jdbc:mysql://localhost:3306/record";
			String User = "root";
			String Pass = "Netoxis98";
			
			Connection c = DriverManager.getConnection(URL, User, Pass);
			String s = "select * from students order by Last_Name";
			Statement st= c.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
						
			r=st.executeQuery(s);
            r.next();
            textField.setText(r.getString("Stud_ID"));
            textField_1.setText(r.getString("Last_Name"));
            textField_2.setText(r.getString("First_Name"));
            textField_3.setText(r.getString("Age"));
            textField_4.setText(r.getString("Gender"));
           
	    }
	    catch (Exception e){
	    	
	    }
	    
}


	
	static JTextField textField;
	static JTextField textField_1;
	static JTextField textField_2;
	static JTextField textField_3;
	static JTextField textField_4;
	static javax.swing.JButton btnFirst;

	public void actionPerformed(ActionEvent evt) {
		String s1=evt.getActionCommand();
		if (s1.equals("First"))
        {
            try
            {
            r.first();
            textField.setText(r.getString("Stud_ID"));
            textField_1.setText(r.getString("Last_Name"));
            textField_2.setText(r.getString("First_Name"));
            textField_3.setText(r.getString("Age"));
            textField_4.setText(r.getString("Gender"));
            }
            catch(Exception ex1)
            {
                
            }
        }
        if(s1.equals("Next"))
        {
            try
            {
            r.next();
            textField.setText(r.getString("Stud_ID"));
            textField_1.setText(r.getString("Last_Name"));
            textField_2.setText(r.getString("First_Name"));
            textField_3.setText(r.getString("Age"));
            textField_4.setText(r.getString("Gender"));
            }
            catch(Exception ex2)
            {
                
            }
        }
        if (s1.equals("Last"))
        {
            try
            {
            r.last();
            textField.setText(r.getString("Stud_ID"));
            textField_1.setText(r.getString("Last_Name"));
            textField_2.setText(r.getString("First_Name"));
            textField_3.setText(r.getString("Age"));
            textField_4.setText(r.getString("Gender"));
             }
            catch(Exception ex3)
            {
                
            }
        }
        if (s1.equals("Previous"))
        {
            try
            {
            r.previous();
            textField.setText(r.getString("Stud_ID"));
            textField_1.setText(r.getString("Last_Name"));
            textField_2.setText(r.getString("First_Name"));
            textField_3.setText(r.getString("Age"));
            textField_4.setText(r.getString("Gender"));
            }
            catch(Exception ex4)
            {
                
            }
	}
}
}