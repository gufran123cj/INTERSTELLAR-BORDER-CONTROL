import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.*;
import java.awt.*;


public class ColdNewWindow extends JFrame implements ActionListener {
    JFrame frame=new JFrame();
    JLabel backgroundpanel =new JLabel();
    static JTextArea errorgroundpanel = new JTextArea();
    static JTextArea infopanel = new JTextArea();
    static JTextArea planetinfopanel = new JTextArea();
    JLabel title =  new JLabel();//ınfopanel
    JLabel title1 =  new JLabel();//planetınfopanel
    JLabel title2 =  new JLabel();//errorpanel
    JLabel avatargroundpanel= new JLabel();
    JButton button_acceeptedButton =new JButton();
    JButton button_rejectedButton = new JButton();
    JCheckBox checkbox = new JCheckBox();   
    ImageIcon ımage = new ImageIcon("water.png");
    ImageIcon avatar_ımage = new ImageIcon("avatar.png");
    //ImageIcon earthImageIcon = new ImageIcon("Pixel-Cover.png");

    
    ColdNewWindow(){

        title.setBounds(350,300,300,30);
        title.setBackground(Color.white);
        title.setText("VISITOR INFO PANEL");
        title.setVisible(true);
        title.setOpaque(true);
        this.add(title);

        title1.setBounds(675,300,300,30);
        title1.setBackground(Color.white);
        title1.setText("PLANET INFO PANEL");
        title1.setVisible(true);
        title1.setOpaque(true);
        this.add(title1);

        title2.setBounds(0,460,320,30);
        title2.setBackground(Color.white);
        title2.setText("ERROR PANEL");
        title2.setVisible(true);
        title2.setOpaque(true);
        this.add(title2);
        
       
        infopanel.setBounds(350, 330, 300, 400);
        infopanel.setBackground(new Color(0x3a4c66));
        infopanel.setForeground(Color.white);
        infopanel.setLineWrap(true);
		infopanel.setWrapStyleWord(true);
		infopanel.setEditable(false);
        infopanel.setOpaque(true);
        //backgroundpanel.setIcon(icon);
        this.add(infopanel);


        planetinfopanel.setBounds(675, 330, 300, 400);
        planetinfopanel.setBackground(new Color(0x3a4c66));
        planetinfopanel.setForeground(Color.white);
		planetinfopanel.setLineWrap(true);
		planetinfopanel.setWrapStyleWord(true);
		planetinfopanel.setEditable(false);
        planetinfopanel.setOpaque(true);
        //backgroundpanel.setIcon(icon);

        backgroundpanel.setBounds(0, 0, 1000, 300);
        backgroundpanel.setBackground(Color.BLACK);
        backgroundpanel.setText("Background");
        backgroundpanel.setOpaque(true);
        backgroundpanel.setIcon(ımage);
        backgroundpanel.setBounds(0,0,1000,300);
		backgroundpanel.setVisible(true);
		backgroundpanel.setOpaque(true);
        //backgroundpanel.setIcon(icon);

        avatargroundpanel.setBounds(0, 300, 200, 200);
        avatargroundpanel.setBackground(Color.yellow);
        avatargroundpanel.setText("avatar");
        avatargroundpanel.setOpaque(true);
        avatargroundpanel.setIcon(avatar_ımage);
        avatargroundpanel.setBounds(0, 300, 200, 200);
		avatargroundpanel.setVisible(true);
		avatargroundpanel.setOpaque(true);
        //backgroundpanel.setIcon(icon);

        errorgroundpanel.setBounds(0, 490, 320, 450);
        errorgroundpanel.setBackground(new Color(0x232c14));
        errorgroundpanel.setBackground(Color.black);
        errorgroundpanel.setForeground(Color.WHITE);
		errorgroundpanel.setLineWrap(true);
		errorgroundpanel.setWrapStyleWord(true);
		errorgroundpanel.setEditable(false);
        errorgroundpanel.setOpaque(true);
        //backgroundpanel.setIcon(icon);

        button_acceeptedButton.setBounds(550, 750, 100, 100);
        button_acceeptedButton.addActionListener(this);
		button_acceeptedButton.setBackground(new Color(0xDC1414));
        button_acceeptedButton.setText("Accepted");
        button_acceeptedButton.setFont(new Font("Calibri",Font.BOLD,16));
		button_acceeptedButton.setFocusable(false);


        button_rejectedButton.setBounds(675, 750, 100, 100);
        button_rejectedButton.addActionListener(this);
		button_rejectedButton.setBackground(new Color(0x1B7238));
        button_rejectedButton.setText("Rejected");
        button_rejectedButton.setFont(new Font("Calibri",Font.BOLD,16));
		button_rejectedButton.setFocusable(false);

        



        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Gümrük oyunu");
		this.setSize(1000,900);      
        this.getContentPane().setBackground((new Color(0x0b1a1c)));
		this.setLayout(null);
		this.setVisible(true);
        this.add(checkbox);
        this.add(errorgroundpanel);
        this.add(planetinfopanel);
        this.add(avatargroundpanel);
        this.add(backgroundpanel);
		this.add(button_acceeptedButton);
        this.add(button_rejectedButton);
        


    }
    public static void printToInfoPanel(String string){
        infopanel.setText(string);
    }
    public static void printToPlanetInfoPanel(String string){
        planetinfopanel.setText(string);
    }
    public static void printToErrorPanel(String string){
        errorgroundpanel.append("->"+string+ "\n");
    }
    public static void clearErrorPanel(){
        errorgroundpanel.setText("");
    }
    @Override
    public void actionPerformed(ActionEvent e ){
		if(e.getSource()==button_acceeptedButton){
			//this.dispose();
			Main.choiceClicked = true;
            Main.input = true;
		}
        if(e.getSource() == button_rejectedButton){
            Main.choiceClicked = true;
            Main.input = false;
        }
	}

    
}

