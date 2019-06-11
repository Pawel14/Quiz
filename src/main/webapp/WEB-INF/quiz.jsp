<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Pawel
  Date: 2019-03-30
  Time: 23:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>quiz</title>

</head>
<body>

<c:forEach var="question" items="${q}">


    <div class="question"></div>
    <p><strong>${question.getId()}.
            ${question.getContent()}</p></strong>

    <%--<label> <input type="radio" name="title" value="a"/>${question.getAnswer1()}--%>

    <input type="checkbox" value="1" name="a"/>${question.getAnswer1()}
    <%--<label> <input type="radio" name="title" value="b"/>${question.getAnswer2()}--%>
    </label>
    <input type="checkbox" value="2" name="b"/>${question.getAnswer2()}

    <%--<label> <input type="radio" name="title" value="c"/>${question.getAnswer3()}--%>
    </label>
    <input type="checkbox" value="3" name="c"/>${question.getAnswer3()}


    </form>
</c:forEach>

<br>


</body>
</html>