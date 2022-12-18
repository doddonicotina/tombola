package tombola;
import java.util.*;
import java.awt.*;
import java.awt.event.*;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.plaf.InsetsUIResource;  

public class Tombolone {
	int [][] cartella = new int [9][10];
	JButton [][] tombolone = new JButton [9][10];
	JFrame f = new JFrame ("Tombolone");
	Insets buttonmargin = new InsetsUIResource(0, 0, 0, 0);
	Vector<Integer> vet = new Vector<Integer>(90);
	JFrame fr = new JFrame ("generatore");
	JButton genera = new JButton ("genera");
	JLabel n = new JLabel("");
	Random nr = new Random();
	int a;
	
	public Tombolone() {
		tasto();
		 for (int i=0 ;i<9; i++) {
			 for (int j=0 ;j<10; j++) {
				 cartella[i][j]=i*10+(1+j);
				 tombolone[i][j] = new JButton();
				 tombolone[i][j].setMargin(buttonmargin);
        		 tombolone[i][j].setFont(new Font(Font.SANS_SERIF, Font.BOLD, 15));
        		 tombolone[i][j].setBackground(Color.WHITE);
				 tombolone[i][j].setText(Integer.toString(cartella[i][j]));
				f.add(tombolone[i][j]);
			 } 
		 }
		 
		 f.setBackground(Color.white);
		 f.setSize(900,1000);  
		 f.setVisible(true);  
		 f.setLayout(new GridLayout(9,10));
	}
	public void print()
	{
        for (int i = 0; i < cartella.length; i++) {
        	
        	
        	System.out.println("+-------+-------+-------+-------+-------+-------+-------+-------+-------+-------+");
            for (int j = 0; j < cartella[i].length; j++)
            {
            	System.out.printf("|");
                System.out.printf(cartella[i][j] + "\t");
            } 
            System.out.println("|");
	}
        System.out.println("+-------+-------+-------+-------+-------+-------+-------+-------+-------+-------+");
        }
	
	public void tasto() {
		genera.setBounds(20, 20, 230, 50);
        genera.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 15));
        genera.setBackground(Color.WHITE);
        genera.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{  
                        
                        do{
							a = nr.nextInt(1, 90);
							vet.add(a);
						}while(vet.contains(a));
						n.setText(Integer.toString(a));
						n.setBounds(150, 100, 230, 100);
        				n.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 15));
						for (int i=0 ;i<9; i++) {
							for (int j=0 ;j<10; j++) {
								if (cartella[i][j]==a)
								{
									tombolone[i][j].setBackground(Color.GREEN);
								}									
							}
						}
						

					}  
				});
			fr.setBackground(Color.white);
            fr.add(genera);
            fr.add(n);
			fr.setSize(300, 200);
			fr.setLayout(null);
			fr.setVisible(true);
		
			
		
	}
}
