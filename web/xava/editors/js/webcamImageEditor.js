function capture(){
	var canvas = $('.ox-webcam-canvas')
	if (canvas.length == 0)
		return;
	canvas = canvas[0]
	canvas.getContext("2d").drawImage(video, 0, 0, 300, 215);
	document.getElementById("ox-webcam-imagem").value = canvas.toDataURL("image/jpeg", 1);
}

openxava.addEditorInitFunction(function() {

	var canvas = $('.ox-webcam-canvas')
	if (canvas.length == 0)
		return;
	canvas = canvas[0]
	context = canvas.getContext("2d")
	video = $('.ox-webcam-video')
	if (video.length == 0)
		return;
	video = video[0];
	videoObj = {
		"video" : true
	}, errBack = function(error) {
		console.log("Video capture error: ", error.code);
	};
	if (navigator.getUserMedia) {
		navigator.getUserMedia(videoObj, function(stream) {
			video.src = window.URL.createObjectURL(stream);
			video.play();
		}, errBack);
	} else if (navigator.webkitGetUserMedia) {
		navigator.webkitGetUserMedia(videoObj, function(stream) {
			video.src = window.webkitURL.createObjectURL(stream);
			video.play();
		}, errBack);
	} else if (navigator.mozGetUserMedia) {
		navigator.mozGetUserMedia(videoObj, function(stream) {
			video.src = window.URL.createObjectURL(stream);
			video.play();
		}, errBack);
	}
});