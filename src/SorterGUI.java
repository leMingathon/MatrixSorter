import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

import net.miginfocom.swing.MigLayout;

public class SorterGUI {
	private JFrame frame;

	private JPanel mainPanel;
	private JTextArea inputArea;
	private JScrollPane inputScrollPane;
	private JButton updateButton;
	private MatrixPanel matrixPanel;
	private JButton sortRowsButton;
	private JButton sortColsButton;

	public SorterGUI() {
		frame = new JFrame("Matrix Sorter by Minghua Yin");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		mainPanel = new JPanel(new MigLayout("insets 5", "", ""));
		inputArea = new JTextArea();
		inputArea.setLineWrap(true);
		inputScrollPane = new JScrollPane(inputArea);
		updateButton = new JButton("Update Matrix");
		matrixPanel = new MatrixPanel();
		sortRowsButton = new JButton("Sort Rows");
		sortColsButton = new JButton("Sort Cols");

		updateButton.addActionListener(new UpdateMatrixListener());
		sortRowsButton.addActionListener(new SortRowsListener());
		sortColsButton.addActionListener(new SortColsListener());

		mainPanel.add(inputScrollPane, "grow");
		mainPanel.add(updateButton, "wrap, height 50!");
		mainPanel.add(matrixPanel, "span, push, grow, wrap");
		mainPanel
				.add(sortRowsButton, "span, split 2, width 48%!, align center");
		mainPanel.add(sortColsButton, "width 48%!, align center");

		frame.setContentPane(mainPanel);
		frame.setSize(500, 650);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

	private class MatrixPanel extends JPanel {

		@Override
		public void paintComponent(Graphics g) {
			Graphics2D g2 = (Graphics2D) g;

			g2.setColor(Color.RED);
			g2.fillRect(0, 0, this.getWidth(), this.getHeight());
		}
	}

	private class UpdateMatrixListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			System.out.println("LOLS!!!");
		}

	}

	private class SortRowsListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

		}

	}

	private class SortColsListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

		}

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
