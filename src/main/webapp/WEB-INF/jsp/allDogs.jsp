<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<h1>List of all dogs registered in our DoggyDaycare</h1>

<ul>
<c:forEach items="${dogs}" var="dog">
   <li>${dog}</li>
</c:forEach>
</ul>