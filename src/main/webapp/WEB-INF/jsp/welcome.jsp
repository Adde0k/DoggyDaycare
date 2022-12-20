<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
                padding-left: 15%;
                padding-top: 10%;
                }
    </style>
</head>
<body>
    <ul>
      <li><a href="/home">Home</a></li>
      <li><a href="/dogs/list">Registered Dogs</a></li>
      <li><a href="dogs/dog/{name}">Detailed Dog Info</a></li>
      <li><a href="/dogs/new-dog">Add A New Dog</a></li>
    </ul>
    <h1>Welcome to our DoggyDaycare, where your dogs are well taken care of!</h1>
</body>
</html>
