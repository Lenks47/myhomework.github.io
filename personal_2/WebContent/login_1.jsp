<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%    request.setCharacterEncoding("UTF-8");
      response.setHeader("iso-8859-1","utf-8");  
      request.setCharacterEncoding("utf-8"); 
      String name=request.getParameter("username");
      String password=request.getParameter("password");
      session.setAttribute("user", name);
      if(name.equals("LYF")&&password.equals("20010206"))
    		  {%>
    	  <jsp:forward page="forward.jsp"/>
    	  <h1>登陆成功!正在跳转~</h1>
    		  <%}
      else{%>
          <jsp:forward page="erro.jsp"/>
    		  <%}
%>
</body>
</html>