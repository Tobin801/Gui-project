package gui.controller;

import gui.view.GuiFrame;

public class GuiAppController
{
	/**
	 * Reference to the FuiFrame object of the view.
	 */
	private GuiFrame baseFrame;
	
	public GuiAppController()
	{
		baseFrame = new GuiFrame(this);
	}
	
	public void start()
	{}
}
