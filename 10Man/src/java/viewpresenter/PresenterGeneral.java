
package viewpresenter;


public class PresenterGeneral
{
    public String getMandatory()
    {
        return " <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\">\n" +
"        <link href=\"css.css\" rel=\"stylesheet\" type=\"text/css\"/>\n" +
"        <link rel=\"stylesheet\" href=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n" +
"        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\n" +
"        <script src=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n" +
"        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/clipboard.js/1.5.12/clipboard.min.js\"></script>";
    }
    
    public String jsMessage(String message)
    {
        return "<script>alert(\"" + message + "\");</script>";
    }
}
