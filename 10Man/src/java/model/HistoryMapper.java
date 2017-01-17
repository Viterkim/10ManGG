
package model;

import db.DBConnection;
import exception.GeneralException;
import java.sql.Connection;


public class HistoryMapper {
    private Connection con;

    public HistoryMapper() throws GeneralException 
    {
        try
        {
            this.con = DBConnection.getConnection();
        }
        catch(Exception e)
        {
            throw new GeneralException("Can't connect do database");
        }
    }
    
    
}
