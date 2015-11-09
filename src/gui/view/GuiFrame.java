package gui.view;

import javax.swing.JFrame;
import gui.controller.GuiAppController;

/**
 * Creates the Frame for the Gui project.
 * @author tand6053
 * @version ) 0.3 Nov 9, 2015 Added a reference to the GuiPanel and installed it as the content pane.
 */

public class GuiFrame extends JFrame
{
	private GuiAppController baseController;
	private GuiPanel basePanel;
	
	public GuiFrame(GuiAppController baseController)
	{
		this.baseController = baseController;   //Assign parameter to data member.
		basePanel = new GuiPanel(baseController);   //Creates an instance of the GuiPanel with a reference to the controller.
		setupFrame();
	}
	
	/**
	 * Helper method to setup the Frame and it's structure.
	 */
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);    //Sets the panel in the GuiFrame,this is REQUIRED!!!!!!!!
		this.setResizable(false);		   //Usually a good idea but not required.
		this.setTitle("My window app");    //Sets the title (Not needed).
		this.setSize(1280,720);            //Sets the size of the screen.
		this.setVisible(true);             //Must be the last line of code in the setupFrame method.
	}
}
