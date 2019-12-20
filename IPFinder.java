package ip_finder;

import javax.swing.*;  
import java.awt.event.*;  
import java.net.*; 

// main class to implement Ip finder
public class IPFinder extends JFrame implements ActionListener{
	 JLabel l;  
	    JTextField tf;  
	    JButton b;  
	    
	IPFinder(){  
	    super("IP Finder Tool - Javatpoint");  
	    l=new JLabel("Enter URL:");  
	    l.setBounds(50,70,150,20);;  
	    tf=new JTextField();  
	    tf.setBounds(50,100,200,20);  
	      
	    b=new JButton("Find IP");  
	    b.setBounds(50,150,80,30);  
	    b.addActionListener(this);  
	    
	    // adding components to the frame
	    add(l);  
	    add(tf);  
	    add(b);  
	    
	    // frame manipulation
	    setSize(300,300);  
	    setLayout(null);  
	    setVisible(true);  
	}  
	
	
	public void actionPerformed(ActionEvent e){  
		
		// entered web address by the user
	    String url=tf.getText();  
	    
	    try {  
	        InetAddress ia=InetAddress.getByName(url);  
	        String ip=ia.getHostAddress();  
	        JOptionPane.showMessageDialog(this,ip);  
	    } catch (UnknownHostException e1) {  
	        JOptionPane.showMessageDialog(this,e1.toString());  
	    }  
	}  
	
	
	public static void main(String[] args) {  
	    new IPFinder();  
	}
}
