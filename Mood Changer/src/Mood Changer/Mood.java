package lab8;

import java.awt.*;  
import javax.swing.*;  
import java.awt.event.*;  

public class Laboratory8 extends JFrame implements ActionListener{

private static final long serialVersionUID = 1L;

	JFrame frame;
	JPanel panel;
	JButton b1,b2,b3;
	JLabel label;

	private Color Color;

	Laboratory8(){
	
	   frame = new JFrame("MOOD CHANGER🎀🎀");
	   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   
	   ImageIcon image = new ImageIcon("insideout.jpg");
	   frame.setIconImage(image.getImage());
	
	   panel = new JPanel();  
	   panel.setSize(100, 200);
	   panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        
       add(panel);
	   
	   label = new JLabel("How are you feeling?");
	   label.setFont(new Font("Times New Roman", Font.BOLD, 30));
	   label.setAlignmentX(Component.CENTER_ALIGNMENT);
	   panel.add(Box.createVerticalStrut(60)); 
	   panel.add(label);
	
	   Dimension buttonsize = new Dimension (200,200);
	   
	   b1 = new JButton("HAPPY");  
	   b1.addActionListener(this); 
	   b1.setAlignmentX(Component.CENTER_ALIGNMENT); 
	   b1.setMaximumSize(buttonsize);
	   b1.setMinimumSize(buttonsize);
	   b1.setBackground(java.awt.Color.yellow);
	   
	   b2 = new JButton("CALM");  
	   b2.addActionListener(this); 
	   b2.setAlignmentX(Component.CENTER_ALIGNMENT);
	   b2.setMaximumSize(buttonsize);
	   b2.setMinimumSize(buttonsize);
	   b2.setBackground(java.awt.Color.green);
	  
	   b3 = new JButton("SAD");
	   b3.addActionListener(this);
	   b3.setAlignmentX(Component.CENTER_ALIGNMENT);
	   b3.setMaximumSize(buttonsize);
	   b3.setMinimumSize(buttonsize);
	   b3.setBackground(java.awt.Color.cyan);
	   
	   panel.add(b1);
	   panel.add(b2);
	   panel.add(b3);
	
	   frame.getContentPane().add(panel);  
	   frame.setSize(500,300);
	   frame.setVisible(true);
	   frame.setLayout(new FlowLayout());
	
	}
	
	@Override
	 public void actionPerformed(ActionEvent e) {
		
	      String mood = e.getActionCommand();
	      Color moodColor;
	      
	     if (mood.equals("HAPPY")) {
	          moodColor = java.awt.Color.yellow;
	          frame.getContentPane().setBackground(java.awt.Color.yellow);  
	      } else if (mood.equals("CALM")) {
	          moodColor = java.awt.Color.green;
	          frame.getContentPane().setBackground(java.awt.Color.green);  
	      } else if (mood.equals("SAD")) {
	          moodColor = java.awt.Color.blue;
	          frame.getContentPane().setBackground(java.awt.Color.blue);
	      } else {
	          moodColor = java.awt.Color.lightGray;
	      }
	
	      panel.setBackground(Color);
	      label.setText("You are feeling: " + mood + "!");
	      label.setBackground(moodColor);
	  }

	 public static void main(String[] args) {
	    new Laboratory8();
	 }   
}