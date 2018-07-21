<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<%@ include file="/WEB-INF/inc/common.jsp" %>

<link rel="stylesheet" href="${ctx}/statics/nivo-slider/themes/default/default.css" type="text/css" media="screen" />
<link rel="stylesheet" href="${ctx}/statics/nivo-slider/themes/light/light.css" type="text/css" media="screen" />
<link rel="stylesheet" href="${ctx}/statics/nivo-slider/themes/dark/dark.css" type="text/css" media="screen" />
<link rel="stylesheet" href="${ctx}/statics/nivo-slider/themes/bar/bar.css" type="text/css" media="screen" />
<link rel="stylesheet" href="${ctx}/statics/nivo-slider/nivo-slider.css" type="text/css" media="screen" />
<link rel="stylesheet" href="${ctx}/statics/nivo-slider/style.css" type="text/css" media="screen" />

<style>
    .slider-wrapper {
        width: 700px;
        /* width: 80%; */
        margin-top: 150px;
    }
    
    .top-banner{
        background-color: #333;
    }
    
 </style>
 
 <script type="text/javascript" src="${ctx}/js/nivo-slider/jquery.nivo.slider.js"></script>
 <script type="text/javascript">
    $(function() {
        $('#slider').nivoSlider();
    });
  </script>
<title>Nivo Slider轮播</title>
</head>
<body>
	<div class="slider-wrapper theme-light">
		<div id="slider" class="nivoSlider">
	                <a href="http://www.baidu.com"><img src="${ctx}/js/nivo-slider/images/toystory.jpg"    alt="" /></a>
	                <img src="${ctx}/js/nivo-slider/images/up.jpg"   alt="" title="This is an example of a caption" />
	                <img src="${ctx}/js/nivo-slider/images/walle.jpg"   alt="" data-transition="slideInLeft" />
	                <img src="${ctx}/js/nivo-slider/images/nemo.jpg"   alt=""  />
	     </div>
	</div>
</body>
</html>