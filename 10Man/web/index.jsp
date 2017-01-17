<%@page import="viewpresenter.PresenterGeneral"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%
    PresenterGeneral pg = new PresenterGeneral();
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <% out.print(pg.getMandatory()); %>
        <title>10 Man GG</title>
    </head>
    <body>
        <%
            String errorMessage = (String)session.getAttribute("errorMessage");
            if (errorMessage != null)
            {
                out.print(pg.jsMessage(errorMessage));
            }
        %>
        
        <div class="container">
            <div class="container-fluid">
                <h1>Create A New Match</h1>
                <form action="Front" method="POST">
                    <p>Player Names(Excluding Captains):<p>
                        <textarea name="playerNames" rows="6" cols="35" placeholder="One name on each line"></textarea><br>
                    <p style="color: red;">Captain A's Name:<p>
                    <input type="text" name="captainA" value=""/><br>
                    <p style="color: blue;">Captain B's Name:<p>
                    <input type="text" name="captainB" value=""/><br>
                    <input type="hidden" name="method" value="createMatch"/>
                    <br><button type="submit" class="btn btn-warning btn-lg">Create Match</button>
                </form>
            </div>
        </div>
    </body>
</html>
