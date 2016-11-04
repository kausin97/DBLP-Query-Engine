import java.awt.Font;

import javax.swing.*;

public class DBLP {
	
	JFrame frame = new JFrame();
	JPanel top = new JPanel();
	JLabel title = new JLabel("DBLP Query Engine");
	JPanel left = new JPanel();
	JPanel right = new JPanel();
	String query[] = {"Queries","Query1","Query2","Query3"};
	JComboBox queryDropDown = new JComboBox(query);
	
	
	
	public DBLP()
	{
		top.setBounds(650, 50, 500, 500);
		title.setFont(new Font("Calibri",Font.BOLD,60));
		top.add(title);
		left.setBounds(200, 200, 300, 600);
		queryDropDown.setFont(new Font("Calibri",Font.BOLD,30));
		left.add(queryDropDown);S
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
