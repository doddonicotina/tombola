package tombola;

import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.plaf.InsetsUIResource;  
    
public class test extends Canvas{  
        public static void main(String[] args) {
            Insets buttonmargin = new InsetsUIResource(0, 0, 0, 0);
            /* 
            ImageIcon doddoImage = new ImageIcon("p3.png");
            JLabel label = new JLabel(doddoImage);
            label.setBounds(20, 20, 200, 200);
            */
            JFrame f= new JFrame("Tombola");  
            f.setBackground(Color.white);

            JLabel tombola,scelta,ncartelle;
            tombola=new JLabel("Tombola");  
            
            tombola.setBounds(20,0, 400,80);  
            tombola.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 50));

            scelta=new JLabel("Vuoi giocare con le cartelle o con il tombolone?");
            scelta.setBounds(20,80, 900,50);  
            scelta.setFont(new Font(Font.SANS_SERIF, Font.BOLD,25));

            ncartelle = new JLabel("Quante cartelle vuoi usare ");
            ncartelle.setBounds(20,120,300,50);  
            ncartelle.setFont(new Font(Font.SANS_SERIF, Font.PLAIN,15));
            ncartelle.setVisible(false);
            
            JButton bu = new JButton("Ok");
            bu.setBounds(400, 120, 50, 50);
            bu.setMargin(buttonmargin);
            bu.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 15));
            bu.setBackground(Color.WHITE);
            bu.setVisible(false);
           
            final DefaultListModel<String> l1 = new DefaultListModel<>(); 
            l1.addElement("1");  
            l1.addElement("2");  
            l1.addElement("3"); 
            final JList<String> list1 = new JList<>(l1);
            list1.setBounds(250, 120, 100, 55);
            list1.setVisible(false);
             
            bu.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {  
                	if (list1.getSelectedValue()=="1")
                	{
                		cartella c = new cartella();
                	}else if(list1.getSelectedValue()=="2")
                    {
                        cartella a = new cartella();
                        cartella b = new cartella();
                    }else if(list1.getSelectedValue()=="3")
                    {
                        cartella a = new cartella();
                        cartella b = new cartella();
                        cartella c = new cartella();
                    }
               	}  
            });

            JButton cartella = new JButton("cartella");
            JButton tombolone = new JButton("tombolone");
            
            cartella.setMargin(buttonmargin);
            cartella.setBounds(600, 95, 69, 25);
            cartella.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 15));
            cartella.setBackground(Color.WHITE);
            
            cartella.addActionListener(new ActionListener()
            {  
                public void actionPerformed(ActionEvent e)
                {  
                      ncartelle.setVisible(true);
                      list1.setVisible(true);
                      bu.setVisible(true);
                          
                }  
            });  

            tombolone.setMargin(buttonmargin);
            tombolone.setBounds(680, 95, 87, 25);
            tombolone.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 15));
            tombolone.setBackground(Color.WHITE);
            tombolone.addActionListener(new ActionListener()
            {  
                public void actionPerformed(ActionEvent e)
                {  
                      Tombolone t = new Tombolone();
                      
                      
                }  
            });  
           // f.add(label);
            f.add(bu);
            f.add(list1);
            f.add(ncartelle);
           // f.add(num);
            f.add(tombola); 
            f.add(scelta); 
            f.add(cartella);
            f.add(tombolone);
            f.setSize(900,900);  
            f.setLayout(null);  
            f.setVisible(true);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }  
  
}  
