# openxava-webcameditor
Webcam Editor for Openxava

This is a custom editor for Openxava (http://www.openxava.org) that loads an image from the user webcam.
Tested on Google Chrome 54.0.2840.71

## Installing

* Copy the editor definition from editors.xml and the controller definition from controllers.xml into your project's editors.xml and controller.xml;
* Copy the java files to your source folder;
* Copy the jsp and javascript files to your project's folder web/xava/editors and web/xava/editors/js

## How to use

You need to the Stereotype "WEBCAM" like the code below:

```java

@View(members = "photo")
public class MyTestClass{
	
	@Stereotype("WEBCAM") 
	@Column(length = 16777216) 
	@Lob
	private byte[] photo;

}

```