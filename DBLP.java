import java.awt.Font;
import java.awt.event.*;

import javax.swing.*;

public class DBLP {
	
	JFrame frame = new JFrame();
	JPanel top = new JPanel();
	JLabel title = new JLabel("DBLP Query Engine");
	JPanel left = new JPanel();
	JPanel right = new JPanel();
	String query[] = {"Queries","Query1","Query2","Query3"};
	JComboBox queryDropDown = new JComboBox(query);
	String search[] = {"Search By","Author","Publication"};
	JComboBox searchDropDown = new JComboBox(search);
	
	
	public DBLP()
	{
		top.setBounds(650, 50, 500, 500);
		title.setFont(new Font("Calibri",Font.BOLD,60));
		top.add(title);
		left.setBounds(200, 200, 300, 600);
		queryDropDown.setFont(new Font("Calibri",Font.BOLD,30));
		left.add(queryDropDown);
		queryDropDown.addItemListener (new ItemListener () {
		    public void itemStateChanged(ItemEvent e) {
		        String item = (String)queryDropDown.getSelectedItem();
		        if(item.equals("Query1"))
		        	System.out.println("HEllo");
		    }
		});
		frame.setLayout(null);
		frame.add(top);
		frame.add(left);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setBounds(50,50,1800,800);
		frame.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new DBLP();
	}
}
