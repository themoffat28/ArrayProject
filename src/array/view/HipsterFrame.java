package array.view;

import javax.swing.JFrame;
import java.awt.Dimension;
import array.controller.ArrayController;

public class HipsterFrame extends JFrame
{
	private HipsterPanel appPanel;
	private ArrayController baseController;
	
	public HipsterFrame(ArrayController baseController)
	{
		this.baseController = baseController;
		this.appPanel = new HipsterPanel(baseController);
		
		setupFrame();
	}
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setSize(new Dimension(600, 400));
		this.setTitle("Hipster Swag Master");
		this.setResizable(false);
		this.setVisible(true);
	}
}
