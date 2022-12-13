import java.awt.*;
import java.awt.event.*;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.plaf.InsetsUIResource;  
    
public class test extends Canvas{  
        public static void main(String[] args) { 
            Insets buttonmargin = new InsetsUIResource(0, 0, 0, 0);

            JFrame f= new JFrame("Tombola");  
            f.setBackground(Color.white);

            JLabel tombola,scelta,ncartelle;
            tombola=new JLabel("Tombola");  
            
            tombola.setBounds(20,0, 400,80);  
            tombola.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 50));

            scelta=new JLabel("Vuoi giocare con le cartelle o con il tombolone?");
            scelta.setBounds(20,80, 900,50);  
            scelta.setFont(new Font(Font.SANS_SERIF, Font.BOLD,25));

            ncartelle = new JLabel("Quante cartelle vuoi usare (max: 3)");
            ncartelle.setBounds(20,120,300,50);  
            ncartelle.setFont(new Font(Font.SANS_SERIF, Font.PLAIN,15));
            ncartelle.setVisible(false);
            
            final DefaultListModel<String> l1 = new DefaultListModel<>();  
            l1.addElement("1");  
            l1.addElement("2");  
            l1.addElement("3");  
            l1.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {  
                      int n = Integer.parseInt(num.getText());
                      if (n<=3)
                      {
                        //qua devo mettere le cartelle
                      }
                      else
                      {
                        new alert();
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
                      num.setVisible(true);    
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
                      ncartelle.setVisible(true);  
                      
                }  
            });  


            f.add(ncartelle);
            f.add(num);
            f.add(tombola); 
            f.add(scelta); 
            f.add(cartella);
            f.add(tombolone);
            f.setSize(900,900);  
            f.setLayout(null);  
            f.setVisible(true);  

    }  
  
}  
