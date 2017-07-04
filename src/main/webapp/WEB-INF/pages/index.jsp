<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <!-- ExtJS css -->
    <link rel="stylesheet" type="text/css" href="resources/ext-3.4.0/resources/css/ext-all.css"/>
    <link rel="stylesheet" type="text/css" href="resources/ext-3.4.0/examples/shared/examples.css"/>

    <!-- App custom css -->
    <link rel="stylesheet" type="text/css" href="resources/css/crudgrid.css"/>

    <!-- ExtJS js -->
    <script src="resources/ext-3.4.0/adapter/ext/ext-base.js"></script>
    <script src="resources/ext-3.4.0/ext-all.js"></script>

    <!-- App custom js -->
    <script type="text/javascript" src="resources/js/pets-grid.js"></script>
</head>
<body>
<h2>Pet Expo DB</h2>

<p>База для выставки животных содержит две таблицы: питомцев и их владельцев.</p>
<div id="crud-grid"></div>
<div id="pet-grid"></div>
</body>
</html>
