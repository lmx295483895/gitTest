<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <script type="text/javascript" src="js/jquery-3.4.1.min.js"></script>
  </head>
  <body>
    <button id="btn">Click</button>
    <script type="text/javascript">
      $("#btn").click(function (){
        $.ajax({
          url : "one",
          data : "",
          type : "get",
          dataType : "json",
          success : function (resp){
            alert(resp.name);
            alert(resp.age);
          }
        })
      })
    </script>
  </body>
</html>
