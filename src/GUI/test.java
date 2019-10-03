package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;
import java.awt.Font;

public class test {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test window = new test();
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
	public test() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("宋体", Font.PLAIN, 18));
		frame.setBounds(100, 100, 600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel dice01 = new JLabel("--");
		dice01.setFont(new Font("宋体", Font.PLAIN, 18));
		dice01.setBounds(291, 56, 264, 55);
		frame.getContentPane().add(dice01);
		
		JLabel dice02 = new JLabel("--");
		dice02.setFont(new Font("宋体", Font.PLAIN, 18));
		dice02.setBounds(10, 50, 230, 66);
		frame.getContentPane().add(dice02);
		
		JButton btnRollDice = new JButton("Roll Dice");
		btnRollDice.setFont(new Font("宋体", Font.PLAIN, 18));
		btnRollDice.setBounds(0, 0, 584, 23);
		btnRollDice.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Random rand = new Random();;
				int tempForDice1 = rand.nextInt(6) + 1;
				int tempForDice2 = rand.nextInt(6) + 1;
				dice01.setText(Integer.toString(tempForDice1));
				dice02.setText(Integer.toString(tempForDice2));
			}
		});
		frame.getContentPane().add(btnRollDice);
	}

}
