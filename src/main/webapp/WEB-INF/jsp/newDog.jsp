<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<body>
    <h1>New Dog Registration</h1>

    <form:form modelAttribute="form">
        <form:errors path="" element="div" />
        <div>
            <form:label path="name">Name</form:label>
            <form:input path="name" />
            <form:errors path="name" />
        </div>

        <div>
            <form:label path="breed">Name</form:label>
            <form:input path="breed" />
            <form:errors path="breed" />
        </div>

        <div>
            <form:label path="age">Name</form:label>
            <form:input path="age" />
            <form:errors path="age" />
        </div>

        <div>
            <form:label path="startDate">Name</form:label>
            <form:input path="startDate" />
            <form:errors path="startDate" />
        </div>

        <div>
            <form:label path="endDate">Name</form:label>
            <form:input path="endDate" />
            <form:errors path="endDate" />
        </div>

        <div>
            <input type="submit" />
        </div>
    </form:form>
</body>
</html>
