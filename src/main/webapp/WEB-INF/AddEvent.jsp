<%-- 
    Document   : AddEvent
    Created on : Apr 18, 2016, 6:59:13 AM
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
        <title>Add Event</title>
    </head>
    <body>
        <h1 style="width: 100; text-align: center">Add an Event</h1>
        <div class="container-fluid">
            <form role="form" class="well" method="post" action="SaveEvent">
                <div class="form-group">
                    <label for="name">Event Name :</label>
                    <input type="text" class="form-control" name="name" id="name">
                </div>
                <div class="form-group">
                    <label for="desc">Event Description:</label>
                    <textarea id="desc" name="desc" class="form-control"></textarea>
                </div>
                <button type="submit" class="btn btn-info">Submit</button>
            </form>
        </div>
    </body>
</html>