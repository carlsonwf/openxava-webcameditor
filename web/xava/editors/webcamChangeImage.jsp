<%@ include file="../imports.jsp"%>

<jsp:useBean id="style" class="org.openxava.web.style.Style"
	scope="request" />

<div>
	<div>
		<video class = 'ox-webcam-video' id="video" width="300" height="215" autoplay="true"></video>
	</div>
	<div style="display:table; margin:0 auto">
		<a class="ox-image-link" title="Capturar imagem" href= "javascript:capture()" id ="snap"><i class="mdi mdi-camera"></i></a>
	</div>	
	<div >
		<canvas class = 'ox-webcam-canvas' id="canvas" width="300" height="215"	></canvas>
	</div>
	<input type="hidden" id = "ox-webcam-imagem" name = "ox-webcam-imagem"/>
	<input style="display:none"  name = "newImage" class=<%=style.getEditor()%> type="file" size='60' tabindex="1"/>
</div>
