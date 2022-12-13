import java.util.*;

import javax.swing.JButton;
import java.awt.*;
import java.awt.event.*;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.plaf.InsetsUIResource;  
public class Cartella {
	
	public int [][] cartella = new int [3][9];
	Random rand = new Random();
	int []numeri=new int[15];
	int contatore=0;
	
	public Cartella() 
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
							num=rand.nextInt();
						}while (contains(numeri, num));
						
						cartella[i][vet[j]]=num;
						numeri[contatore]=num;
						contatore++;
					}
					
			}
		
		}
        
        JButton btn1 = new JButton(Integer.toString(cartella[0][0]));    
        JButton btn2 = new JButton(cartella[0][1]);    
        JButton btn3 = new JButton(cartella[0][2]);    
        JButton btn4 = new JButton(cartella[0][3]);    
        JButton btn5 = new JButton(cartella[0][4]);    
        JButton btn6 = new JButton(cartella[0][5]);    
        JButton btn7 = new JButton(cartella[0][6]);    
        JButton btn8 = new JButton(cartella[0][7]);    
        JButton btn9 = new JButton(cartella[0][8]);
        JButton btn10 = new JButton(cartella[0][9]);    
        JButton btn11 = new JButton(cartella[1][0]);    
        JButton btn12 = new JButton(cartella[1][1]);    
        JButton btn13 = new JButton(cartella[1][2]);    
        JButton btn14 = new JButton(cartella[1][3]);    
        JButton btn15 = new JButton(cartella[1][4]);    
        JButton btn16 = new JButton(cartella[1][5]);    
        JButton btn17 = new JButton(cartella[1][6]);    
        JButton btn18 = new JButton(cartella[1][7]);
        JButton btn19 = new JButton(cartella[1][8]);    
        JButton btn20 = new JButton(cartella[1][9]);    
        JButton btn21 = new JButton(cartella[2][0]);    
        JButton btn22 = new JButton(cartella[2][1]);    
        JButton btn23 = new JButton(cartella[2][2]);    
        JButton btn24 = new JButton(cartella[2][3]);    
        JButton btn25 = new JButton(cartella[2][4]);    
        JButton btn26 = new JButton(cartella[2][5]);    
        JButton btn27 = new JButton(cartella[2][6]);
        JButton btn28 = new JButton(cartella[2][7]);
        JButton btn29 = new JButton(cartella[2][8]);
        JButton btn30 = new JButton(cartella[2][9]);
        
	
	
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

   
 
