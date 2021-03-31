<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-1.7.2.min.js"></script>
<script type="text/javascript">


/*
 * $.ajax({
		url:"stuServlet?type=2",
		type:"post",
		dataType:"json",
		success:function(data){
			alert(json);			
		},
		error:function(){
			alert("出错了");
		}
		
		
		
		
		
	});
	
	
 */

function yz(){
 var name=$("#t2").val();
 $.ajax({
	 url:"testServlet?name="+name,
	 type:"post",
	 dataType:"html",
	 success:function(data){
		
		 alert(data);
		
	 },
	 error:function(){
		 alert("出错了");
		
	 }
 });
 
}	

function dz(){
	
	var c=$("#s1").html();
	
	 $.ajax({
		 url:"testServlet?count="+c,
		 type:"get",
		 dataType:"html",
		 success:function(data){
			
			 $("#s1").html(data);
			
		 },
		 error:function(){
			 alert("出错了");
			
		 }
	 });
}
	
</script>
</head>
<body>
<form>
用户名：<input type="text" id="t2" onblur="yz()" placeholder="请输入用户名">
<br>
点赞：<span id="s1">0</span>
<input type="button" onclick="dz()" value="👍">
</form>





</body>
</html>