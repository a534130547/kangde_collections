<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ request.getContextPath() + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<script type="text/javascript" src="js/jquery-1.7.2.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>催收系统</title>
</head>
<body>
<hr>
<form action="add_SysOrganization.do" enctype="multipart/form-data" method="post">
	上级机构：	<select id="class_1_select"  ><option>请选择</option></select> 
	<c:forEach items="${all }"  var="org">
	$("#class_1_select").append("<option value="parent_id">+"org.name"+</option>");
	</c:forEach><br>
	机构类型：<select id="class_2_select" ><option>请选择</option></select> 
	<c:forEach items="${all }"  var="org">
	$("#class_2_select").append("<option value="type">+"org.type"+</option>");
	</c:forEach><br>
	负责人：<select id="class_3_select"  ><option>请选择</option></select> 
	<c:forEach items="${all }"  var="org">
	$("#class_3_select").append("<option value="principal_id">+"org.principal_id"+</option>");
	</c:forEach><br>
	机构名称：<input type="text"  id="name"><br>
	地址：<input type="text“  id="address"><br>
	电话号码：<input type="text" id="phone"><br>
	邮政编码：<input type="text“ id="post_code"><br>
	传真号:<input type="text“  id="fax"><br>
	排序:<input type="text“  id="order_no"><br>
	<input type="submit" value="提交"/>
</form>
<script type="text/javascript">
</script>
</body>
</html>