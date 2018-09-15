package javasqlprogram;

import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.*;

public class MainClass {    

	static String adminname = "ADMIN";
	static String adminpass = "1234";
	static String username = "user";
	static String userpass = "1234";
	static JButton btnInsertRecord;
	static JButton btnDeleteRecord;
	static JButton btnUpdateRecord;
	
	public static void MainWindow(){
		
		  String uname = JOptionPane.showInputDialog(null, "Username", "Input username");
		  String password = JOptionPane.showInputDialog(null, "Password", "Input password");
		  if(uname.equals(username) && password.equals(userpass)){
			  JFrame f = new JFrame("JFrame");
		      f.getContentPane().setBackground(Color.LIGHT_GRAY);
		      f.setTitle("Java SQL Record Program");
		      f.setBackground(Color.LIGHT_GRAY);
		      f.setSize(400, 474);
		      f.setLocation(300,200);
		      SpringLayout springLayout = new SpringLayout();
		      f.getContentPane().setLayout(springLayout);
		      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      
		      NavigateAction N = new NavigateAction();
		      
		      btnInsertRecord = new JButton("Insert Record");
		      btnInsertRecord.setEnabled(false);
		      springLayout.putConstraint(SpringLayout.NORTH, btnInsertRecord, 10, SpringLayout.NORTH, f.getContentPane());
		      springLayout.putConstraint(SpringLayout.WEST, btnInsertRecord, 10, SpringLayout.WEST, f.getContentPane());
		      springLayout.putConstraint(SpringLayout.SOUTH, btnInsertRecord, -375, SpringLayout.SOUTH, f.getContentPane());
		      springLayout.putConstraint(SpringLayout.EAST, btnInsertRecord, -10, SpringLayout.EAST, f.getContentPane());
		      btnInsertRecord.setBackground(Color.WHITE);
		      f.getContentPane().add(btnInsertRecord);
		      btnInsertRecord.addActionListener(new java.awt.event.ActionListener() {
		            public void actionPerformed(java.awt.event.ActionEvent i) {
		                try {
		                    InsertAction.InsertActionPerformed(i);
		                } catch (Exception ex) {
		                    Logger.getLogger(MainClass.class.getName()).log(Level.SEVERE, null, ex);
		                }
		            }
		        });
		      
		      btnDeleteRecord = new JButton("Delete Record");
		      btnDeleteRecord.setEnabled(false);
		      springLayout.putConstraint(SpringLayout.NORTH, btnDeleteRecord, 6, SpringLayout.SOUTH, btnInsertRecord);
		      springLayout.putConstraint(SpringLayout.WEST, btnDeleteRecord, 0, SpringLayout.WEST, btnInsertRecord);
		      springLayout.putConstraint(SpringLayout.SOUTH, btnDeleteRecord, -309, SpringLayout.SOUTH, f.getContentPane());
		      springLayout.putConstraint(SpringLayout.EAST, btnDeleteRecord, -10, SpringLayout.EAST, f.getContentPane());
		      btnDeleteRecord.setBackground(Color.WHITE);
		      f.getContentPane().add(btnDeleteRecord);
		      btnDeleteRecord.addActionListener(new java.awt.event.ActionListener() {
		            public void actionPerformed(java.awt.event.ActionEvent i) {
		                try {
		                    DeleteAction.DeleteActionPerformed(i);
		                } catch (Exception ex) {
		                    Logger.getLogger(MainClass.class.getName()).log(Level.SEVERE, null, ex);
		                }
		            }
		        });
		      
		      JButton btnSearchRecord = new JButton("Search Record");
		      springLayout.putConstraint(SpringLayout.WEST, btnSearchRecord, 0, SpringLayout.WEST, btnInsertRecord);
		      springLayout.putConstraint(SpringLayout.SOUTH, btnSearchRecord, -177, SpringLayout.SOUTH, f.getContentPane());
		      springLayout.putConstraint(SpringLayout.EAST, btnSearchRecord, -10, SpringLayout.EAST, f.getContentPane());
		      btnSearchRecord.setBackground(Color.WHITE);
		      f.getContentPane().add(btnSearchRecord);
		      btnSearchRecord.addActionListener(new java.awt.event.ActionListener() {
		            public void actionPerformed(java.awt.event.ActionEvent i) {
		                try {
		                    SearchAction.SearchActionPerformed(i);
		                } catch (Exception ex) {
		                    Logger.getLogger(MainClass.class.getName()).log(Level.SEVERE, null, ex);
		                }
		            }
		        });
		      
		      JButton btnViewTable = new JButton("View Table");
		      springLayout.putConstraint(SpringLayout.WEST, btnViewTable, 0, SpringLayout.WEST, btnInsertRecord);
		      springLayout.putConstraint(SpringLayout.EAST, btnViewTable, -10, SpringLayout.EAST, f.getContentPane());
		      btnViewTable.setBackground(Color.WHITE);
		      f.getContentPane().add(btnViewTable);
		      btnViewTable.addActionListener(new java.awt.event.ActionListener() {
		            public void actionPerformed(java.awt.event.ActionEvent i) {
		                try {
		                    ViewAction.ViewActionPerformed(i);
		                } catch (Exception ex) {
		                    Logger.getLogger(MainClass.class.getName()).log(Level.SEVERE, null, ex);
		                }
		            }
		        });
		      
		      btnUpdateRecord = new JButton("Update Record");
		      btnUpdateRecord.setEnabled(false);
		      springLayout.putConstraint(SpringLayout.NORTH, btnSearchRecord, 6, SpringLayout.SOUTH, btnUpdateRecord);
		      springLayout.putConstraint(SpringLayout.SOUTH, btnUpdateRecord, -243, SpringLayout.SOUTH, f.getContentPane());
		      springLayout.putConstraint(SpringLayout.NORTH, btnUpdateRecord, 6, SpringLayout.SOUTH, btnDeleteRecord);
		      springLayout.putConstraint(SpringLayout.WEST, btnUpdateRecord, 10, SpringLayout.WEST, f.getContentPane());
		      springLayout.putConstraint(SpringLayout.EAST, btnUpdateRecord, 0, SpringLayout.EAST, btnInsertRecord);
		      btnUpdateRecord.setBackground(Color.WHITE);
		      f.getContentPane().add(btnUpdateRecord);
		      btnUpdateRecord.addActionListener(new java.awt.event.ActionListener() {
		            public void actionPerformed(java.awt.event.ActionEvent i) {
		                try {
		                    UpdateAction.UpdateActionPerformed(i);
		                } catch (Exception ex) {
		                    Logger.getLogger(MainClass.class.getName()).log(Level.SEVERE, null, ex);
		                }
		            }
		        });
		      
		      JLabel lblIcsProgram = new JLabel("ICS121 Program");
		      springLayout.putConstraint(SpringLayout.SOUTH, btnViewTable, -16, SpringLayout.NORTH, lblIcsProgram);
		      springLayout.putConstraint(SpringLayout.WEST, lblIcsProgram, 0, SpringLayout.WEST, f.getContentPane());
		      springLayout.putConstraint(SpringLayout.SOUTH, lblIcsProgram, -10, SpringLayout.SOUTH, f.getContentPane());
		      springLayout.putConstraint(SpringLayout.EAST, lblIcsProgram, 0, SpringLayout.EAST, f.getContentPane());
		      lblIcsProgram.setFont(new Font("Arial Black", Font.PLAIN, 13));
		      lblIcsProgram.setHorizontalAlignment(SwingConstants.CENTER);
		      f.getContentPane().add(lblIcsProgram);
		      
		      JButton btnNavigateRecords = new JButton("Navigate Records");
		      springLayout.putConstraint(SpringLayout.NORTH, btnViewTable, 6, SpringLayout.SOUTH, btnNavigateRecords);
		      springLayout.putConstraint(SpringLayout.NORTH, btnNavigateRecords, 6, SpringLayout.SOUTH, btnSearchRecord);
		      springLayout.putConstraint(SpringLayout.SOUTH, btnNavigateRecords, -111, SpringLayout.SOUTH, f.getContentPane());
		      springLayout.putConstraint(SpringLayout.WEST, btnNavigateRecords, 10, SpringLayout.WEST, f.getContentPane());
		      springLayout.putConstraint(SpringLayout.EAST, btnNavigateRecords, 0, SpringLayout.EAST, btnInsertRecord);
		      btnNavigateRecords.setBackground(Color.WHITE);
		      btnNavigateRecords.addActionListener(new java.awt.event.ActionListener() {
		            public void actionPerformed(java.awt.event.ActionEvent i) {
		                try {
		                    N.NavigateActionPerformed(i);
		                } catch (Exception ex) {
		                    Logger.getLogger(MainClass.class.getName()).log(Level.SEVERE, null, ex);
		                }
		            }
		        });
		      f.getContentPane().add(btnNavigateRecords);
		      f.setResizable(false);
		      f.setVisible(true);
		  }
		  else if (uname.equals(adminname) && password.equals(adminpass)){
			  JFrame f = new JFrame("JFrame");
		      f.getContentPane().setBackground(Color.LIGHT_GRAY);
		      f.setTitle("Java SQL Record Program");
		      f.setBackground(Color.LIGHT_GRAY);
		      f.setSize(400, 474);
		      f.setLocation(300,200);
		      SpringLayout springLayout = new SpringLayout();
		      f.getContentPane().setLayout(springLayout);
		      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      
		      NavigateAction N = new NavigateAction();
		      
		      btnInsertRecord = new JButton("Insert Record");
		      springLayout.putConstraint(SpringLayout.NORTH, btnInsertRecord, 10, SpringLayout.NORTH, f.getContentPane());
		      springLayout.putConstraint(SpringLayout.WEST, btnInsertRecord, 10, SpringLayout.WEST, f.getContentPane());
		      springLayout.putConstraint(SpringLayout.SOUTH, btnInsertRecord, -375, SpringLayout.SOUTH, f.getContentPane());
		      springLayout.putConstraint(SpringLayout.EAST, btnInsertRecord, -10, SpringLayout.EAST, f.getContentPane());
		      btnInsertRecord.setBackground(Color.WHITE);
		      f.getContentPane().add(btnInsertRecord);
		      btnInsertRecord.addActionListener(new java.awt.event.ActionListener() {
		            public void actionPerformed(java.awt.event.ActionEvent i) {
		                try {
		                    InsertAction.InsertActionPerformed(i);
		                } catch (Exception ex) {
		                    Logger.getLogger(MainClass.class.getName()).log(Level.SEVERE, null, ex);
		                }
		            }
		        });
		      
		      btnDeleteRecord = new JButton("Delete Record");
		      springLayout.putConstraint(SpringLayout.NORTH, btnDeleteRecord, 6, SpringLayout.SOUTH, btnInsertRecord);
		      springLayout.putConstraint(SpringLayout.WEST, btnDeleteRecord, 0, SpringLayout.WEST, btnInsertRecord);
		      springLayout.putConstraint(SpringLayout.SOUTH, btnDeleteRecord, -309, SpringLayout.SOUTH, f.getContentPane());
		      springLayout.putConstraint(SpringLayout.EAST, btnDeleteRecord, -10, SpringLayout.EAST, f.getContentPane());
		      btnDeleteRecord.setBackground(Color.WHITE);
		      f.getContentPane().add(btnDeleteRecord);
		      btnDeleteRecord.addActionListener(new java.awt.event.ActionListener() {
		            public void actionPerformed(java.awt.event.ActionEvent i) {
		                try {
		                    DeleteAction.DeleteActionPerformed(i);
		                } catch (Exception ex) {
		                    Logger.getLogger(MainClass.class.getName()).log(Level.SEVERE, null, ex);
		                }
		            }
		        });
		      
		      JButton btnSearchRecord = new JButton("Search Record");
		      springLayout.putConstraint(SpringLayout.WEST, btnSearchRecord, 0, SpringLayout.WEST, btnInsertRecord);
		      springLayout.putConstraint(SpringLayout.SOUTH, btnSearchRecord, -177, SpringLayout.SOUTH, f.getContentPane());
		      springLayout.putConstraint(SpringLayout.EAST, btnSearchRecord, -10, SpringLayout.EAST, f.getContentPane());
		      btnSearchRecord.setBackground(Color.WHITE);
		      f.getContentPane().add(btnSearchRecord);
		      btnSearchRecord.addActionListener(new java.awt.event.ActionListener() {
		            public void actionPerformed(java.awt.event.ActionEvent i) {
		                try {
		                    SearchAction.SearchActionPerformed(i);
		                } catch (Exception ex) {
		                    Logger.getLogger(MainClass.class.getName()).log(Level.SEVERE, null, ex);
		                }
		            }
		        });
		      
		      JButton btnViewTable = new JButton("View Table");
		      springLayout.putConstraint(SpringLayout.WEST, btnViewTable, 0, SpringLayout.WEST, btnInsertRecord);
		      springLayout.putConstraint(SpringLayout.EAST, btnViewTable, -10, SpringLayout.EAST, f.getContentPane());
		      btnViewTable.setBackground(Color.WHITE);
		      f.getContentPane().add(btnViewTable);
		      btnViewTable.addActionListener(new java.awt.event.ActionListener() {
		            public void actionPerformed(java.awt.event.ActionEvent i) {
		                try {
		                    ViewAction.ViewActionPerformed(i);
		                } catch (Exception ex) {
		                    Logger.getLogger(MainClass.class.getName()).log(Level.SEVERE, null, ex);
		                }
		            }
		        });
		      
		      btnUpdateRecord = new JButton("Update Record");
		      springLayout.putConstraint(SpringLayout.NORTH, btnSearchRecord, 6, SpringLayout.SOUTH, btnUpdateRecord);
		      springLayout.putConstraint(SpringLayout.SOUTH, btnUpdateRecord, -243, SpringLayout.SOUTH, f.getContentPane());
		      springLayout.putConstraint(SpringLayout.NORTH, btnUpdateRecord, 6, SpringLayout.SOUTH, btnDeleteRecord);
		      springLayout.putConstraint(SpringLayout.WEST, btnUpdateRecord, 10, SpringLayout.WEST, f.getContentPane());
		      springLayout.putConstraint(SpringLayout.EAST, btnUpdateRecord, 0, SpringLayout.EAST, btnInsertRecord);
		      btnUpdateRecord.setBackground(Color.WHITE);
		      f.getContentPane().add(btnUpdateRecord);
		      btnUpdateRecord.addActionListener(new java.awt.event.ActionListener() {
		            public void actionPerformed(java.awt.event.ActionEvent i) {
		                try {
		                    UpdateAction.UpdateActionPerformed(i);
		                } catch (Exception ex) {
		                    Logger.getLogger(MainClass.class.getName()).log(Level.SEVERE, null, ex);
		                }
		            }
		        });
		      
		      JLabel lblIcsProgram = new JLabel("ICS121 Program");
		      springLayout.putConstraint(SpringLayout.SOUTH, btnViewTable, -16, SpringLayout.NORTH, lblIcsProgram);
		      springLayout.putConstraint(SpringLayout.WEST, lblIcsProgram, 0, SpringLayout.WEST, f.getContentPane());
		      springLayout.putConstraint(SpringLayout.SOUTH, lblIcsProgram, -10, SpringLayout.SOUTH, f.getContentPane());
		      springLayout.putConstraint(SpringLayout.EAST, lblIcsProgram, 0, SpringLayout.EAST, f.getContentPane());
		      lblIcsProgram.setFont(new Font("Arial Black", Font.PLAIN, 13));
		      lblIcsProgram.setHorizontalAlignment(SwingConstants.CENTER);
		      f.getContentPane().add(lblIcsProgram);
		      
		      JButton btnNavigateRecords = new JButton("Navigate Records");
		      springLayout.putConstraint(SpringLayout.NORTH, btnViewTable, 6, SpringLayout.SOUTH, btnNavigateRecords);
		      springLayout.putConstraint(SpringLayout.NORTH, btnNavigateRecords, 6, SpringLayout.SOUTH, btnSearchRecord);
		      springLayout.putConstraint(SpringLayout.SOUTH, btnNavigateRecords, -111, SpringLayout.SOUTH, f.getContentPane());
		      springLayout.putConstraint(SpringLayout.WEST, btnNavigateRecords, 10, SpringLayout.WEST, f.getContentPane());
		      springLayout.putConstraint(SpringLayout.EAST, btnNavigateRecords, 0, SpringLayout.EAST, btnInsertRecord);
		      btnNavigateRecords.setBackground(Color.WHITE);
		      btnNavigateRecords.addActionListener(new java.awt.event.ActionListener() {
		            public void actionPerformed(java.awt.event.ActionEvent i) {
		                try {
		                    N.NavigateActionPerformed(i);
		                } catch (Exception ex) {
		                    Logger.getLogger(MainClass.class.getName()).log(Level.SEVERE, null, ex);
		                }
		            }
		        });
		      f.getContentPane().add(btnNavigateRecords);
		      f.setResizable(false);
		      f.setVisible(true);
		  }
		  else{
			  JOptionPane.showMessageDialog(null, "Account does not exist! Exiting program.", "", JOptionPane.PLAIN_MESSAGE);
		  }
	      
	}
	
	public static void main(String[] args) {
      MainWindow();
    }
}
