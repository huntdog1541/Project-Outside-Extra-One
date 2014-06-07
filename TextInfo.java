import java.awt.Font;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JEditorPane;
import javax.swing.JFileChooser;
import javax.swing.JMenu;
import javax.swing.JMenuBar;


public class TextInfo {
  private JEditorPane pane = new JEditorPane();
  private JFileChooser currentFile;
  private File currF;
  private String currentFileName = "Untitled";
  private boolean change = false;
  private JMenuBar jmb;
  
  
  public TextInfo()
  {
	  currF = new File("Temp.txt");
	  currentFile = new JFileChooser(currF);
	  pane.setEditable(true);
	  pane.setFont(new Font("Monospaced", Font.PLAIN, 12));
	  jmb = new JMenuBar();
	  //setJMenuBar(jmb);
	  JMenu file = new JMenu("File");
	  JMenu edit = new JMenu("Edit");
	  
	  jmb.add(file);
	  jmb.add(edit);
  }
  
  public JMenuBar getMenuBar()
  {
	  return jmb;
  }
  
  public JEditorPane getPane()
  {
	  return pane;
  }
  
  public String fileName()
  {
	  return currentFileName;
  }
  
  private void establishingText()
  {
	  FileReader fin;
	try {
		fin = new FileReader(currF);
		BufferedReader fileIn = new BufferedReader(fin);
		String str = fileIn.readLine();
		pane.setText(str);
		str = fileIn.readLine();
		if(str != null)
		  {
			  pane.setText(str);
		  }
		fileIn.close();
	} catch (FileNotFoundException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
	  
  }
}
