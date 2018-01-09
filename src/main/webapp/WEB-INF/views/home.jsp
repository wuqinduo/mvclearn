<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false" contentType="text/html; charset=UTF-8" %>
<html lang="ZH">
<head>
<meta charset="UTF-8">
<title>Home</title>


<link href="https://cdn.bootcss.com/element-ui/1.1.2/theme-default/index.css" rel="stylesheet">
<script src="https://cdn.bootcss.com/element-ui/1.1.2/index.js"></script>
<script src="https://cdn.bootcss.com/vue/2.1.8/vue.min.js"></script>



</head>
<body>
        <!--这是我们的View-->
        <div id="app">
            {{ message }}
        </div>
<script>
        // 这是我们的Model
        var exampleData = {
            message: 'Hello World!'
        }

        // 创建一个 Vue 实例或 "ViewModel"
        // 它连接 View 与 Model
        new Vue({
            el: '#app',
            data: exampleData
        })
    </script>
</body>
</html>
