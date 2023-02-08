import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.*;

public class App extends JFrame implements ActionListener
{
	JLabel earth;
	JFrame frame;
	JLabel gamename =new JLabel( "ADVANTURE OF SPACE CUSTOM OFFICER");
	JLabel label = new JLabel("NEW GAME");
	JLabel label1 = new JLabel("SETTINGS");

	JButton button =new JButton();
	JButton button1=new JButton();
	JLabel ıconlabel = new JLabel();
	ImageIcon ımage = new ImageIcon("a.png");


	App(){
		ıconlabel.setIcon(ımage);
		ıconlabel.setBounds(0,0,900,900);
		ıconlabel.setVisible(true);
		ıconlabel.setOpaque(true);

		//ImageIcon icon =new ImageIcon("earth__PNG41.png");
		frame= new JFrame();
		frame.getContentPane().setBackground(new Color(150,150,2));;
		//frame.setResizable(false);
		//JLabel earth=new JLabel();
		//earth.setIcon(icon);
		//earth.setBounds(150,250,350,300);
		//earth.setVisible(false);
		gamename.setBounds(100, 50, 900, 200);
		gamename.setForeground(new Color(0xA8C9FA));
		gamename.setFont(new Font("Calibri",Font.BOLD,40));

		
		button.setBounds(100, 300, 200, 50);
		//button.setBackground(Color.black);
		button.setFocusable(false);
		button.addActionListener(this);	
		button.setOpaque(false);
		button.setContentAreaFilled(false);
		button.setBorderPainted(false);

		label.setBounds(100, 300, 200, 50);
		label.setForeground(new Color(0xA8C9FA));
		label.setFont(new Font("Calibri",Font.BOLD,30));
		
		//button.setIcon(icon);
		//button.setHorizontalTextPosition(JButton.CENTER);
		//button.setVerticalTextPosition(JButton.BOTTOM);
		//button.setBorder(BorderFactory.createEtchedBorder());*
		
		button1.setBounds(100, 350, 100, 60);
		//button1.setBackground(Color.black);
		button1.setFocusable(false);
		button1.addActionListener(this);
		button.setOpaque(false);
		button1.setContentAreaFilled(false);
		button1.setBorderPainted(false);


		label1.setBounds(100, 350, 100, 60);
		label1.setForeground(new Color(0xA8C9FA));
		label1.setFont(new Font("Calibri",Font.BOLD,15));




		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("CUSTOM OFFİCER");
		this.setSize(900,900);
		this.setLayout(null);
		this.setVisible(true);
		this.add(gamename);
		this.add(label);
		this.add(label1);
		this.add(button);
		this.add(button1);
		this.add(ıconlabel);
		
		
		
	}
	@Override

	public void actionPerformed(ActionEvent e ){
		if(e.getSource()==button){
			this.dispose();
			Screen window= new Screen();
						


			
		}
		if(e.getSource()==button1){
			this.dispose();
			Settıngs window= new Settıngs();
			


			
		}
			
		}


	}

