import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.*;


public class Screen extends JFrame implements ActionListener
{
	JFrame frame;
	JButton button =new JButton();
	JButton button1=new JButton();
	JButton button2 =new JButton();
	JLabel ıconlabel = new JLabel();
	JLabel earth = new JLabel("CORUSCANT");
	JLabel water = new JLabel("4546B");
	JLabel hot = new JLabel("TATOOINE");
	ImageIcon ımage = new ImageIcon("a.png");


	Screen(){
		ıconlabel.setIcon(ımage);
		ıconlabel.setBounds(0,0,900,900);
		ıconlabel.setVisible(true);
		ıconlabel.setOpaque(true);

		frame= new JFrame();
		frame.getContentPane().setBackground(new Color(150,150,2));	
		
		button.setBounds(270, 245, 200, 50);
		button.setFocusable(false);
		button.addActionListener(this);	
		button.setOpaque(false);
		button.setContentAreaFilled(false);
		button.setBorderPainted(false);
		button.addActionListener(this);	
		earth.setBounds(270, 245, 200, 50);
		earth.setForeground(new Color(0xA8C9FA));
		earth.setFont(new Font("Calibri",Font.BOLD,20));
		//coruscant




		button1.setBounds(620, 180, 200, 50);
		button1.setFocusable(false);
		button1.addActionListener(this);	
		button1.setOpaque(false);
		button1.setContentAreaFilled(false);
		button1.setBorderPainted(false);
		button1.addActionListener(this);
		water.setBounds(620, 180, 200, 50);
		water.setForeground(new Color(0xA8C9FA));
		water.setFont(new Font("Calibri",Font.BOLD,20));
		
			



		button2.setBounds(460, 185, 200, 50);
		button2.setFocusable(false);
		button2.addActionListener(this);	
		button2.setOpaque(false);
		button2.setContentAreaFilled(false);
		button2.setBorderPainted(false);
		button2.addActionListener(this);
		hot.setBounds(460, 185, 200, 50);
		hot.setForeground(new Color(0xA8C9FA));
		hot.setFont(new Font("Calibri",Font.BOLD,20));
		//mustafar




		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Gümrük oyunu");
		this.setSize(900,900);
		this.setLayout(null);
		this.setVisible(true);
		this.add(earth);
		this.add(water);
		this.add(hot);
		this.add(button);
		this.add(button1);
		this.add(button2);
		this.add(ıconlabel);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e ){
		if(e.getSource()==button){
			this.dispose();
			Main.start = true;
			EarthNewWindow window= new EarthNewWindow();
			Main.planetName = "Coruscant";
			Main.earthBool = true;
			
		}
		if(e.getSource()==button2){
			this.dispose();
			Main.start = true;
			HotNewWindow window = new HotNewWindow();
			Main.planetName = "Tatooine";
			Main.hotBool = true;
			
		}
		if(e.getSource()==button1){
			this.dispose();
			Main.start = true;
			ColdNewWindow window= new ColdNewWindow();
			Main.planetName = "4546B";
			Main.coldBool = true;
			
		}

	}

	
	
		
}


