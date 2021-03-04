import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import java.awt.*;
import java.util.Calendar;
import java.awt.event.*;
import java.sql.*;
import java.lang.*;
import java.awt.Color;

public class ForntDesign extends JFrame
{

	private ImageIcon Picon;
	private Container Fc;
	private JLabel nlabel,ilabel;
	private Font f;
	private TextField t1,t2;
	private JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7;
	private static JButton btn8;
	ForntDesign(){
		component();
		
	}
	public void component()
	{
		
	//front menu color
		Fc=this.getContentPane();
		Fc.setBackground(Color.DARK_GRAY);
		f=new Font("Arial",Font.ITALIC + Font.BOLD,20);
		
		//searce button
		
		btn1=new JButton("Search");
		btn1.setBounds(340, 20, 80, 50);
		Fc.add(btn1);
		
//release button
		
		btn2=new JButton("Release");
		btn2.setBounds(340, 100, 80, 50);
		Fc.add(btn2);
		
//next button
		
		btn3=new JButton("Next");
		btn3.setBounds(200, 250, 80, 50);
		Fc.add(btn3);
		
		
//search button
		
		btn1=new JButton("Search");
		btn1.setBounds(340, 20, 80, 50);
		Fc.add(btn1);
		
//release button
		
		btn2=new JButton("Release");
		btn2.setBounds(340, 100, 80, 50);
		Fc.add(btn2);
		
//New button
		
		btn4=new JButton("New");
		btn4.setBounds(50, 350, 80, 50);
		Fc.add(btn4);
		
//Delete button
		
				btn5=new JButton("Delete");
				btn5.setBounds(200, 350, 80, 50);
				Fc.add(btn5);
//save button
				
				btn6=new JButton("Save");
				btn6.setBounds(350, 350, 80, 50);
				Fc.add(btn6);
//back button
				
				btn7=new JButton("Back");
				btn7.setBounds(200, 450, 80, 50);
				Fc.add(btn7);
//Clear button
				
				btn8=new JButton("Clear");
				btn8.setBounds(200, 150, 80, 20);
				Fc.add(btn8);

		
//name panel
		f=new Font("Arial",Font.ITALIC + Font.BOLD,20);
		nlabel= new JLabel(" Name : ");
		nlabel.setForeground(Color.ORANGE);
		nlabel.setBounds(0, 20, 80,50);
		nlabel.setFont(f);
//name textfild
		t1=new TextField();
		t1.setBounds(80, 20, 200,40);
		t1.setFont(f);
		Fc.add(t1);
		Fc.add(nlabel);
		
//id panel
		ilabel= new JLabel("   Id : ");
		ilabel.setForeground(Color.ORANGE);
		ilabel.setBounds(0,100, 80,50);
		ilabel.setFont(f); 
//id text fild
		t2=new TextField();
		t2.setBounds(80, 100, 200,40);
		t2.setFont(f);
		Fc.add(t2);
		Fc.add(ilabel);
		
		
		//	baCK button work
		btn7.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent argO) {
				// TODO Auto-generated method stub
				
				Frame a=new Frame();
				a.setVisible(true);
				
			}
		});
		
		
//clear button work
				btn8.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent argo) {
						// TODO Auto-generated method stub
						
					
						t1.setText("");
						t2.setText("");
						//t1.setEnabled(true);
						//t2.setEnabled(true);
					}
						
				});
				
		
		
	
		
		
		
		//project icon
		Picon=new ImageIcon(getClass().getResource("security.png"));
		this.setIconImage(Picon.getImage());
	}
	public static void main(String[]arg) {
	ForntDesign frame=new ForntDesign();
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setBounds(200, 200, 500, 600);
	frame.setTitle("Prison Management System" );
	frame.setResizable(false);
	
	
	
	}
}
