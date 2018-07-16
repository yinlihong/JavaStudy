<%--
  Created by IntelliJ IDEA.
  User: ylh
  Date: 2018/7/16
  Time: 14:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加页面</title>
</head>
<body>
你访问的是添加页面
<form action="${pageContext.request.contextPath}/user/addUserId.do">
    学生学号：
    <input type="text" name="id">
    <input type="submit" value="提交">
</form>
<hr>
<!--创建一个提交name姓名的-->
<form action="${pageContext.request.contextPath}/user/addUserName.do">
    学生姓名：
    <input type="text" name="name">
    <input type="submit" value="提交">
</form>
<!--提交学生信息-->
<form action="${pageContext.request.contextPath}/user/addUser.do">
    学号:<input type="text" name="id"><br>
    姓名:<input type="text" name="name"><br>
    年龄:<input type="text" name="age"><br>
    性别:<input type="text" name="sex"><br>
    <input type="submit" value="提交">
</form>
<!--表单提交集合-->
<form action="${pageContext.request.contextPath}/user/addUserList.do">
    学号:<input type="text" name="userList[0].id"><br><!--br换行-->
    姓名:<input type="text" name="userList[0].name"><br>
    学号:<input type="text" name="userList[1].id"><br>
    姓名:<input type="text" name="userList[1].name"><br>
    <input type="submit" value="提交">
</form>
</body>
</html>
