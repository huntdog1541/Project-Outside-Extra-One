import java.awt.BorderLayout;

import javax.swing.JFrame;


public class Main {

	public static void main(String[] args) {
		System.out.println("Hello World");
		JFrame frame = new JFrame("Function Tester");
		TextInfo text = new TextInfo();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.add(text.getPane());
		frame.setLayout(new BorderLayout());
		frame.add(text.getMenuBar(), BorderLayout.NORTH);
		frame.setVisible(true);

	}

}
