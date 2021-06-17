
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<%@ page import="com.joo.jsp.Cart"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <h1>장바구니</h1>

  <%
  List<Cart> cartItems = (ArrayList<Cart>) session.getAttribute("cartItems");
  if (cartItems == null) {
      cartItems = new ArrayList<Cart>();

  }

  String name = request.getParameter("name");
  String amount = request.getParameter("amount");
  if (name != null && !name.isEmpty() && amount != null && !amount.isEmpty()) {
      cartItems.add(new Cart(name, Integer.parseInt(amount)));

      session.setAttribute("cartItems", cartItems);

  }
  
//post 게시물을 추가 작성 수정 할때 사용 get은 가져올때 사용
  %>

  <form method="post">
     <input name="name"
      type="text" placeholder="상품명"> <input name="amount"
      type="text" placeholder="수량">
    <button>추가</button>
  </form>

  <ul>

    <c:forEach var="cart" items="${cartItems}">
      <li>${cart}</li>
    </c:forEach>


  </ul>


</body>
</html>