package gui.view;

import javax.swing.JPanel;
import gui.controller.GuiAppController;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class GuiPanel extends JPanel
{
	private GuiAppController baseController;
	private JButton firstButton;
	private JTextField firstTextField;private SpringLayout baseLayout;
	
	public GuiPanel(GuiAppController baseController)
	{
		this.baseController = baseController;
		firstButton = new JButton("Don't click the button");
		firstTextField = new JTextField("You can type here");
		baseLayout = new SpringLayout();
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	/**
	 * Loads content into panel.
	 */
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);      //Needs to be the first line of the setupPanel helper method.
		this.add(firstButton);
		this.add(firstTextField);
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}
}
