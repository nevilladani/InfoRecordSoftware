package infoUI;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Button;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;


public class InterfacePanel extends JFrame {
	private JTextField AddLine2;
	private JTextField AddLine1;
	private JTextField City;
	private JTextField State;
	private JTextField Zip;
	private JTextField PhNum;
	private JTable table;
	private JTable table_1;
	private JTable table_2;
	public String p = "";
	private JTextField FirstName2;
	private DefaultTableModel tm;
	
	private tempData ser;
	Object[][] dat;
	private static JScrollPane tableContainer;
	private JTable table_3;
	private JTextField MiddleName;
	private JTextField LastName2;
	
	String firstName;
	String middleName;
	String lastName;
	private JTextField Country;
	private JTextField Email;
	String[] chkName= new String[3];
	
	public InterfacePanel() {
		
	
		
		chkName[0]="";
		chkName[1]="";
		chkName[2]="";
		
		JLabel lblLastAction = new JLabel("Last Action Performed:");
		lblLastAction.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblLastAction.setForeground(new Color(0, 0, 0));
		lblLastAction.setBounds(652, 469, 201, 20);
		getContentPane().add(lblLastAction);
		
		JLabel lblAction = new JLabel("Action");
		lblAction.setBounds(662, 493, 56, 14);
		getContentPane().add(lblAction);
		
		JLabel lblFirstName_1 = new JLabel("First Name:");
		lblFirstName_1.setBounds(662, 510, 91, 14);
		getContentPane().add(lblFirstName_1);
		
		JLabel lblLastName_1 = new JLabel("Last Name:");
		lblLastName_1.setBounds(662, 544, 91, 14);
		getContentPane().add(lblLastName_1);
		
		JLabel lblMiddleInitial = new JLabel("Middle Initial:");
		lblMiddleInitial.setBounds(662, 527, 91, 14);
		getContentPane().add(lblMiddleInitial);
		
		final JLabel lblFieldchk = new JLabel("FieldChk");
		lblFieldchk.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblFieldchk.setBounds(39, 480, 299, 14);
		getContentPane().add(lblFieldchk);
		
		final JLabel lblFieldchk_1 = new JLabel("FieldChk2");
		lblFieldchk_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblFieldchk_1.setBounds(39, 490, 278, 14);
		getContentPane().add(lblFieldchk_1);
		
		final JLabel lblModifychk = new JLabel("ModifyChk");
		lblModifychk.setForeground(Color.RED);
		lblModifychk.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblModifychk.setBounds(307, 480, 334, 14);
		getContentPane().add(lblModifychk);
		
		
		final JLabel lblActionvalue = new JLabel("No action performed yet in this session.");
		lblActionvalue.setBounds(745, 493, 252, 14);
		getContentPane().add(lblActionvalue);
		
		final JLabel lblFnamevalue = new JLabel("--");
		lblFnamevalue.setBounds(745, 510, 148, 14);
		getContentPane().add(lblFnamevalue);
		
		final JLabel lblMnamevalue = new JLabel("--");
		lblMnamevalue.setBounds(745, 527, 148, 14);
		getContentPane().add(lblMnamevalue);
		
		final JLabel lblLnamevalue = new JLabel("--");
		lblLnamevalue.setBounds(745, 544, 148, 14);
		getContentPane().add(lblLnamevalue);
		
		
		final JLabel lblMode = new JLabel("Mode:");
		lblMode.setForeground(new Color(0, 0, 0));
		lblMode.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMode.setBounds(652, 569, 65, 20);
		getContentPane().add(lblMode);
		
		final JLabel lblModifyDelete = new JLabel("Modify / Delete");
		lblModifyDelete.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblModifyDelete.setForeground(new Color(0, 0, 128));
		lblModifyDelete.setBounds(694, 574, 119, 14);
		getContentPane().add(lblModifyDelete);
		
		final JLabel lblSave = new JLabel("Save");
		lblSave.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSave.setForeground(new Color(0, 0, 128));
		lblSave.setBounds(702, 574, 46, 14);
		getContentPane().add(lblSave);
		
		lblModifyDelete.setEnabled(true);
		//lblSave.setEnabled(true);
		lblModifyDelete.setForeground(Color.WHITE);
		lblSave.setForeground(new Color(0,0,128));
		
		
		lblModifyDelete.setLocation((lblMode.getX()+50),(lblMode.getY()+30));
		lblSave.setLocation((lblMode.getX()+50),(lblMode.getY()+5));
		
		
		getContentPane().setBackground(Color.WHITE);
		
		Toolkit tk = Toolkit.getDefaultToolkit();  
		int xSize = ((int) tk.getScreenSize().getWidth());  
		int ySize = ((int) tk.getScreenSize().getHeight());
		setBackground(new Color(191, 205, 219));
		getContentPane().setLayout(null);
		int tsize = tempData.list.size();
		
		
		
		
		
		final JLabel fNameL = new JLabel("Max Character Length Reached");
		fNameL.setFont(new Font("Tahoma", Font.PLAIN, 10));
		fNameL.setForeground(Color.WHITE);
		fNameL.setBounds(39, 100, 201, 14);
		getContentPane().add(fNameL);
		
		JLabel lblFirstName = new JLabel("First Name(20) *");
		lblFirstName.setBounds(39, 64, 95, 14);
		getContentPane().add(lblFirstName);
		
		FirstName2 = new JTextField();
		FirstName2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				fNameL.setForeground(Color.WHITE);
				
			}
			@Override
			public void focusGained(FocusEvent e) {
				fNameL.setLocation(FirstName2.getX(), (FirstName2.getY()+20));
				
				
				
			}
		});
		FirstName2.setBounds(38, 80, 183, 20);
		getContentPane().add(FirstName2);
		
		FirstName2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				fNameL.setForeground(Color.WHITE);
				if(FirstName2.getText().length() > 19 )
				{
					fNameL.setForeground(Color.RED);
					FirstName2.setText(FirstName2.getText().substring(0,20));
					
					
					
				}
				lblFieldchk.hide();
				lblFieldchk_1.hide();
				lblModifychk.hide();
				
				
			}
	
			@Override
			public void keyReleased(KeyEvent e) {
				fNameL.setForeground(Color.WHITE);
				if(FirstName2.getText().length() > 19 )
				{
					fNameL.setForeground(Color.RED);
					//FirstName2.setText(FirstName2.getText().substring(0,10));
						
				}
				FirstName2.setText(FirstName2.getText().substring(0,20));
				
				if(FirstName2.getText().length()<4 )
				{
					lblFieldchk.setText("abc");
				}
			}
		});
		FirstName2.setColumns(10);
		
		JLabel lblMiddleName = new JLabel("Middle Initial(1) ");
		lblMiddleName.setBounds(235, 64, 99, 14);
		getContentPane().add(lblMiddleName);
		
		MiddleName = new JTextField();
		MiddleName.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				fNameL.setLocation(MiddleName.getX(), (MiddleName.getY()+20));
			
				
				
			}
			@Override
			public void focusLost(FocusEvent e) {
				fNameL.setForeground(Color.WHITE);
				
				
			}
		});
		MiddleName.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				fNameL.setForeground(Color.WHITE);
				if(MiddleName.getText().length() > 0 )
				{
					fNameL.setForeground(Color.RED);
					MiddleName.setText(MiddleName.getText().substring(0,1));
					
					
				}
				lblFieldchk.hide();
				lblFieldchk_1.hide();
				lblModifychk.hide();
				
				
			}
	
			@Override
			public void keyReleased(KeyEvent e) {
				fNameL.setForeground(Color.WHITE);
				if(MiddleName.getText().length() > 0 )
				{
					fNameL.setForeground(Color.RED);
					//FirstName2.setText(FirstName2.getText().substring(0,10));
						
				}
				MiddleName.setText(MiddleName.getText().substring(0,1));
			}
		});
		
		
		MiddleName.setBounds(231, 80, 148, 20);
		getContentPane().add(MiddleName);
		MiddleName.setColumns(10);
		
		LastName2 = new JTextField();
		LastName2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				fNameL.setForeground(Color.WHITE);
				if(LastName2.getText().length() >19 )
				{
					fNameL.setForeground(Color.RED);
					LastName2.setText(LastName2.getText().substring(0,20));
				
					
				}
				lblFieldchk.hide();
				lblFieldchk_1.hide();
				lblModifychk.hide();
				
				
			}
	
			@Override
			public void keyReleased(KeyEvent e) {
				fNameL.setForeground(Color.WHITE);
				if(LastName2.getText().length() >19 )
				{
					fNameL.setForeground(Color.RED);
					//FirstName2.setText(FirstName2.getText().substring(0,10));
						
				}
				LastName2.setText(LastName2.getText().substring(0,20));
			}
		});
		LastName2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				fNameL.setLocation(LastName2.getX(), (LastName2.getY()+20));
			}
			@Override
			public void focusLost(FocusEvent e) {
				fNameL.setForeground(Color.WHITE);
				
			}
		});
		LastName2.setBounds(391, 80, 183, 20);
		getContentPane().add(LastName2);
		LastName2.setColumns(10);
		
		JLabel lblLastName = new JLabel("Last Name(20) *");
		lblLastName.setBounds(391, 64, 108, 14);
		getContentPane().add(lblLastName);
		
		
		
		
		AddLine1 = new JTextField();
		AddLine1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				fNameL.setLocation(AddLine1.getX(), (AddLine1.getY()+20));
			}
			@Override
			public void focusLost(FocusEvent e) {
				fNameL.setForeground(Color.WHITE);
			}
		});
		AddLine1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				fNameL.setForeground(Color.WHITE);
				if(AddLine1.getText().length() >34 )
				{
					fNameL.setForeground(Color.RED);
					AddLine1.setText(AddLine1.getText().substring(0,35));
						
				}
				
			}
	
			@Override
			public void keyReleased(KeyEvent e) {
				fNameL.setForeground(Color.WHITE);
				if(AddLine1.getText().length() >34 )
				{
					fNameL.setForeground(Color.RED);
					//FirstName2.setText(FirstName2.getText().substring(0,10));
						
				}
				AddLine1.setText(AddLine1.getText().substring(0,35));
			}
		});
		AddLine1.setBounds(39, 133, 535, 20);
		getContentPane().add(AddLine1);
		AddLine1.setColumns(10);
		
	
		JLabel lblAddressLine = new JLabel("Address Line 1(35) *");
		lblAddressLine.setBounds(39, 116, 119, 14);
		getContentPane().add(lblAddressLine);
		
		JLabel lblAdressLine = new JLabel("Address Line 2(35)");
		lblAdressLine.setBounds(39, 174, 108, 14);
		getContentPane().add(lblAdressLine);
		
		AddLine2 = new JTextField();
		AddLine2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				fNameL.setForeground(Color.WHITE);
				if(AddLine2.getText().length() >34 )
				{
					fNameL.setForeground(Color.RED);
					AddLine2.setText(AddLine2.getText().substring(0,35));
						
				}
				
			}
	
			@Override
			public void keyReleased(KeyEvent e) {
				fNameL.setForeground(Color.WHITE);
				if(AddLine2.getText().length() >34 )
				{
					fNameL.setForeground(Color.RED);
					//FirstName2.setText(FirstName2.getText().substring(0,10));
						
				}
				AddLine2.setText(AddLine2.getText().substring(0,35));
			}
		});
		AddLine2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				fNameL.setLocation(AddLine2.getX(), (AddLine2.getY()+20));
			}
			@Override
			public void focusLost(FocusEvent e) {
				fNameL.setForeground(Color.WHITE);
			}
		});
		AddLine2.setBounds(39, 190, 535, 20);
		getContentPane().add(AddLine2);
		AddLine2.setColumns(10);
		
		JLabel lblCity = new JLabel("City(25) *");
		lblCity.setBounds(39, 232, 63, 14);
		getContentPane().add(lblCity);
		
		City = new JTextField();
		City.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				fNameL.setForeground(Color.WHITE);
				if(City.getText().length() >24 )
				{
					fNameL.setForeground(Color.RED);
					City.setText(City.getText().substring(0,25));
						
				}
				
			}
	
			@Override
			public void keyReleased(KeyEvent e) {
				fNameL.setForeground(Color.WHITE);
				if(City.getText().length() >24 )
				{
					fNameL.setForeground(Color.RED);
					//FirstName2.setText(FirstName2.getText().substring(0,10));
						
				}
				City.setText(City.getText().substring(0,25));
			}
		});
		City.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				fNameL.setLocation(City.getX(), (City.getY()+20));
			}
			@Override
			public void focusLost(FocusEvent e) {
				fNameL.setForeground(Color.WHITE);
			}
		});
		City.setBounds(39, 249, 182, 20);
		getContentPane().add(City);
		City.setColumns(10);
		
		JLabel lblState = new JLabel("State(2)*");
		lblState.setBounds(235, 232, 63, 14);
		getContentPane().add(lblState);
		
		State = new JTextField();
		State.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				fNameL.setForeground(Color.WHITE);
				if(State.getText().length() >1 )
				{
					fNameL.setForeground(Color.RED);
					State.setText(State.getText().substring(0,2));
						
				}
				
			}
	
			@Override
			public void keyReleased(KeyEvent e) {
				fNameL.setForeground(Color.WHITE);
				if(State.getText().length() >1 )
				{
					fNameL.setForeground(Color.RED);
					//FirstName2.setText(FirstName2.getText().substring(0,10));
						
				}
				State.setText(State.getText().substring(0,2));
			}
		});
		State.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				fNameL.setLocation(State.getX(), (State.getY()+20));
			}
			@Override
			public void focusLost(FocusEvent e) {
				fNameL.setForeground(Color.WHITE);
			}
		});
		State.setBounds(231, 249, 148, 20);
		getContentPane().add(State);
		State.setColumns(10);
		

		PhNum = new JTextField();
		PhNum.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				fNameL.setForeground(Color.WHITE);
				if(PhNum.getText().length() >20 )
				{
					fNameL.setForeground(Color.RED);
					PhNum.setText(PhNum.getText().substring(0,21));
						
				}
				
			}
	
			@Override
			public void keyReleased(KeyEvent e) {
				fNameL.setForeground(Color.WHITE);
				if(PhNum.getText().length() >20 )
				{
					fNameL.setForeground(Color.RED);
					//FirstName2.setText(FirstName2.getText().substring(0,10));
						
				}
				PhNum.setText(PhNum.getText().substring(0,21));
			}
		});
		PhNum.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				fNameL.setLocation(PhNum.getX(), (PhNum.getY()+20));
			}
			@Override
			public void focusLost(FocusEvent e) {
				fNameL.setForeground(Color.WHITE);
			}
		});
		PhNum.setBounds(391, 310, 183, 20);
		getContentPane().add(PhNum);
		PhNum.setColumns(10);
		
		JLabel lblPhNumber = new JLabel("Phone Number(21) *");
		lblPhNumber.setBounds(401, 293, 119, 14);
		getContentPane().add(lblPhNumber);
		
		Country = new JTextField();
		Country.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				fNameL.setForeground(Color.WHITE);
				if(Country.getText().length() >29 )
				{
					fNameL.setForeground(Color.RED);
					Country.setText(Country.getText().substring(0,30));
						
				}
				
			}
	
			@Override
			public void keyReleased(KeyEvent e) {
				fNameL.setForeground(Color.WHITE);
				if(Country.getText().length() >29 )
				{
					fNameL.setForeground(Color.RED);
					//FirstName2.setText(FirstName2.getText().substring(0,10));
						
				}
				Country.setText(Country.getText().substring(0,30));
			}
		});
		Country.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				fNameL.setLocation(Country.getX(), (Country.getY()+20));
			}
			@Override
			public void focusLost(FocusEvent e) {
				fNameL.setForeground(Color.WHITE);
			}
		});
		Country.setBounds(39, 310, 340, 20);
		getContentPane().add(Country);
		Country.setColumns(10);
		
		JLabel lblCountry = new JLabel("Country(30) *");
		lblCountry.setBounds(39, 293, 86, 14);
		getContentPane().add(lblCountry);
		
		
		
		
		
		Email = new JTextField();
		Email.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				fNameL.setForeground(Color.WHITE);
				if(Email.getText().length() >99 )
				{
					fNameL.setForeground(Color.RED);
					Email.setText(Email.getText().substring(0,100));
						
				}
				
			}
	
			@Override
			public void keyReleased(KeyEvent e) {
				fNameL.setForeground(Color.WHITE);
				if(Email.getText().length() >99 )
				{
					fNameL.setForeground(Color.RED);
					//FirstName2.setText(FirstName2.getText().substring(0,10));
						
				}
				Email.setText(Email.getText().substring(0,100));
			}
		});
		Email.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				fNameL.setLocation(Email.getX(), (Email.getY()+20));
			}
			@Override
			public void focusLost(FocusEvent e) {
				fNameL.setForeground(Color.WHITE);
			}
		});
		Email.setBounds(39, 372, 535, 20);
		getContentPane().add(Email);
		Email.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email(100) *");
		lblEmail.setBounds(39, 354, 99, 14);
		getContentPane().add(lblEmail);
		
		Zip = new JTextField();
		Zip.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				fNameL.setForeground(Color.WHITE);
				if(Zip.getText().length() >8 )
				{
					fNameL.setForeground(Color.RED);
					Zip.setText(Zip.getText().substring(0,9));
						
				}
				
			}
	
			@Override
			public void keyReleased(KeyEvent e) {
				fNameL.setForeground(Color.WHITE);
				if(Zip.getText().length() >8 )
				{
					fNameL.setForeground(Color.RED);
					//FirstName2.setText(FirstName2.getText().substring(0,10));
						
				}
				Zip.setText(Zip.getText().substring(0,9));
			}
		});
		Zip.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				fNameL.setLocation(Zip.getX(), (Zip.getY()+20));
				
				
			}
			@Override
			public void focusLost(FocusEvent e) {
				fNameL.setForeground(Color.WHITE);
			}
		});
		Zip.setBounds(391, 249, 183, 20);
		getContentPane().add(Zip);
		Zip.setColumns(10);
		
		JLabel lblZip = new JLabel("Zip(9) *");
		lblZip.setBounds(391, 232, 69, 14);
		getContentPane().add(lblZip);
		
		
		
		
		
		
		
		
		
		////// Length Validation ///////////
		
		
		
		
		
		
		
		
		
		
		//////////////////////////////////////
		
		
		
		//// Clear Selection //////////////
		/*
		JButton btnClearSelection = new JButton("Clear Selection");
		btnClearSelection.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				table_3.getSelectionModel().clearSelection();
			}
		});
		btnClearSelection.setBounds(734, 235, 113, 23);
		getContentPane().add(btnClearSelection);
		
		*/
		////////////////////////////////////////
		
		
	//////Modify Button //////////
		
			final JButton btnModify = new JButton("Modify");
			btnModify.setEnabled(false);
			btnModify.setBounds(235, 446, 138, 23);
			getContentPane().add(btnModify);
		
			///////////////////////////////
		
	//////AddMode Button //////////////
			
			final JButton btnAddMode = new JButton("Deselect Row");
			btnAddMode.setEnabled(false);
	//////////////////////////////////////
			
	//////Delete Button /////////////////
			
			final JButton btnDelete = new JButton("Delete");
			btnDelete.setBounds(436, 446, 138, 23);
			getContentPane().add(btnDelete);
			
	/////////////////////////////////////
		
		///  Search //////////////////		
		
		
		final JButton btnSearch = new JButton("Search");
		btnSearch.setBounds(235, 511, 138, 23);
		getContentPane().add(btnSearch);
		
		btnSearch.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				table_3.getSelectionModel().clearSelection();
				//btnModify.setEnabled(false);
				//btnDelete.setEnabled(false);
				btnAddMode.doClick();
				String[] se = new String[11];
				
				se[0] = FirstName2.getText().trim();
				se[1] = MiddleName.getText().trim();
				se[2] = LastName2.getText().trim();
				se[3] = AddLine2.getText().trim();
				se[4] = AddLine1.getText().trim();
				se[5] = City.getText().trim();
				se[6] = State.getText().trim();
				se[7] = Zip.getText().trim();
				se[8] = PhNum.getText().trim();
				se[9] = Country.getText().trim();
				se[10] = Email.getText().trim();
				
				
				ser = new tempData();
				ser.search(se);
				dat = ser.rec;
				
				tm.addRow(new Object[] {" "," ", " "," "});
				
				tm.getDataVector().removeAllElements();
				for(int i =0;i<ser.tempList.size(); i++)
				{
					tm.addRow(new Object[] {dat[i][0],dat[i][1],dat[i][2],dat[i][8]});
				}
				
				//JOptionPane.showMessageDialog(null, "searched");
				
				lblFieldchk.hide();
				lblFieldchk_1.hide();
				lblModifychk.hide();
				
			}
		});
		

		btnSearch.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
	                // delete row method (when "delete" is pressed)
					//JOptionPane.showMessageDialog(null, "Search pressed");
					btnSearch.doClick();
	            }
			}
		});
		
		/////////////////////////////
		
		
		
		
		// Table ///////////////////////
		table_3 = new JTable();
		table_3.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
						"First Name", "MI", "Last Name", "Phone Num"
				}
			) {
				boolean[] columnEditables = new boolean[] {
					false, false, false
				};
				public boolean isCellEditable(int row, int column) {
					return columnEditables[column];
				}
			});
		
		
		tm = (DefaultTableModel) table_3.getModel();
		tableContainer = new JScrollPane(table_3);
		
	    tableContainer.setLocation(630, 46);
	    tableContainer.setSize(442, 322);
	        
		getContentPane().add(tableContainer);
		
		table_3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				
				{
			 		int row = table_3.getSelectedRow();
			 		
			 		FirstName2.setText(dat[row][0].toString().trim());
			 		MiddleName.setText(dat[row][1].toString().trim());
			 		LastName2.setText(dat[row][2].toString().trim());
					AddLine1.setText(dat[row][3].toString().trim());
					AddLine2.setText(dat[row][4].toString().trim());
					City.setText(dat[row][5].toString().trim());
					State.setText(dat[row][6].toString().trim());
					Zip.setText(dat[row][7].toString().trim());
					PhNum.setText(dat[row][8].toString().trim());
					Country.setText(dat[row][9].toString().trim());
					Email.setText(dat[row][10].toString().trim());
					
					
					firstName = FirstName2.getText().trim();
					middleName = MiddleName.getText().trim();
					lastName = LastName2.getText().trim();
					btnModify.setEnabled(true);
					btnDelete.setEnabled(true);
					btnAddMode.setEnabled(true);
					lblFieldchk.hide();
					lblFieldchk_1.hide();
					lblModifychk.hide();
					
					lblModifyDelete.setEnabled(true);
					//lblSave.setEnabled(false);
					lblModifyDelete.setLocation((lblMode.getX()+50),(lblMode.getY()+5));
					lblSave.setLocation((lblMode.getX()+50),lblMode.getY()+30);
					lblModifyDelete.setForeground(new Color(0,0,128));
					lblSave.setForeground(Color.WHITE);
			 		}
			}
			@Override
			public void keyPressed(KeyEvent e) 
			{
				
				if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
	                
					btnAddMode.doClick();
				}
			}
		});
		
		
		 table_3.addMouseListener(new MouseAdapter() {
			 	@Override
			 	public void mouseClicked(MouseEvent arg0) 
			 	{
			 		
			 		int row = table_3.getSelectedRow();
			 		
			 		FirstName2.setText(dat[row][0].toString().trim());
			 		MiddleName.setText(dat[row][1].toString().trim());
			 		LastName2.setText(dat[row][2].toString().trim());
					AddLine1.setText(dat[row][3].toString().trim());
					AddLine2.setText(dat[row][4].toString().trim());
					City.setText(dat[row][5].toString().trim());
					State.setText(dat[row][6].toString().trim());
					Zip.setText(dat[row][7].toString().trim());
					PhNum.setText(dat[row][8].toString().trim());
					Country.setText(dat[row][9].toString().trim());
					Email.setText(dat[row][10].toString().trim());
					
					
					firstName = FirstName2.getText().trim();
					middleName = MiddleName.getText().trim();
					lastName = LastName2.getText().trim();
					btnModify.setEnabled(true);
					btnDelete.setEnabled(true);
					btnAddMode.setEnabled(true);
					lblFieldchk.hide();
					lblFieldchk_1.hide();
					lblModifychk.hide();
					
					lblModifyDelete.setEnabled(true);
					//lblSave.setEnabled(false);
					lblSave.setLocation((lblMode.getX()+50),(lblMode.getY()+30));
					lblModifyDelete.setLocation((lblMode.getX()+50),(lblMode.getY()+5));
					
					lblModifyDelete.setForeground(new Color(0,0,128));
					lblSave.setForeground(Color.WHITE);
			 	}
			 });
		 
		 
	///////////////////////////////
	
		 
		 
		 
		 
		 
	//// Clear ////////////////////
			
			final JButton btnClear = new JButton("Clear Fields");
			btnClear.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					FirstName2.setText("");
			 		MiddleName.setText("");
			 		LastName2.setText("");
					AddLine2.setText("");
					AddLine1.setText("");
					City.setText("");
					State.setText("");
					Zip.setText("");
					PhNum.setText("");
					Country.setText("");
					Email.setText("");
					
					lblFieldchk.hide();
					lblFieldchk_1.hide();
					lblModifychk.hide();
				}
			});
			btnClear.setBounds(39, 511, 139, 23);
			getContentPane().add(btnClear);
			
			
		////////////////////////////////
			
		 

			
			
			
		/////  GetAllRecords ///////////
			
			
			final JButton btnGetAllRecords = new JButton("Show All Records");
			btnGetAllRecords.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					btnClear.doClick();
					btnSearch.doClick();
				}
			});
			btnGetAllRecords.setBounds(436, 511, 138, 23);
			getContentPane().add(btnGetAllRecords);
			
			btnGetAllRecords.doClick();
			
			
		////////////////////////////////
		 
			
			
		 
		 
		 
		//// Delete  //////////////////
			
		
		
		btnDelete.setEnabled(false);
		btnDelete.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) 
			{
				
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
	                
					btnDelete.doClick();
				}
			}
		});
		

		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				for(int i =0;i<tempData.list.size();)
				{
					if(((tempData.list.get(i).getFname().trim()).equalsIgnoreCase(FirstName2.getText().trim())) && ((tempData.list.get(i).getMName().trim()).equalsIgnoreCase(MiddleName.getText().trim())) &&  ((tempData.list.get(i).getLname().trim()).equalsIgnoreCase(LastName2.getText().trim())))
					{
						//JOptionPane.showMessageDialog(null, String.valueOf(tempData.list.get(i).getFname()));
						tempData.list.remove(i);
					}
					else
						i++;
				}
				
				//JOptionPane.showMessageDialog(null, "deleted");
				tm.getDataVector().removeAllElements();
				table_3.getSelectionModel().clearSelection();
				btnGetAllRecords.doClick();
				
				lblLnamevalue.setText(lastName);
				lblMnamevalue.setText(middleName);
				lblFnamevalue.setText(firstName);
				lblActionvalue.setText("Deleted");
				lblActionvalue.setForeground(new Color(165,42,42));
				lblFieldchk.hide();
				lblFieldchk_1.hide();
				lblModifychk.hide();
			}
		});
		
		
		////////////////////////////////

		
		
		
		
		
		//////AddMode/////////////////////
		
		btnAddMode.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				table_3.getSelectionModel().clearSelection();
				btnModify.setEnabled(false);
				btnDelete.setEnabled(false);
				lblFieldchk.hide();
				lblFieldchk_1.hide();
				lblModifychk.hide();
				btnAddMode.setEnabled(false);
				
				//lblModifyDelete.setEnabled(true);
				//lblSave.setEnabled(true);
				//lblSave.setForeground(new Color(0,0,128));
				lblModifyDelete.setLocation((lblMode.getX()+50),(lblMode.getY()+30));
				lblSave.setLocation((lblMode.getX()+50),(lblMode.getY()+5));
				//lblModifyDelete.setForeground(new Color(0,0,));
				
				lblSave.setForeground(new Color(0,0,128));
				lblModifyDelete.setForeground(Color.WHITE);
			}
		});
		btnAddMode.setBounds(649, 383, 138, 23);
		getContentPane().add(btnAddMode);
		
		
		
		
		
		///// Save  ////////////////////
		
		lblFieldchk.hide();
		lblFieldchk_1.hide();
		
		
		final JButton btnSave = new JButton("Add Record");
		btnSave.setBounds(39, 446, 138, 23);
		getContentPane().add(btnSave);
		
		JLabel lblSelectTheRow = new JLabel("Select any row in table to enter Modify/ Delete mode.");
		lblSelectTheRow.setBounds(39, 414, 421, 14);
		getContentPane().add(lblSelectTheRow);
		
		JLabel lblPressTheSave = new JLabel("Press the \"Deselect Row\" button to exit Modify/Delete Mode.");
		lblPressTheSave.setBounds(652, 417, 358, 14);
		getContentPane().add(lblPressTheSave);
		
		JLabel lblInfor = new JLabel("Information Recording Software");
		lblInfor.setForeground(new Color(0, 0, 139));
		lblInfor.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblInfor.setBounds(39, 23, 421, 30);
		getContentPane().add(lblInfor);
		
		JLabel lblOrSimplyPress = new JLabel("OR simply press \"Escape\" to exit Modify/Delete Mode");
		lblOrSimplyPress.setBounds(652, 433, 340, 14);
		getContentPane().add(lblOrSimplyPress);
		
		JLabel lblUseTheArrow = new JLabel("Use the arrow keys/ click to change  rows selection in Table.");
		lblUseTheArrow.setBounds(652, 448, 385, 14);
		getContentPane().add(lblUseTheArrow);
		
		
		
		
		
		
		
		
		btnSave.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				
				lblFieldchk.hide();
				lblFieldchk_1.hide();
				lblModifychk.hide();
				
				String[] info = new String[11];
				info[0] = FirstName2.getText()+" ";
				info[1] = MiddleName.getText()+" ";
				info[2] = LastName2.getText()+" ";
				info[3] = AddLine1.getText()+" ";
				info[4] = AddLine2.getText()+" ";
				info[5] = City.getText()+" ";
				info[6] = State.getText()+" ";
				info[7] = Zip.getText()+" ";
				info[8] = PhNum.getText()+" ";
				info[9] = Country.getText()+" ";
				info[10] = Email.getText()+" ";
				
				chkName[0]=FirstName2.getText().trim();
				chkName[1]=MiddleName.getText().trim();
				chkName[2]=LastName2.getText().trim();
				//JOptionPane.showMessageDialog(null, String.valueOf(chkName[1]));
				
				
				
				if( ((tempData.check(info)==false) && FirstName2.getText().trim().length()>0)  && (LastName2.getText().trim().length()>0))
				{
					lblFieldchk_1.hide();
					lblFieldchk.show();
					lblFieldchk.setLocation(btnSave.getX(),(btnSave.getY()+25));
					lblFieldchk.setText("The record with that name already exists.");
					lblFieldchk.setForeground(Color.RED);
				
					
					if( (info[0].trim().length() < 1) ||  (info[2].trim().length() < 1)|| (info[3].trim().length() < 1)|| (info[5].trim().length() < 1)|| (info[6].trim().length() < 1)|| (info[7].trim().length() < 1)|| (info[8].trim().length() < 1) || (info[9].trim().length() < 1) || (info[10].trim().length() < 1))
					{
						
						lblFieldchk_1.show();
						lblFieldchk_1.setText("Fields marked with * are required.");
						lblFieldchk_1.setLocation(btnSave.getX(),(btnSave.getY()+40));
						
						if( (info[0].trim().length() < 1))
						{
							
						}
					}
				}
				else
				{
					
					if( (info[0].trim().length() > 0) &&  (info[2].trim().length() > 0)&& (info[3].trim().length() > 0)&& (info[5].trim().length() > 0)&& (info[6].trim().length() > 0)&& (info[7].trim().length() > 0)&& (info[8].trim().length() > 0) && (info[9].trim().length() > 0) && (info[10].trim().length() > 0))
					{
						
						
						if(tempData.check(info)==true)
						{
							tempData.addData(info);
							//JOptionPane.showMessageDialog(null, "Record Added Successfully !");
							btnClear.doClick();
							lblLnamevalue.setText(info[2]);
							lblMnamevalue.setText(info[1]);
							lblFnamevalue.setText(info[0]);
							lblActionvalue.setText("Saved");
							lblActionvalue.setForeground(new Color(0, 128, 0));
							btnGetAllRecords.doClick();
							btnClear.doClick();
						}
				
						
					}
					else
					{
						//JOptionPane.showMessageDialog(null, "Empty Fields");
						lblFieldchk.hide();
						lblFieldchk_1.show();
						lblFieldchk_1.setLocation(btnSave.getX(),(btnSave.getY()+25));
						lblFieldchk_1.setText("Fields marked with * are required. ");
						lblFieldchk_1.setForeground(Color.RED);
					}
				
				}
				
			}
		});
		
		
		
		////////////////////////////////
				
		
		
		
				
		///// Modify ///////////////////
				
		
		lblFieldchk.hide();
		lblFieldchk_1.hide();
		lblModifychk.hide();
		
		btnModify.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
				lblFieldchk.hide();
				lblFieldchk_1.hide();
				lblModifychk.hide();
				
				if( (FirstName2.getText().trim().length() > 0) && (LastName2.getText().trim().length() > 0)&& (AddLine1.getText().trim().length() > 0)&& (City.getText().trim().length() > 0)&& (State.getText().trim().length() > 0)&& (Zip.getText().trim().length() > 0)&& (PhNum.getText().trim().length() > 0) && (Country.getText().trim().length() > 0) && (Email.getText().trim().length() > 0))
				{
					for(int i =0;i<tempData.list.size();i++)
					{
						
						if(((tempData.list.get(i).getFname().trim()).equalsIgnoreCase(firstName.trim())) &&((tempData.list.get(i).getMName().trim()).equalsIgnoreCase(middleName.trim())) && ((tempData.list.get(i).getLname().trim()).equalsIgnoreCase(lastName.trim())))
						{
							tempData.list.get(i).setFname(FirstName2.getText());
							tempData.list.get(i).setMName(MiddleName.getText());
							tempData.list.get(i).setLname(LastName2.getText());
							tempData.list.get(i).setAdd1(AddLine1.getText());
							tempData.list.get(i).setAdd2(AddLine2.getText());
							tempData.list.get(i).setCity(City.getText());
							tempData.list.get(i).setState(State.getText());
							tempData.list.get(i).setZip(Zip.getText());
							tempData.list.get(i).setPh(PhNum.getText());
							tempData.list.get(i).setCntry(Country.getText());
							tempData.list.get(i).setEml(Email.getText());
							break;
						}
					}
					table_3.getSelectionModel().clearSelection();
					btnGetAllRecords.doClick();
					
					lblLnamevalue.setText(lastName);
					lblMnamevalue.setText(middleName);
					lblFnamevalue.setText(firstName);
					lblActionvalue.setText("Modified");
					lblActionvalue.setForeground(new Color(0,0,205));
					
					//btnModify.setEnabled(false);
				}
				else
				{
					lblModifychk.setLocation(btnModify.getX(), (btnModify.getY()+25));
					lblModifychk.show();
					lblModifychk.setText("Fields marked with * are required and can not be empty.");
				}
				
				
			}
		});
		

		
		///////////////////////////////
		
		
	}
	
	public void saveFile()
	{
		try{
    		
			 
			File file =new File("data.txt");

		//if file doesnt exists, then create it
			if(!file.exists()){
				file.createNewFile();
			}

			FileWriter fileWritter = new FileWriter(file.getName(),false);
			BufferedWriter bufferWritter = new BufferedWriter(fileWritter);
			String[] infof = new String[11];
			String dataf;
			for(int i = 0;i<tempData.list.size();i++)
			{
				
				infof[0] = tempData.list.get(i).getFname()+" ";
				infof[1] = tempData.list.get(i).getMName()+" ";
				infof[2] = tempData.list.get(i).getLname()+" ";
				infof[3] = tempData.list.get(i).getAdd1()+" ";
				infof[4] = tempData.list.get(i).getAdd2()+" ";
				infof[5] = tempData.list.get(i).getCity()+" ";
				infof[6] = tempData.list.get(i).getState()+" ";
				infof[7] = tempData.list.get(i).getZip()+" ";
				infof[8] = tempData.list.get(i).getPh()+" ";
				infof[9] = tempData.list.get(i).getCntry()+" ";
				infof[10] = tempData.list.get(i).getEml()+" ";
				
				
				dataf = infof[0] + "@" + infof[1] + "@" + infof[2] + "@" + infof[3] + "@" + infof[4] + "@" + infof[5] + "@" + infof[6] + "@" + infof[7] + "@" + infof[8] +"@"+ infof[9] +"@"+ infof[10];
				
				bufferWritter.write(dataf);
				bufferWritter.newLine();
			}
			bufferWritter.close();

     
		}catch(IOException ex){
			ex.printStackTrace();
		}
	
	}
}

