package ciroh.github.io;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneLayout;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import com.formdev.flatlaf.FlatDarkLaf;

public class Main extends JFrame {
	JTextArea textArea;
	
	public static void main(String[] args) {
		try {
		    UIManager.setLookAndFeel(new FlatDarkLaf());
		} catch( UnsupportedLookAndFeelException ex ) {
		    JOptionPane.showMessageDialog(null, "Failed to initialize LaF: \n" + ex.getMessage());
		}
		//do this with a Runnable instead
		Main mainWindow = new Main();
		
	}

	public Main() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.setLayout(new ScrollPaneLayout());
		this.setMinimumSize(new Dimension(600, 450));
		this.setExtendedState(JFrame.MAXIMIZED_BOTH | JFrame.MAXIMIZED_HORIZ);
		this.setTitle("tuff -- EARLY BUILD");
		
		textArea = new JTextArea();
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		this.add(textArea);
		
	}
	
}
