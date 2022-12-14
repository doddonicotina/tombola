package tombola;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.plaf.InsetsUIResource;  
public class cartella {
	
	int [][] cartella = new int [3][9];
	JButton[][] ma = new JButton[3][9];
	ImageIcon doddo = new ImageIcon ("doddo.png");
	ImageIcon gio = new ImageIcon ("gio.png");
	



	JFrame f = new JFrame ("Cartella");
	Random rand = new Random();
	int []numeri=new int[15];
	int contatore=0;
	
	public cartella() 
	{
		for (int i = 0; i<3; i++)
		{
			for (int j = 0; j<9; j++)
			{
				cartella[i][j]=0;
			}
		}
		
		for (int i = 0; i<3; i++)
		{	

			int [] vet = sceltaBuchi();
			
			for (int j = 0; j<vet.length; j++)
			{
				int num = 0;
					if(vet[j]==0){
						do 
						{
							num=rand.nextInt(1,9);
						}while (contains(numeri, num));
						
						cartella[i][vet[j]]=num;
						numeri[contatore]=num;
						contatore++;
						}
					else 
					{
						do 
						{
							num=rand.nextInt(vet[j]*10, vet[j]*10+9);
						}while (contains(numeri, num));
						
						cartella[i][vet[j]]=num;
						numeri[contatore]=num;
						contatore++;
					}
					
			}
		
		}
		Insets buttonmargin = new InsetsUIResource(0, 0, 0, 0);
        for (int i=0; i<3;i++) {
        	for (int j=0; j<9; j++) {
        		ma[i][j] = new JButton();
        		ma[i][j].setMargin(buttonmargin);
        		ma[i][j].setFont(new Font(Font.SANS_SERIF, Font.BOLD, 15));
        		ma[i][j].setBackground(Color.WHITE);
				if (cartella[i][j]==0)
				{
					ma[i][j].setText("");

				}else
				{
        		ma[i][j].setText(Integer.toString(cartella[i][j]));
				}
				int x = i;
				int y = j;
				Random n = new Random();
				ma[i][j].addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{  

						System.out.println("ss");
						
						if (n.nextBoolean())
						{
							ma[x][y].setText("");
							ma[x][y].setIcon(doddo);	
						}else
						{
							ma[x][y].setText("");
							ma[x][y].setIcon(gio);
						}
						
						
					}  
				});
        		f.add(ma[i][j]);
        	}
			f.setBackground(Color.white);
			f.setSize(900,400);  
			f.setVisible(true);  
			f.setLayout(new GridLayout(3,8));
	}
	}
	
	public int[] sceltaBuchi()
	{
		int [] vet = new int[5];
		for (int i=0; i<vet.length;i++)
		{
			vet[i]=-1;
		}
		int var=0;
		for (int i=0; i<vet.length;i++)
		{
			do {
				var= rand.nextInt(9);
			}while (contains(vet, var));
			vet[i]=var;
		}
		
		return vet;
	}
	
	public void print()
	{
        for (int i = 0; i < cartella.length; i++) {
        	
        	
        	System.out.println("+-------+-------+-------+-------+-------+-------+-------+-------+-------+");
            for (int j = 0; j < cartella[i].length; j++)
            {
            	System.out.printf("|");
                System.out.printf(cartella[i][j] + "\t");
            } 
            System.out.println("|");
	}
        System.out.println("+-------+-------+-------+-------+-------+-------+-------+-------+-------+");
        }
	
	public boolean contains(int vet[],int rand)
	{
		for (int i=0;i<vet.length;i++)
		{
			 if (vet[i] == rand)
			 {
				 return true;
			 }
		}
		return false;
	}
}


