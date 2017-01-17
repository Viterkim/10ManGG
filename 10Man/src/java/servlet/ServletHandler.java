package servlet;

import control.Controller;
import entity.Player;
import entity.PlayerOverview;
import exception.GeneralException;
import java.io.IOException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

public class ServletHandler        
{
    HttpServletRequest request;
    HttpServletResponse response;
    Controller control;
    
    public ServletHandler(HttpServletRequest request, HttpServletResponse response) 
    {
        this.request = request;
        this.response = response;
        try
        {
            this.control = new Controller();
        }
        catch(GeneralException ge)
        {
            alertError(ge.getMessage());
        }
    }
    
    public PlayerOverview getPlayerOverviewFromTextArea() throws IOException
    {
        PlayerOverview pov = new PlayerOverview();
        String text = (String) request.getParameter("playerNames");
        String arr[] = text.split("\n");
        int matchId = 1;
        try
        {
            for(String s:arr)
            {
                Player p = control.addPlayer(s, matchId);
                pov.addPlayer(p);
            }
        }
        catch(GeneralException ge)
        {
            handleError(ge.getMessage());
        }
        return pov;
    }
    
    public void handleError(String message) throws IOException
    {
        request.getSession().invalidate();
        alertError(message);
        response.sendRedirect("index.jsp");
    }
    
    public void alertError(String message)
    {
        request.getSession().setAttribute("errorMessage", message);
    }
}
