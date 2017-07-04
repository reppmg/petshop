<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <!-- ExtJS css -->
    <link rel="stylesheet" type="text/css" href="resources/ext-3.1.1/resources/css/ext-all.css" />

    <!-- Row Editor plugin css -->
    <link rel="stylesheet" type="text/css" href="resources/ext-3.1.1/examples/ux/css/rowEditorCustom.css" />
    <link rel="stylesheet" type="text/css" href="resources/ext-3.1.1/examples/shared/examples.css" />
    <link rel="stylesheet" type="text/css" href="resources/ext-3.1.1/examples/ux/css/RowEditor.css" />

    <!-- App custom css -->
    <link rel="stylesheet" type="text/css" href="resources/css/crudgrid.css" />

    <!-- ExtJS js -->
    <script src="resources/ext-3.1.1/adapter/ext/ext-base.js"></script>
    <script src="resources/ext-3.1.1/ext-all.js"></script>

    <!-- Row Editor plugin js -->
    <script src="resources/ext-3.1.1/examples/ux/RowEditor.js"></script>

    <!-- Excel DataGrid drag and drop plugin js -->
    <script src="resources/js/datadrop-plugin/Override.js"></script>
    <script src="resources/js/datadrop-plugin/Ext.ux.DataDrop.js"></script>

    <script type="text/javascript" src="resources/js/crud-grid.js"></script>
    <script type="text/javascript">
        Ext.onReady(function() {
            Ext.MessageBox.alert('Мой заголовок','Модель DOM готова...');
        });
    </script>
</head>
<body>
<H1>Name: ${name}</H1>
<H1>Message: ${type}</H1>
<H1>Message: ${birthdate}</H1>
</body>
</html>
