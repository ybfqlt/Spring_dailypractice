<%--
  Created by IntelliJ IDEA.
  User: ltt
  Date: 19-4-21
  Time: 下午11:14
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<html>
    <head>
        <title>Spitter</title>
        <link rel="stylesheet" type="text/css" href="<c:url value="/resources/style.css" />">
    </head>
    <body>
        <div class =spittleForm">
            <h1>Spit it out</h1>
            <from method="POST", name="spittleFrom">
                <input type="hidden" name="latitude">
                <input type="hidden" name="longitude">
                <textarea name="submit" value="Add" />
            </from>
        </div>
    <div class="listTitle">
        <h1>Recent Spittles</h1>
        <ul class="spittleList">
            <c:forEach items="${spittleList}" var="spittle"></c:forEach>
        </ul>
    </div>
    </body>
</html>