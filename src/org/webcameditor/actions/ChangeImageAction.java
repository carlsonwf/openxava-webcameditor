package org.webcameditor.actions;

import javax.inject.*;

import org.openxava.actions.*;




/**
 * @author Carlson Weber Filho
 */

public class ChangeImageAction extends ViewBaseAction implements ILoadFileAction { 
		
	@Inject
	private String newImageProperty;	
	
	public void execute() throws Exception {
		showDialog(); 
	}

	public String[] getNextControllers() {		
		return new String [] { "LoadImageWebcam" }; 
	}

	public String getCustomView() {		
		return "xava/editors/webcamChangeImage";
	}

	public boolean isLoadFile() {		
		return true;
	}

	public String getNewImageProperty() {
		return newImageProperty;
	}

	public void setNewImageProperty(String string) {
		newImageProperty = string;		
	}

}
