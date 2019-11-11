
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path=request.getContextPath();
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="<%=path%>/user/insert.do" method="post">
    <tr>
        <td>编号<input type="text" name="id"></td>
        <td>姓名<input type="text" name="name"></td>
        <td>年龄<input type="text" name="age"></td>
        <td>生日<input type="text" name="birthday"></td>
        <td><input type="submit" value="提交"></td>
    </tr>

</form>

</body>
</html>
