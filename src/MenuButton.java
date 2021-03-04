import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MenuButton extends JFrame {
	
	private Container Fc;
	private ImageIcon Picon;
	private JLabel nlabel;
	private Font f;
	private JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7;
	 MenuButton(){
		
		component();
		
	}
	
	public void component()
	{
		Fc=this.getContentPane();
		Fc.setLayout(null);
		Fc.setBackground(Color.DARK_GRAY);
		f=new Font("Arial",Font.ITALIC ,15);
		
//Male Prisoner button
		btn1=new JButton("Male Prisoner");
		btn1.setBounds(4, 20, 150, 50);
		btn1.setBackground(Color.LIGHT_GRAY);
		btn1.setFont(f);
		Fc.add(btn1);
		
//Female Prisoner button
		
				btn2=new JButton("Female Prisoner");
				btn2.setBounds(240, 20, 150, 50);
				btn2.setBackground(Color.LIGHT_GRAY);
				btn2.setFont(f);
				Fc.add(btn2);
				
//Warden  button
				
				btn3=new JButton("Warden");
				btn3.setBounds(4, 100, 150, 50);
				btn3.setBackground(Color.LIGHT_GRAY);
				btn3.setFont(f);
				Fc.add(btn3);
				
//Male prisoner report  button
				
				btn4=new JButton("Male Prisoner Report");
				btn4.setBounds(100, 200, 200, 50);
				btn4.setBackground(Color.LIGHT_GRAY);
				btn4.setFont(f);
				Fc.add(btn4);
				
				
//Search  button
				
				btn5=new JButton("Search");
				btn5.setBounds(240, 100, 150, 50);
				btn5.setBackground(Color.LIGHT_GRAY);
				btn5.setFont(f);
				Fc.add(btn5);
				
//female prisoner report  button
				
				btn4=new JButton("Female Prisoner Report");
				btn4.setBounds(100, 290, 200, 50);
				btn4.setBackground(Color.LIGHT_GRAY);
				btn4.setFont(f);
				Fc.add(btn4);
	
				
				
//Male Prisoner button work
				btn1.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent argO) {
						// TODO Auto-generated method stub
						
						ForntDesign a=new ForntDesign();
						a.setBounds(200, 200, 500, 600);
						a.setVisible(true);
						
					}
				});
				
				
//female Prisoner button work
				btn2.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent argO) {
						// TODO Auto-generated method stub
						
						ForntDesign a=new ForntDesign();
						a.setBounds(200, 200, 500, 600);
						a.setVisible(true);
						
					}
				});
				
				
				
//warden  button work
				btn3.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent argO) {
						// TODO Auto-generated method stub
						
						ForntDesign a=new ForntDesign();
						a.setBounds(200, 200, 500, 600);
						a.setVisible(true);
						
					}
				});
				
				
//search button work
				btn5.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent argO) {
						// TODO Auto-generated method stub
						
						ForntDesign a=new ForntDesign();
						a.setBounds(200, 200, 500, 600);
						a.setVisible(true);
						
					}
				});
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 MenuButton frame=new  MenuButton();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(200, 200, 400, 500);
		frame.setTitle("Prison Management System" );
		frame.setResizable(false);
	}

}
