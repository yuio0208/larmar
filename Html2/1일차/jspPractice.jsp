
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.io.BufferedReader" %>
<%@ page import="java.io.*" %>
<HTML>
	<BODY>
	<%
		String from_ = request.getParameter("from");
	String cnt_ = request.getParameter("cnt");
		out.println(from_);
		
		File f = new File("/var/lib/tomcat9/webapps/ROOT/wifi.txt");
		BufferedReader br = new BufferedReader(new FileReader(f));
		
		String readtxt;
			
		if((readtxt = br.readLine())== null) {
			out.println("");
			return;
		}
		double lat = 37.3860521;
		double lng=127.1214038;
		
		int LineCnt=1;
		
	%>
	
	<table title="wifi" align="center" border="1">
		<tr>
		<td> 번호 </td>
		<td> 주소 </td>
		<td> 위도 </td>
		<td> 경도 </td>
		<td> 거리 </td>
		</tr>
			
	<%
	double dist;
	while((readtxt=br.readLine())!=null){
		String[] field = readtxt.split("\t");
				if(field[12].isEmpty() == true || field[13].isEmpty() == true){
				field[13]="0";
				field[12]="0";
				dist=0;
				
				} else {			
		 dist = Math.sqrt(Math.pow(Double.parseDouble(field[12])-lat,2)
					+ Math.pow(Double.parseDouble(field[13])-lng,2));
				}
	%>
			<tr>
			<td> <%=LineCnt%>  </td>
			<td> <%=field[9]%>  </td>
			<td> <%=field[12]%> </td>
			<td> <%=field[13]%> </td>
			<td> <%=dist%> </td>
			</tr>	
	<%
			if((LineCnt)%10==0 ) {	
			
			%>
			
			<button type="button" value="next" onClick="location.href='jspPractice.jsp?from=<%=LineCnt+10%>&cnt=<%=cnt%>'">
				next
			</button>
			
			<%
			break;
			}
			
		LineCnt++;
	}
	%>
		</table>
		
		
	</BODY>
</HTML>