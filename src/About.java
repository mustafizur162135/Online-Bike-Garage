import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class About extends JFrame {
	private Container Fc;
	private ImageIcon Picon;
	private JLabel nlabel;
	private Font f;
	About(){
		
		component();
		
	}
	
	public void component()
	{
		Fc=this.getContentPane();
		Fc.setLayout(null);
		Fc.setBackground(Color.ORANGE);
		
		
		f=new Font("Arial",Font.ITALIC + Font.BOLD,30);
		nlabel= new JLabel(" Md.Mustafizur Rahman ");
		nlabel.setForeground(Color.black);
		nlabel.setBounds(0, 20, 200,700);
		nlabel.setFont(f);
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		About frame=new About();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(200, 200, 500, 600);
		frame.setTitle("Prison Management System" );
		frame.setResizable(false);
	}

}
