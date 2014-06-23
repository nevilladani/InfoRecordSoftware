package infoUI;
import java.io.*;
import java.util.*;
import javax.swing.*;

public class tempData {

	public static ArrayList<Record> list = new ArrayList<Record>();
	public ArrayList<Record> tempList = new ArrayList<Record>();
	public Object[][] rec;
	//String fileName;
	public tempData() 
	{
		
	}
	
	public static void addData(String[] d)
	{
		list.add(new Record(d[0],d[1],d[2],d[3],d[4],d[5],d[6],d[7],d[8],d[9],d[10]));
		//JOptionPane.showMessageDialog(null, "added");
	}
	public void store()
	{
				 
		try {
 
			String sCurrentLine;
			String[] entry;
			File f = new File("data.txt");
			BufferedReader  br = new BufferedReader(new FileReader(f));
 
			while ((sCurrentLine = br.readLine()) != null) 
			{
				
	            entry = sCurrentLine.split("@");
	            if(entry.length != 0)
	            {
	    			
	            	
	            	addData(entry);
	            }
	        }
			br.close();
 
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	    
	}
	public void search(String[] se)
	{
		//JOptionPane.showMessageDialog(null, String.valueOf(se[0])+"  " + String.valueOf(se[2]));
		
		if((se[0].trim()).equalsIgnoreCase("") && (se[2].trim()).equalsIgnoreCase(""))
		{
			for(int i=0;i<list.size();i++)
			{
				tempList.add(list.get(i));
			}
		}
		else if((se[2].trim()).equalsIgnoreCase(""))
		{
			for(int i=0;i<list.size();i++)
			{
				if(list.get(i).getFname().trim().equalsIgnoreCase(se[0].trim()) ) //&& list.get(i).getMName()==se[1] && list.get(i).getLname()==se[2] && list.get(i).getCity()==se[5] && list.get(i).getState() ==se[6] && list.get(i).getZip()==se[7]&& list.get(i).getPh()==se[8] )
				{
					tempList.add(list.get(i));
					
				}
			
			}
		}
		else if((se[0].trim()).equalsIgnoreCase(""))
		{
			for(int i=0;i<list.size();i++)
			{
				if(list.get(i).getLname().trim().equalsIgnoreCase(se[2].trim())) //&& list.get(i).getMName()==se[1] && list.get(i).getLname()==se[2] && list.get(i).getCity()==se[5] && list.get(i).getState() ==se[6] && list.get(i).getZip()==se[7]&& list.get(i).getPh()==se[8] )
				{
					tempList.add(list.get(i));
					
				}
			
			}
		}
		else
		{
			for(int i=0;i<list.size();i++)
			{
				if(list.get(i).getLname().trim().equalsIgnoreCase(se[2].trim()) && list.get(i).getFname().trim().equalsIgnoreCase(se[0].trim())) //&& list.get(i).getMName()==se[1] && list.get(i).getLname()==se[2] && list.get(i).getCity()==se[5] && list.get(i).getState() ==se[6] && list.get(i).getZip()==se[7]&& list.get(i).getPh()==se[8] )
				{
					tempList.add(list.get(i));
					
				}
				//JOptionPane.showMessageDialog(null, String.valueOf(list.get(i).getFname().trim())+String.valueOf(list.get(i).getLname().trim()));
			}
		}
		
		
		rec = new Object[tempList.size()][11];
		
		for(int i=0;i<tempList.size();i++)
		{

				rec[i][0] = tempList.get(i).getFname();
				rec[i][1] = tempList.get(i).getMName();
				rec[i][2] = tempList.get(i).getLname();
				rec[i][3] = tempList.get(i).getAdd1();
				rec[i][4] = tempList.get(i).getAdd2();
				rec[i][5] = tempList.get(i).getCity();
				rec[i][6] = tempList.get(i).getState();
				rec[i][7] = tempList.get(i).getZip();
				rec[i][8] = tempList.get(i).getPh();
				rec[i][9] = tempList.get(i).getCntry();
				rec[i][10] = tempList.get(i).getEml();
				
				
		}
		
		
	}
	public static boolean check(String[] ck)
	{
		boolean flag = true;
		for(int i=0;i<list.size();i++)
		{
			if((list.get(i).getFname().trim()).equalsIgnoreCase(ck[0].trim())  && (list.get(i).getLname().trim()).equalsIgnoreCase(ck[2].trim()))
			{
				flag = false;
				//JOptionPane.showMessageDialog(null, "false");
				break;
				
			}
		}
		return flag;
		
	}

}
