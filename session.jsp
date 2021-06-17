<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script>

function nextPage() {
  location.href = "index.jsp";
  
}
</script>



</head>
<body>

<%
session.setAttribute("name", "홍길동");
out.print(session.getAttribute("name") + "<br>");
/* Person person = (Person) session.getAttribute("profile");
out.print(person);

List<Person> persons = new ArrayList<Person>();
persons.add(person);
persons.add(new Person("홍길동", 20));  

session.setAttribute("persons", persons); 
out.print(session.getAttribute("persons")); 

*/



%>


<button onclick="nextPage()">

</body>
</html>