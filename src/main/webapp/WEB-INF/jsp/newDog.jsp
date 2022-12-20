<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style>
    ul {
      list-style-type: none;
      margin: 0;
      padding: 2%;
      border: 1px solid #e7e7e7;
      background-color: #f3f3f3;
      position: fixed;
      top: 0;
      width: 100%;
    }
    li {
      padding-left: 10%;
      font-size: large;
      display: inline;
    }
    .active {
      background-color: grey;
    }
    li a:hover {
      background-color: grey;
    }
    h1 {
        font-size: large%;
        padding-left: 40%;
        padding-top: 5%;
        }

    input[type=text] {
      width: 100%;
      padding: 12px 20px;
      margin: 8px 0;
      display: inline-block;
      border: 1px solid #ccc;
      border-radius: 4px;
      box-sizing: border-box;
    }

    input[type=submit] {
      width: 100%;
      background-color: #4CAF50;
      color: white;
      padding: 14px 20px;
      margin: 8px 0;
      border: none;
      border-radius: 4px;
      cursor: pointer;
    }
    .frame {
      margin-left: 15%;
      width: 70%;
      border-radius: 5px;
      background-color: #f2f2f2;
      padding: 20px;
    }
</style>
</head>
<body>
    <ul>
      <li><a href="/home">Home</a></li>
      <li><a href="/dogs/list">Registered Dogs</a></li>
      <li><a href="/dogs/dog/{name}">Detailed Dog Info</a></li>
      <li><a href="/dogs/new-dog">Add A New Dog</a></li>
    </ul>
    <h1>New Dog Registration</h1>
    <div class="frame">
        <form:form modelAttribute="form">
            <form:errors path="" element="div" />
            <div>
                <form:label path="name">Name</form:label>
                <form:input path="name" />
                <form:errors path="name" />
            </div>

            <div>
                <form:label path="breed">Breed</form:label>
                <form:input path="breed" />
                <form:errors path="breed" />
            </div>

            <div>
                <form:label path="age">Age</form:label>
                <form:input path="age" />
                <form:errors path="age" />
            </div>

            <div>
                <form:label path="startDate">Start Name</form:label>
                <form:input path="startDate" />
                <form:errors path="startDate" />
            </div>

            <div>
                <form:label path="endDate">End Date</form:label>
                <form:input path="endDate" />
                <form:errors path="endDate" />
            </div>

            <div>
                <input type="submit" />
            </div>
        </form:form>
    </div>
</body>
</html>