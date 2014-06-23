package infoUI;
import javax.swing.*;

import java.awt.Toolkit;
import java.io.*;
import java.util.*;

public class CustomerData {

	private static InterfacePanel frame;
	public static void main(String[] args) 
	{
		
		tempData td = new tempData();
		
		td.store();
		frame = new InterfacePanel();
		Toolkit tk = Toolkit.getDefaultToolkit();  
		int xSize = ((int) tk.getScreenSize().getWidth());  
		int ySize = ((int) tk.getScreenSize().getHeight());  
		frame.setSize(xSize-250,ySize-100);
		
		
		//frame.setSize(700,700);
		frame.setLocation(50, 50);
		frame.setTitle("CustomerData");
		frame.setVisible(true);
		//CustomerData d = new CustomerData();
		
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		
		frame.addWindowListener(new java.awt.event.WindowAdapter() {
		    @Override
		    public void windowClosing(java.awt.event.WindowEvent windowEvent) {
		    	
		    /*	if (JOptionPane.showConfirmDialog(frame, 
			            "Do u want to save the changes made in this session?", "Save?", 
			            JOptionPane.YES_NO_OPTION,
			            JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION){
		    			CustomerData.saveFile();
		    			//JOptionPane.showMessageDialog(null, "Saved!");
			        	}
		    */	
		    
		    	CustomerData.saveFile();	
		    	
		        if (JOptionPane.showConfirmDialog(frame, 
		            "Are you sure to close this window?", "Really Closing?", 
		            JOptionPane.YES_NO_OPTION,
		            JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION){
		            System.exit(0);
		        	}
		    }
		});
	}
	
	public static void readData()
	{
		
	}
	
	public static void saveFile()
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
				dataf = infof[0] + "@" + infof[1] + "@" + infof[2] + "@" + infof[3] + "@" + infof[4] + "@" + infof[5] + "@" + infof[6] + "@" + infof[7] + "@" + infof[8]+ "@" + infof[9]+ "@" + infof[10] ;
				
				bufferWritter.write(dataf);
				bufferWritter.newLine();
			}
			bufferWritter.close();

     
		}catch(IOException ex){
			ex.printStackTrace();
		}
	
	}

}
