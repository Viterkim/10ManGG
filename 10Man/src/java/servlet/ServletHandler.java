package servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletHandler        
{
    HttpServletRequest request;
    HttpServletResponse response;
    public ServletHandler(HttpServletRequest request, HttpServletResponse response) 
    {
        this.request = request;
        this.response = response;
    }
    
    public void alertError(String message)
    {
        
    }
}
