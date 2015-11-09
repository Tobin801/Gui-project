package gui.view;

import javax.swing.JFrame;
import gui.controller.GuiAppController;

public class GuiFrame extends JFrame
{
	private GuiAppController baseController;
	
	public GuiFrame(GuiAppController baseController)
	{
		this.baseController = baseController; //Assign parameter to data member.
	}
}
