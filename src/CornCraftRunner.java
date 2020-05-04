package src;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class CornCraftRunner {
	int width = 800;
	int height = 800;
public static void main(String[] args) {
	CornCraftRunner CCR = new CornCraftRunner();
	CCR.J();
}
void J() {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	frame.add(panel);
	panel.add(button);
	frame.setSize(width,height));
	frame.setVisible(true);
	frame.pack();
}
}
