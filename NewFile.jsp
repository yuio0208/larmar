<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
 hello
 
 
 
 <%@ page import="com.joo.jsp.Person" %>
 
 <%!
 void something(ArrayList<Person> list, Person person) {
     list.add(person);
 }
 
 
 %>
 
 <% 
 List<Person> items2 = new ArrayList<Person>();
 List<Person> items3 = new LinkedList<Person>();
/*  something(items2, Person1);
 out.print(items2);
 someting2(items2, Person1);
 someting2(items3, Person1); */
 
 %>
 
 
 
 <% 
 Person Person1 = new Person("ȫ�浿", 10);  // 100���� 
 Person Person2 = new Person("ȫ�浿", 10);  // 200���� 
 
 out.print(Person1.equals(Person2));
 
 out.print(Person1 == Person2);
 
 %>
<br>
<h1> hashcode </h1>
<%
out.print(Person1);
%>
<%
out.print(Person2);
%>

<%@ page import="java.util.*" %>




<%
//���۷��� ������� ������� ���� 
List <Person> items = new ArrayList<Person>();
items.add(Person1);
items.add(Person2);

items.remove(Person2);
out.print("ArrayList: " +items);
out.print("<br>");


// �ؽð� ������� ������ ǥ��, �ߺ� ���� 
Set <Person> itemSet = new HashSet<Person>();
itemSet.add(Person1);
itemSet.add(Person1);
itemSet.add(Person1);
itemSet.add(Person2);


out.print("HashSet : " + itemSet);
//<jsp:useBean id="person3" class="com.jsoh.jsp.Person">
%>

 
 
 
 
</body>
</html>