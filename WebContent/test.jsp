<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>Testing JSP</h3>
<%!
public int add(int a, int b) {
	return a + b;
}
%>
<%	
int i = 1;
int j = 2;
int k;
k = i + j;
//out.println("Value of k is " + k);
%>
Value of k is <%= k %> or <%= 3 + 4 %> or <%= i + j %>
<%
k = add(22432, 43568);
%>
<br>
Value of k is <%= k %>

<%
for (int m = 0; m < 5; m++) {
	out.println("<br>m = " + m);
}
%>
<br>
<%
for (int n = 0; n < 5; n++) {
%>
	<br>n = <%=n%>
<%
}
%>

</body>
</html>