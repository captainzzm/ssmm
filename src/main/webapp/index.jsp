<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/inc/uploadify.jsp" %>

<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
<h2>Hello World! </h2>

<h1>
		<input type="button" id="upload" value="upload"/>
</h1>

<script type="text/javascript">
$(function(){
	$("#upload").uploadify({
			"debug" : false,
			"auto" : true,//是否自动上传
			"height" : 30,
			"width" : 120,
			"buttonText" : '上传文件',
			"cancelImage" :WEBROOT+'/statics/uploadify/uploadify-cancel.png',
			"swf" :  WEBROOT+'/statics/uploadify/uploadify.swf',
			"uploader" : WEBROOT+'/upload/fileUpload.do', //后台处理上传文件的action
			"multi" : false,//是否允许多个文件上传
			//"queueID" : 'uploadfileQueue',
			"fileObjName" : 'imageFile', //与后台Action中file属性一样
			"formData" : { //附带值       
				'userid' : '111',
				'username' : 'tom',
				'rnd' : '111'
			},
			"fileTypeExts" : '.jpg;*.jpge;*.gif;*.png',
			"removeCompleted" : true,
			"fileSizeLimit" : '1MB',
			"queueSizeLimit" : 5,
			"onUploadSuccess": function (file, data, response) {    
                alert("文件:" + file.name + "上传成功....服务器信息"+data);  
                $("#download_file").append("<a href='"+WEBROOT+"/upload/download.do?fileName="+file.name+"'>"+file.name+"</a><br/>");  
            },  
            "onUploadError": function(file, errorCode, errorMsg, errorString) {    
                alert("文件:" + file.name + "上传失败...."+errorCode+"...."+errorMsg+"...."+errorString);  
            },  
            "onCancel": function(file){  
               alert("The file " + file.name + " was cancelled.");   
            },  
            "onClearQueue" : function(queueItemCount) {  
                alert("队列中" + queueItemCount + " 个文件被清空。");  
            }  

		});

	 
	
});



</script>
</body>
</html>
