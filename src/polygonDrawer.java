import java.awt.*;
import javax.swing.*;

public class polygonDrawer extends JFrame {
	static final int SLIDER_MIN = 3;
	static final int SLIDER_MAX = 33;
	static final int SLIDER_INIT = 3;
	
	JPanel noVerticesPanel, displayPanel, colorPanel, shapePanel, positionPanel;
	JRadioButton regularButton, randomButton;
	JButton drawButton, bgButton, lnButton;
	JSlider verticesSlider;
	JLabel polygonLabel,verticesLabel,positionLabel;
	
	public polygonDrawer() throws HeadlessException {
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setSize(600,600);
		this.setLayout(new BorderLayout());
		
		noVerticesPanel = new JPanel(new FlowLayout());
		this.add(noVerticesPanel, BorderLayout.PAGE_START);
		verticesLabel = new JLabel("No. of vertices");
		noVerticesPanel.add(verticesLabel);
		verticesSlider = new JSlider(JSlider.HORIZONTAL, SLIDER_MIN, SLIDER_MAX, SLIDER_INIT);
		verticesSlider.setMinorTickSpacing(2);
		verticesSlider.setMajorTickSpacing(10);		
		verticesSlider.setPaintTicks(true);
		verticesSlider.setPaintLabels(true);		
		noVerticesPanel.add(verticesSlider);
		
		
	}

	

	public static void main(String[] args) {
		polygonDrawer drawer = new polygonDrawer();
		drawer.setVisible(true);
		

	}

}
