package array.view;

import javax.swing.*;
import array.controller.ArrayController;
import java.awt.Color;

public class HipsterPanel extends JPanel
{
	private SpringLayout baseLayout;
	private JComboBox dropDown;
	private JLabel infoLabel;
	private JButton myButton;
	private ArrayController baseController;
	private HipsterFrame appFrame;
	
	public HipsterPanel(ArrayController baseController)
	{
		this.baseController = baseController;
		this.baseLayout = new SpringLayout();
		this.myButton = new JButton("Click the button");
		baseLayout.putConstraint(SpringLayout.NORTH, myButton, 116, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, myButton, 130, SpringLayout.WEST, this);
		this.infoLabel = new JLabel("Wow words!");
		baseLayout.putConstraint(SpringLayout.NORTH, infoLabel, 34, SpringLayout.SOUTH, myButton);
		this.dropDown = new JComboBox(baseController.getWords());
		baseLayout.putConstraint(SpringLayout.WEST, infoLabel, 0, SpringLayout.WEST, dropDown);
		baseLayout.putConstraint(SpringLayout.WEST, dropDown, 169, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, dropDown, -34, SpringLayout.NORTH, myButton);
		
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setBackground(Color.ORANGE);
		this.setLayout(baseLayout);
		this.add(dropDown);
		this.add(infoLabel);
		this.add(myButton);
	}
	
	private void setupLayout()
	{
	}
	
	private void setupListeners()
	{
		
	}
}
