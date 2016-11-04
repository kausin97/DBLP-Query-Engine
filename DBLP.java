import javax.swing.*;

public class DBLP {
	
	JFrame frame = new JFrame();
	JPanel top = new JPanel();
	JLabel title = new JLabel("DBLP Query Engine");
	JPanel left = new JPanel();
	JPanel right = new JPanel();
	String query[] = {"Query1","Query2","Query3"};
	JComboBox queryDropDown = new JComboBox(query);
	
	
	
	public DBLP()
	{
		top.add(title);
		left.add(queryDropDown);
		frame.add(top);
		frame.add(left);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new DBLP();
	}
}
