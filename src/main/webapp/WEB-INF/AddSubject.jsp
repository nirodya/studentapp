<%-- 
    Document   : AddSubject
    Created on : Apr 19, 2016, 4:01:38 AM
    Author     : Nirodya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/bootstrap.min.css" />
        <link rel="stylesheet" href="css/site.min.css" />
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.2/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/site.min.js"></script>
        <title>Add Subject</title>
    </head>
    <body>
        <h1 style="width: 100; text-align: center">Add Subjects</h1>
        <div class="container-fluid">
            <div role="form" class="well" >
                <div class="form-group">
                    <label for="name">Year</label>
                    <select name="year" id="year" class="form-control">
                        <option value="1" class="selecter-options">Year 1</option>
                        <option value="2" class="selecter-options">Year 2</option>
                        <option value="3" class="selecter-options">Year 3</option>
                    </select>
                </div>
                <div class="form-group">
                    <label for="subject">Add Subject :</label>
                    <input name="subject" id="subject" class="form-control" type="text"/>
                </div>
                <button id="subjectbutton" type="submit" class="btn btn-info">Save</button>
            </div>
            <div><h4 id="success"></h4></div>
            <div id="subjectlist" class="table-responsive">
                <table class="table">

                </table>
            </div>
        </div>
        <script>
            $(document).ready(function () {
                $('#subjectbutton').click(function () {
                    $.ajax({url: "SaveSubject?yid="+$("#year").val()+"&subject="+$("#subject").val(), success: function (result) {
                        $("#success").html(result);
                        $("#subject").val("");
                        $.ajax({url: "subjectsearch.niro", success: function (result) {
                        $("#subjectlist").html(result);
                    }});
                    }});
                });
                $.ajax({url: "subjectsearch.niro", success: function (result) {
                        $("#subjectlist").html(result);
                    }});
            });
        </script>
    </body>
</html>