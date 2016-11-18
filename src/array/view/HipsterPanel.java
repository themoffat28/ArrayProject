package array.view;

import javax.swing.*;
import array.controller.ArrayController;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		baseLayout.putConstraint(SpringLayout.SOUTH, myButton, -51, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, myButton, -24, SpringLayout.EAST, this);
		this.infoLabel = new JLabel("Wow words!");
		baseLayout.putConstraint(SpringLayout.NORTH, infoLabel, 5, SpringLayout.NORTH, myButton);
		baseLayout.putConstraint(SpringLayout.WEST, infoLabel, 30, SpringLayout.WEST, this);
		this.dropDown = new JComboBox(baseController.getHipsters());
		baseLayout.putConstraint(SpringLayout.NORTH, dropDown, 58, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, dropDown, 192, SpringLayout.WEST, this);
		
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
		dropDown.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent selection)
			{
				infoLabel.setText(dropDown.getSelectedItem().toString());
			}
		});
		
		myButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				baseController.impactHipsters();
				repaint();
			}
		});
	}
}
