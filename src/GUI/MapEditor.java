package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashMap;

import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.BorderFactory;
import javax.swing.ListSelectionModel;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class MapEditor {

	private JFrame frame;
	private JTextField commandLine;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MapEditor window = new MapEditor();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MapEditor() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 734, 475);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		commandLine = new JTextField();
		commandLine.setBounds(330, 30, 300, 30);
		frame.getContentPane().add(commandLine);
		commandLine.setColumns(10);
		
		JLabel continent = new JLabel("Continent");
		continent.setBounds(27, 200, 93, 21);
		frame.getContentPane().add(continent);
		
		JLabel country = new JLabel("Country");
		country.setBounds(330, 200, 93, 21);
		frame.getContentPane().add(country);

		JTextArea Continent_Info = new JTextArea();
		Continent_Info.setBounds(27, 231, 256, 166);
		frame.getContentPane().add(Continent_Info);
		
		JTextArea Country_Info = new JTextArea();
		Country_Info.setBounds(330, 231, 256, 167);
		frame.getContentPane().add(Country_Info);
		
		
		
		JLabel toolTips = new JLabel("Tips:");
		toolTips.setBounds(330, 65, 300, 30);
		frame.getContentPane().add(toolTips);
		
//		HashMap<String, Integer> continentCapacity= new HashMap<>();
		
		
		
		
		JButton runBtn = new JButton("Run");
		runBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String[] cmdStr = commandLine.getText().split(" ");
				
				if (cmdStr[0].equals("editcontinent")) {
					if (cmdStr[1].equals("-add")) {
						Continent_Info.append(cmdStr[2] + "	" + cmdStr[3] + "\r\n");
					}
					else if (cmdStr[1].equals("-remove")) {
						
					}
				}
				
//				Country_Info.append(commandLine.getText() + "\r\n");
			}
		});
//		runBtn.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent arg0) {
//			}
//		});
		runBtn.setBounds(330, 100, 100, 30);
		frame.getContentPane().add(runBtn);
		
		JComboBox<String> operations = new JComboBox<>();
		operations.setBorder(new TitledBorder(null, "Operation:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		operations.setModel(new DefaultComboBoxModel<String>(new String[] {"default", "-add", "-remove"}));
		operations.setBounds(180, 30, 120, 60);
		frame.getContentPane().add(operations);
		
		JComboBox<String> objects = new JComboBox<>();
		objects.setBorder(new TitledBorder(null, "Object:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		objects.setModel(new DefaultComboBoxModel<String>(new String[] {"default", "editcontinent", "editcountry", "editneighbor", "showmap"}));
		objects.setBounds(30, 30, 120, 60);
		frame.getContentPane().add(objects);
		
		
	}
}
