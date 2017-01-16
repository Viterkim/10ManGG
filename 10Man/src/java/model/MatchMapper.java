
package model;

import db.DBConnection;
import exception.GeneralException;
import java.sql.Connection;

//Hejsa
public class MatchMapper {
    
    private Connection con;
    
        public MatchMapper() throws GeneralException {
        try{
            this.con = DBConnection.getConnection();
        }
        catch(Exception e){
            throw new GeneralException("Can't connect do database");
        }
    }
}
