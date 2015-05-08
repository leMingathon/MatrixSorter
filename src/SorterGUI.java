import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import net.miginfocom.swing.MigLayout;

public class SorterGUI {
	private JFrame frame;

	private JPanel mainPanel;
	private JTextField inputField;
	private JButton updateButton;

	public SorterGUI() {
		frame = new JFrame("Matrix Sorter by Minghua Yin");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		mainPanel = new JPanel(new MigLayout("insets 5", "", ""));
		inputField = new JTextField();
		updateButton = new JButton("Update Matrix");

		mainPanel.add(inputField, "pushx, grow");
		mainPanel.add(updateButton, "wrap");

		frame.setContentPane(mainPanel);
		frame.setSize(500, 650);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				new SorterGUI();
			}

		});
	}

}
