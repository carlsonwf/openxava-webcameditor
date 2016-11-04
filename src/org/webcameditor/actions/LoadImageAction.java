package org.webcameditor.actions;

import java.util.*;
import javax.inject.*;
import org.apache.commons.fileupload.*;
import org.openxava.actions.*;
import org.openxava.util.*;
import org.openxava.web.*;

import sun.misc.*;

/**
 * @author Carlson Weber Filho
 */

public class LoadImageAction extends ViewBaseAction implements INavigationAction, IProcessLoadedFileAction{ 
	private List fileItems;
	
	@Inject
	private String newImageProperty;
	

	public void execute() throws Exception {
		for (Iterator it = fileItems.iterator(); it.hasNext();) {
			FileItem item = (FileItem) it.next();
			if ("ox-webcam-imagem".equals(Ids.undecorate(item.getFieldName()))){
				byte[] dest = null;
				String strBase64 = new String(item.get());
				if (!strBase64.equals("")){
					String[] parts = strBase64.split(",");
					String imageString = parts[1];

					// create a buffered image
					byte[] imageByte;
					BASE64Decoder decoder = new BASE64Decoder();
					imageByte = decoder.decodeBuffer(imageString);
					getPreviousView().setValue(getNewImageProperty(), imageByte);
				}
				
			}
		}
		closeDialog();
	}
	
	public String[] getNextControllers() {				
		return PREVIOUS_CONTROLLERS;
	}

	public String getCustomView() {		
		return PREVIOUS_VIEW;
	}

	public String getNewImageProperty() {
		return newImageProperty;
	}

	public void setNewImageProperty(String string) {
		newImageProperty = string;	
	}

	@Override
	public void setFileItems(List fileItems) {
		this.fileItems = fileItems;	
	}


}
