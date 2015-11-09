package gui.view;

import javax.swing.JPanel;
import gui.controller.GuiAppController;

public class GuiPanel extends JPanel
{
	private GuiAppController baseController;
	
	public GuiPanel(GuiAppController baseController)
	{
		this.baseController = baseController;
	}
}
