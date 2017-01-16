
package model;

import db.DBConnection;
import exception.GeneralException;
import java.sql.Connection;


public class PlayerMapper {
    private Connection con;
    
        public PlayerMapper() throws GeneralException {
        try{
            this.con = DBConnection.getConnection();
        }
        catch(Exception e){
            throw new GeneralException("Can't connect do database");
        }
    }
}
