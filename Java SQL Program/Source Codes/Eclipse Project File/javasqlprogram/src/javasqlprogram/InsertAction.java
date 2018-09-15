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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingConstants;

public class InsertAction extends MainClass implements ActionListener{


	/**
	 * @wbp.parser.entryPoint
	 */
	static String URL = "jdbc:mysql://localhost:3306/record";
	static String User = "root";
	static String Pass = "Netoxis98";
	static String delpass = "pass";
	/**
	 * @wbp.parser.entryPoint
	 */
	static void InsertActionPerformed(ActionEvent a) throws Exception{
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
	    springLayout.putConstraint(SpringLayout.NORTH, textField_1, 0, SpringLayout.NORTH, label);
	    springLayout.putConstraint(SpringLayout.WEST, textField_1, 0, SpringLayout.WEST, textField);
	    springLayout.putConstraint(SpringLayout.EAST, textField_1, 0, SpringLayout.EAST, textField);
	    textField_1.setColumns(10);
	    sf.getContentPane().add(textField_1);
	    
	    textField_2 = new JTextField();
	    springLayout.putConstraint(SpringLayout.NORTH, textField_2, 0, SpringLayout.NORTH, lblFirstName);
	    springLayout.putConstraint(SpringLayout.WEST, textField_2, 0, SpringLayout.WEST, textField);
	    springLayout.putConstraint(SpringLayout.EAST, textField_2, 0, SpringLayout.EAST, textField);
	    textField_2.setColumns(10);
	    sf.getContentPane().add(textField_2);
	    
	    textField_3 = new JTextField();
	    springLayout.putConstraint(SpringLayout.NORTH, textField_3, 0, SpringLayout.NORTH, lblAge);
	    springLayout.putConstraint(SpringLayout.WEST, textField_3, 0, SpringLayout.WEST, textField);
	    springLayout.putConstraint(SpringLayout.EAST, textField_3, 0, SpringLayout.EAST, textField);
	    textField_3.setColumns(10);
	    sf.getContentPane().add(textField_3);
	    
	    textField_4 = new JTextField();
	    springLayout.putConstraint(SpringLayout.NORTH, textField_4, 0, SpringLayout.NORTH, lblGender);
	    springLayout.putConstraint(SpringLayout.WEST, textField_4, 0, SpringLayout.WEST, textField);
	    springLayout.putConstraint(SpringLayout.EAST, textField_4, 0, SpringLayout.EAST, textField);
	    textField_4.setColumns(10);
	    sf.getContentPane().add(textField_4);
	    
	    JLabel lblSearchRecord = new JLabel("INSERT RECORD");
	    lblSearchRecord.setHorizontalAlignment(SwingConstants.CENTER);
	    springLayout.putConstraint(SpringLayout.WEST, lblSearchRecord, -82, SpringLayout.WEST, textField);
	    springLayout.putConstraint(SpringLayout.SOUTH, lblSearchRecord, -6, SpringLayout.NORTH, textField);
	    springLayout.putConstraint(SpringLayout.EAST, lblSearchRecord, 0, SpringLayout.EAST, sf.getContentPane());
	    lblSearchRecord.setFont(new Font("Arial Black", Font.PLAIN, 16));
	    sf.getContentPane().add(lblSearchRecord);
	    
	    JButton btnSearch = new JButton("Insert!");
	    springLayout.putConstraint(SpringLayout.WEST, btnSearch, 0, SpringLayout.WEST, label);
	    springLayout.putConstraint(SpringLayout.EAST, btnSearch, 0, SpringLayout.EAST, textField);
	    btnSearch.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		try {
                    InsertButton.Insert(a);
                } catch (Exception ex) {
                    Logger.getLogger(MainClass.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
	    btnSearch.setBackground(Color.WHITE);
	    springLayout.putConstraint(SpringLayout.SOUTH, btnSearch, -10, SpringLayout.SOUTH, sf.getContentPane());
	    sf.getContentPane().add(btnSearch);
	    sf.setTitle("Insert Record");
	    sf.setBackground(Color.LIGHT_GRAY);
	    sf.setSize(322, 235);
	    sf.setLocation(300,200);
	    sf.setResizable(false);
	    sf.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	    sf.setVisible(true);
}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	static JTextField textField;
	static JTextField textField_1;
	static JTextField textField_2;
	static JTextField textField_3;
	static JTextField textField_4;
	static javax.swing.JButton btnSearch;
}
