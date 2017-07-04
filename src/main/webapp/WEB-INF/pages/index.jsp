<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <!-- ExtJS css -->
    <link rel="stylesheet" type="text/css" href="resources/ext-3.4.0/resources/css/ext-all.css"/>

    <!-- Row Editor plugin css -->
    <link rel="stylesheet" type="text/css" href="resources/ext-3.4.0/examples/ux/css/rowEditorCustom.css"/>
    <link rel="stylesheet" type="text/css" href="resources/ext-3.4.0/examples/shared/examples.css"/>
    <link rel="stylesheet" type="text/css" href="resources/ext-3.4.0/examples/ux/css/RowEditor.css"/>

    <!-- App custom css -->
    <link rel="stylesheet" type="text/css" href="resources/css/crudgrid.css"/>

    <!-- ExtJS js -->
    <script src="resources/ext-3.4.0/adapter/ext/ext-base.js"></script>
    <script src="resources/ext-3.4.0/ext-all.js"></script>

    <!-- Row Editor plugin js -->
    <script src="resources/ext-3.4.0/examples/ux/RowEditor.js"></script>

    <!-- Excel DataGrid drag and drop plugin js -->
    <script src="resources/js/datadrop-plugin/Override.js"></script>
    <script src="resources/js/datadrop-plugin/Ext.ux.DataDrop.js"></script>

    <script type="text/javascript" src="resources/js/crud-grid.js"></script>
</head>
<body>
<h2>Pet Expo DB</h2>

<p>База для выставки животных содержит две таблицы: питомцев и их владельцев.</p>
<div id="crud-grid"></div>
<div id="pet-grid"></div>
</body>
</html>
