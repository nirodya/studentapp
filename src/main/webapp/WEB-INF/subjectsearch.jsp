
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<%@taglib uri="/WEB-INF/tlds/studenttags.tld" prefix="niro" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<niro:retrievesubjects/>
<niro:openHibSession/>
<h5 style="width: 100%;text-align: center;">1<sup>st</sup> Year</h5>
<table class="table table-striped table-bordered">
    <c:forEach items="${subjects}" var="subject" begin="0" end="${fn:length(subjects)}">
        <c:if test="${subject.year.idyear==1}" >
            <tr>
                <td>${subject.subject}</td>
            </tr>
        </c:if>
    </c:forEach>
</table>
<h5 style="width: 100%;text-align: center;">2<sup>nd</sup> Year</h5>
<table class="table table-striped table-bordered">
    <c:forEach items="${subjects}" var="subject" begin="0" end="${fn:length(subjects)}">
        <c:if test="${subject.year.idyear==2}" >
            <tr>
                <td>${subject.subject}</td>
            </tr>
        </c:if>
    </c:forEach>
</table>
<h5 style="width: 100%;text-align: center;">3<sup>rd</sup> Year</h5>
<table class="table table-striped table-bordered">
    <c:forEach items="${subjects}" var="subject" begin="0" end="${fn:length(subjects)}">
        <c:if test="${subject.year.idyear==3}" >
            <tr>
                <td>${subject.subject}</td>
            </tr>
        </c:if>
    </c:forEach>
</table>
<niro:closehibsession session="${hibsession}"/>