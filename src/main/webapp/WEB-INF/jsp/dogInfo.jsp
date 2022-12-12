<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<h1>Dog Info For ${dog.name}</h1>

<p>${dog.name} has Id number ${dog.id}. He is a ${dog.age} years old ${dog.breed}. He attends our daycare between ${dog.startDate} to ${dog.endDate}</p>