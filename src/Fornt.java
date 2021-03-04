import java.awt.Color;
import java.awt.Container;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Fornt extends JFrame {
	
	private Container Fc;
	private ImageIcon Picon;
	private JLabel nlabel;
	private JButton btn1,btn2;

	Fornt(){
		component();
		
	}
	
	public void component()
	{
		
		//front menu color
		Fc=this.getContentPane();
		Fc.setLayout(null);
		Fc.setBackground(Color.ORANGE);
		//menu button 
		btn1=new JButton("Menu");
		btn1.setBounds(0, 100, 80, 50);
		Fc.add(btn1);
		//About button
		btn2=new JButton("About");
		btn2.setBounds(0, 200, 80, 50);
		Fc.add(btn2);
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent argO) {
				// TODO Auto-generated method stub
				
				MenuButton a=new MenuButton();
				a.setBounds(200, 200, 400, 500);
				a.setVisible(true);
				
			}
		});
		
		
		Picon=new ImageIcon(getClass().getResource("16579b13f4681d7.jpg"));
		nlabel=new JLabel(Picon);
		nlabel.setBounds(100, 0, 500,500);
		Fc.add(nlabel);
		
	}

	public static void main(String[]arg) {
		Fornt frame=new Fornt();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(200, 200, 400, 500);
		frame.setTitle("Prison Management System" );
		frame.setResizable(false);
		}	
}
